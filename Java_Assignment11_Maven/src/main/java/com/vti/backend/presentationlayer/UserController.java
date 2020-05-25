package com.vti.backend.presentationlayer;

import java.sql.SQLException;
import java.util.List;

import com.vti.backend.businesslayer.IUserService;
import com.vti.backend.businesslayer.UserService;
import com.vti.entity.User;

public class UserController {
	
	private IUserService userService;

	public UserController() {
		userService = new UserService();
	}

	public List<User> getListUsers() throws ClassNotFoundException, SQLException {
		// validation TODO
		return userService.getListUsers();
	}
	
	public void createUser(String username) throws ClassNotFoundException, SQLException {
		userService.createUser(username);
	}
}
