/**
 * 
 */
package com.vti.DemoProject.backend.datalayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.vti.DemoProject.ultis.JdbcUtils;

/**
 * This class is UserRespority entity.
 * 
 * @Description: .
 * @author: Bich.NTT
 * @create_date:Jun 18, 2020
 * @version: 1.0
 * @modifer: Bich.NTT
 * @modifer_date: Jun 18, 2020
 */
public class UserRespority {
	private com.vti.DemoProject.ultis.JdbcUtils jdbcUtils;
	
	public UserRespority() throws IOException {
		jdbcUtils = new JdbcUtils();
	}
	
	public boolean login (String username, String password) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		Connection connection = jdbcUtils.connect();

		// Create a statement object
		String sql = "SELECT 1 FROM `User` WHERE username = ? AND password = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);

		// set parameter
		preparedStatement.setString(1, username);
		preparedStatement.setString(2, password);

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
}

