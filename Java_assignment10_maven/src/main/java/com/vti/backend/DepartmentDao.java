package com.vti.backend;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.vti.entity.Department;
import com.vti.testing.ScannerUtils;

public class DepartmentDao {
	private Connection connection;
	private List<Department> departments;
	public Properties databaseproperties;
	public Properties messagePoperties;
	
	public DepartmentDao() throws FileNotFoundException, IOException {
		departments = new ArrayList<Department>();
		databaseproperties = new Properties();
		databaseproperties.load(new FileInputStream("src/main/resource/database.properties"));
		messagePoperties = new Properties();
		messagePoperties.load(new FileInputStream("src/main/resource/message.properties"));
		
	}

	//Method connect database
	private Connection connect() throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
	

		String url = databaseproperties.getProperty("url2");
		String username = databaseproperties.getProperty("username");
		String password = databaseproperties.getProperty("password");

		// Step 1* register the driver class with DriverManager
		Class.forName(databaseproperties.getProperty("driver"));

		// Step 2: get a Database Connection
		connection = DriverManager.getConnection(url, username, password);

		System.out.println("Connect success!");
		return connection;

	}

//Method get Department
	public List<Department> getDepartments() throws SQLException, FileNotFoundException, ClassNotFoundException, IOException {
		if(connection == null || connection.isClosed()) {
			connect();
		}
		// Create a statement object
		String sql = "SELECT * FROM 	departments";
		Statement statement = connection.createStatement();
		// execute query
		ResultSet resultSet = statement.executeQuery(sql);
		// Step 5: handling result set
		while (resultSet.next()) {
			Department department = new Department();
			department.setId(resultSet.getString("dept_no"));
			department.setName(resultSet.getString("dept_name"));
			
			departments.add(department);

		}
		return departments;
	}

	// Method get department by id
	public List<Department> getDepartmentByID() throws Exception {
		
		// Create a statement object
		String sql = "SELECT * FROM 	departments WHERE dept_no = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		// input scanner
		System.out.println("Hay nhap department ID muon tim (Ex:d001)");
		String id = ScannerUtils.inputString();
		preparedStatement.setString(1, id);
		// Step 4: execute query
		ResultSet resultSet = preparedStatement.executeQuery();
		// Step 5: handling result set
		while (resultSet.next()) {
			Department department = new Department();
			department.setId(resultSet.getString("dept_no"));
			department.setName(resultSet.getString("dept_name"));
			departments.add(department);

		}

		if (departments.isEmpty()) {
			throw new Exception(messagePoperties.getProperty("no.deparmentId") + id);
		}
		return departments;
	}

	public boolean isDepartmentNameExists(String name) throws SQLException {
		// Create a statement object
		String sql = "SELECT * FROM 	departments WHERE dept_name = ?";
		Statement statement = connection.createStatement();

		// Step 4: execute query
		ResultSet resultSet = statement.executeQuery(sql);

		// Step 5: handling result set
		if (resultSet.next()) {
			return true;
		} else
			return false;

	}

	public boolean isDepartmentIdExists(String id) throws SQLException {
		// Create a statement object
		String sql = "SELECT * FROM 	departments WHERE dept_no = ?";
		Statement statement = connection.createStatement();

		// Step 4: execute query
		ResultSet resultSet = statement.executeQuery(sql);

		// Step 5: handling result set
		if (resultSet.next()) {
			return true;
		} else
			return false;

	}

	public void createDepartment(String id, String name) throws Exception {
		// check name exist
		if (isDepartmentNameExists(name)) {
			throw new Exception(messagePoperties.getProperty("yes.departmentName") + name);
		} else {
			// if not exist
			// Create a statement object
			String sql = "	INSERT INTO departments (dept_no ,	dept_name	)"
					+ "	VALUE				(	? 	,		?		)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			// input scanner

			preparedStatement.setString(1, id);
			preparedStatement.setString(2, name);

			// Step 4: execute query
			int effectedRecordAmount = preparedStatement.executeUpdate();
			System.out.println("Effected Record Amount: " + effectedRecordAmount);
		}
	}

	public void updateDepartment(String id, String name) throws SQLException, Exception {

		// check department id exist
		if (!isDepartmentIdExists(id)) {
			throw new Exception(messagePoperties.getProperty("no.deparmentId") + id);
		}
		// check department name exist
		if (isDepartmentNameExists(name)) {
			throw new Exception(messagePoperties.getProperty("yes.departmentName") + name);
		}
		// if department name not exist update

		// Create a statement object
		String sql = "	UPDATE departments SET dept_name = ? WHERE dept_no = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);

		// input scanner
		preparedStatement.setString(1, name);
		preparedStatement.setString(2, id);

		// Step 4: execute query
		int effectedRecordAmount = preparedStatement.executeUpdate();
		System.out.println("Effected Record Amount: " + effectedRecordAmount);
	}

	public void deleteDepartment(String id) throws SQLException, Exception {

		// check department id exist
		if (!isDepartmentIdExists(id)) {
			throw new Exception(messagePoperties.getProperty("no.deparmentId") + id);
		}
		// Create a statement object
		String sql = "	DELETE FROM departments WHERE dept_no = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		// input scanner
		preparedStatement.setString(1, id);
		// Step 4: execute query
		int effectedRecordAmount = preparedStatement.executeUpdate();
		System.out.println("Effected Record Amount: " + effectedRecordAmount);

	}

	// Call Procedure
	public void deleteDepartmentUsingProcedure(String id) throws SQLException, Exception {

		// check department id exist
		if (!isDepartmentIdExists(id)) {
			throw new Exception(messagePoperties.getProperty("no.deparmentId") + id);
		}
		// Create a statement object
		String sql = "{CALL sp_delete_department(?)}";
		CallableStatement callabeStatement = connection.prepareCall(sql);
		// set parameter
		callabeStatement.setString(1, id);
		// execute query
		int effectedRecordAmount = callabeStatement.executeUpdate();
		System.out.println("Effected Record Amount: " + effectedRecordAmount);
	}

	// Transaction
	public void deleteDepartmentTransaction(String id) throws SQLException, Exception {

		// check department id exist
		if (!isDepartmentIdExists(id)) {
			throw new Exception(messagePoperties.getProperty("no.deparmentId") + id);
		}
		// turn off auto commit
		connection.setAutoCommit(false);
		// delete employees
		String sql1 = "	DELETE FROM dept_emp WHERE dept_no = ?";
		PreparedStatement preparedStatement1 = connection.prepareStatement(sql1);
		preparedStatement1.setString(1, id);
		// delete department
		String sql2 = "	DELETE FROM departments WHERE dept_no = ?";
		PreparedStatement preparedStatement2 = connection.prepareStatement(sql2);
		// input scanner
		preparedStatement2.setString(1, id);
		// excute query
		try {
			int effectedRecordAmount1 = preparedStatement1.executeUpdate();
			int effectedRecordAmount2 = preparedStatement2.executeUpdate();
			// commit transaction
			connection.commit();
			System.out.println("Transaction Commit!");
			System.out.println("Effected Record Amount: " + effectedRecordAmount1);
			System.out.println("Effected Record Amount: " + effectedRecordAmount2);
		} catch (Exception e) {
			e.printStackTrace();
			connection.rollback();
			System.out.println("Transaction Rollback!");
		}
		// turn on auto commit
		connection.setAutoCommit(true);
	}
}
