/**
 * 
 */
package com.vti.DemoProject.backend.businesslayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.vti.DemoProject.backend.datalayer.UserRespority;

/**
 * This class is UserService entity.
 * 
 * @Description: .
 * @author: Bich.NTT
 * @create_date:Jun 18, 2020
 * @version: 1.0
 * @modifer: Bich.NTT
 * @modifer_date: Jun 18, 2020
 */
public class UserService {
	private UserRespority repository;
	
	public UserService() throws IOException {
		repository = new UserRespority();
	}
	
	public boolean login (String username, String password) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		return  repository.login(username, password);
	}
}
