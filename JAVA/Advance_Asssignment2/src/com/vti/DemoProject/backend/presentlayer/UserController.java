/**
 * 
 */
package com.vti.DemoProject.backend.presentlayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.vti.DemoProject.backend.businesslayer.UserService;


/**
 * This class is UserController entity.
 * 
 * @Description: .
 * @author: Bich.NTT
 * @create_date:Jun 18, 2020
 * @version: 1.0
 * @modifer: Bich.NTT
 * @modifer_date: Jun 18, 2020
 */
public class UserController {
	private UserService service;
	
	public UserController() throws IOException {

		service = new UserService();
	}
	
	public boolean login (String username, String password) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		return  service.login(username, password);
	}
}
