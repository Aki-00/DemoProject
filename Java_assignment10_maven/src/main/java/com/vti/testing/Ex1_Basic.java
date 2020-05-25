package com.vti.testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Ex1_Basic {
	public static void main(String[] args)
			throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
		Properties properties = new Properties();
		properties.load(new FileInputStream("src/main/resource/database.properties"));

		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");

		// Step 1* register the driver class with DriverManager
		Class.forName(properties.getProperty("driver"));

		// Step 2: get a Database Connection
		Connection connection = DriverManager.getConnection(url, username, password);

		System.out.println("Connect success!");

		// Step 3: Create a statement object
		// ----Q3. Method de tao group----
		String sql = "	INSERT INTO `Group` (`name` ,	`author_ID`	)"
				+ "	VALUE				(	? 	,		?		)";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);

		// input scanner
		System.out.println("Hay nhap vao ten group");
		String groupName = ScannerUtils.inputString();
		System.out.println("Hay nhap vao author id");
		int authorId = ScannerUtils.inputInt("Hay nhap vao mot so nguyen");

		preparedStatement.setString(1, groupName);
		preparedStatement.setInt(2, authorId);

		// Step 4: execute query
		int effectedRecordAmount = preparedStatement.executeUpdate();

		// Step 5: handling result set
		System.out.println("Effected Record Amount: " + effectedRecordAmount);

		// ---Q4. Update group------
		// Step 3: Create a statement object
		String sql1 = "	UPDATE `Group`" + "SET `name` =  ?" + "WHERE id = ?";
		PreparedStatement preparedStatement1 = connection.prepareStatement(sql1);
		preparedStatement1.setString(1, "Java6");
		preparedStatement1.setInt(2, 6);

		// Step 4: execute query
		int effectedRecordAmount1 = preparedStatement1.executeUpdate();

		// Step 5: handling result set
		System.out.println("Effected Record Amount: " + effectedRecordAmount1);

		// -----Q5. Delete group
		// Step 3: Create a statement object
		String sql2 = "	DELETE FROM `Group`" + "WHERE id = ?";
		PreparedStatement preparedStatement2 = connection.prepareStatement(sql2);
		// input scanner
		System.out.println("Hay nhap vao group id");
		int groupId = ScannerUtils.inputInt("Hay nhap vao mot so nguyen");
		preparedStatement2.setInt(1, groupId);
		// Step 4: execute query
		int effectedRecordAmount2 = preparedStatement2.executeUpdate();
		// Step 5: handling result set
		System.out.println("Effected Record Amount: " + effectedRecordAmount2);

	}
}
