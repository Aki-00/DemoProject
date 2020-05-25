package com.vti.frontend;

import java.sql.SQLException;
import java.util.List;

import com.vti.backend.presentationlayer.UserController;
import com.vti.entity.User;

public class Program {
	public static void main(String[] args) throws ClassNotFoundException,
			SQLException {
//		GroupController controller = new GroupController();
//		List<Group> groups = controller.getListGroups();
//
//		for (Group group : groups) {
//			System.out.println(group);
//		}
		
		UserController controller1 = new UserController();
		List<User> users = controller1.getListUsers();

		for (User user : users) {
			System.out.println(user);
		}
		
		controller1.createUser("AAA");
	}
}
