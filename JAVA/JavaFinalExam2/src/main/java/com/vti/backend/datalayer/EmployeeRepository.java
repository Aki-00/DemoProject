/**
 * 
 */
package com.vti.backend.datalayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.vti.entity.ProjectName;
import com.vti.ultist.JdbcUtils;
import com.vti.ultist.MessageProperties;

/**
 * This class is EmployeeRepository entity.
 * 
 * @Description: .
 * @author: Bich.NTT
 * @create_date:May 30, 2020
 * @version: 1.0
 * @modifer: Bich.NTT
 * @modifer_date: May 30, 2020
 */
public class EmployeeRepository extends UserRepository {
	private JdbcUtils jdbcUtils = new JdbcUtils();
	private MessageProperties messageProperties = new MessageProperties();

	/**
	 * Constructor for class EmployeeRepository
	 * 
	 * @Description: .
	 * @author: Bich.NTN
	 * @create_date: May 31, 2020
	 * @version: 1.0
	 * @modifer: Bich.NTN
	 * @modifer_date: May 31, 2020
	 */
	public EmployeeRepository() throws IOException {
	}

	@Override
	public String getPassWord(String email)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		// get connection
		Connection connection = jdbcUtils.connect();
		// Create a statement object
		String sql = "SELECT `passWord` FROM Employee WHERE email = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);

		// set parameter
		preparedStatement.setString(1, email);

		// Step 4: execute query
		ResultSet resultSet = preparedStatement.executeQuery();

		// Step 5: handling result set
		if (resultSet.next()) {
			// disconnect
			jdbcUtils.disconnect();
			return resultSet.getString("passWord");

		} else {
			// disconnect
			jdbcUtils.disconnect();
			return null;
		}
	}

	@Override
	public boolean isUserExist(String email) throws ClassNotFoundException, SQLException, IOException {
		// get connection
		Connection connection = jdbcUtils.connect();
		// Create a statement object
		String sql = "SELECT 1 FROM Employee WHERE email = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);

		// set parameter
		preparedStatement.setString(1, email);

		// Step 4: execute query
		ResultSet resultSet = preparedStatement.executeQuery();

		// Step 5: handling result set
		if (resultSet.next()) {
			// disconnect
			jdbcUtils.disconnect();
			return true;

		} else {
			// disconnect
			jdbcUtils.disconnect();
			return false;
		}
	}

	/*
	 * @see com.vti.backend.datalayer.UserRepository#register()
	 */
	@Override
	public void register(String... infos) throws Exception {
		if (infos.length != 7) {
			throw new Exception("Information Error");
		}
		// handling parameter
		String firstName = infos[0];
		String lastName = infos[1];
		String phone = infos[2];
		String email = infos[3];
		ProjectName projectName = ProjectName.valueOf(infos[4]);
		String proSkill = infos[5];
		String passWord = infos[6];
		// get connection
		Connection connection = jdbcUtils.connect();
		// Create a statement object
		String sql = "INSERT INTO Employee (firstName, lastName, phone, email, projectName, proSkill, passWord)"
				+ "VALUE                   (   ? ,   	?   	,  ?,  	?,		?,				?,     ?	)";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);

		// set parameter
		preparedStatement.setString(1, firstName);
		preparedStatement.setString(2, lastName);
		preparedStatement.setString(3, phone);
		preparedStatement.setString(4, email);
		preparedStatement.setString(5, projectName.name());
		preparedStatement.setString(6, proSkill);
		preparedStatement.setString(7, passWord);

		// Step 4: execute query
		int check = preparedStatement.executeUpdate();

		// Check create success or false
		System.out.println(check > 0 ? messageProperties.getProperty("employee.insert.complete")
				: messageProperties.getProperty("employee.insert.false"));

		// disconnect
		jdbcUtils.disconnect();
	}

	/*
	 * @see com.vti.backend.datalayer.UserRepository#login(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public void login(String email, String passWord) throws Exception {
		// get registered password
		String savePassWord;
		// get connection
		Connection connection = jdbcUtils.connect();
		// Create a statement object
		String sql = "SELECT `passWord` FROM Employee WHERE email = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);

		// set parameter
		preparedStatement.setString(1, email);

		// Step 4: execute query
		ResultSet resultSet = preparedStatement.executeQuery();

		// Step 5: handling result set
		if (resultSet.next()) {
			savePassWord = resultSet.getString("passWord");
		} else {
			savePassWord = null;
		}
		// check password
		if (passWord.equals(savePassWord)) {
			System.out.println(messageProperties.getProperty("login.success"));
		} else {
			System.out.println(messageProperties.getProperty("login.false"));
		}
		jdbcUtils.disconnect();
	}
}
