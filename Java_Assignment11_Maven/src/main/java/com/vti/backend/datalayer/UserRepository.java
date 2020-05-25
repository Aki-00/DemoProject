package com.vti.backend.datalayer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.vti.entity.User;
import com.vti.utils.JDBCUtils;

public class UserRepository implements IUserRepository {

	private JDBCUtils jdbcUtils;

	public UserRepository() {
		jdbcUtils = new JDBCUtils();
	}

	public List<User> getListUsers() throws ClassNotFoundException,
			SQLException {

		List<User> users = new ArrayList<User>();

		// get connection
		Connection connection = jdbcUtils.getConnection();

		// Create a statement object
		String sql = "SELECT id, username FROM `User`";
		Statement statement = connection.createStatement();

		// execute query
		ResultSet resultSet = statement.executeQuery(sql);

		// handling result set
		while (resultSet.next()) {
			User user = new User(resultSet.getInt("id"),
					resultSet.getString("username"));

			users.add(user);

		}

		jdbcUtils.disconnect();

		return users;
	}

	public List<User> getUserByID(int id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	
public void createUser(String username) throws Exception {
	// get connection
			Connection connection = jdbcUtils.getConnection();

			if (username!=null || username.length()>20) {
				throw new Exception("Username it hon 20 ky tu");
			}
			String sql = "	INSERT INTO `User` (`username`)"
						+ "	VALUE				(	? 	)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setString(1, username);

			// Step 4: execute query
			preparedStatement.executeUpdate();
		}

	public void updateAccountByID(int id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	public void deleteAccount(int id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	public boolean isAccountExists(String username) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isAccountExists(int id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}




}

