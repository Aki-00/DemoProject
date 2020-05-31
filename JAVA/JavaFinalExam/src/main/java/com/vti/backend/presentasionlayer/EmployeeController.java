/**
 * 
 */
package com.vti.backend.presentasionlayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.vti.backend.businesslayer.EmployeeService;
import com.vti.backend.businesslayer.IUserService;
import com.vti.backend.businesslayer.ManagerService;
import com.vti.entity.ProjectName;

/**
 * This class is EmployeeController entity.
 * 
 * @Description: .
 * @author: Bich.NTT
 * @create_date:May 31, 2020
 * @version: 1.0
 * @modifer: Bich.NTT
 * @modifer_date: May 31, 2020
 */
public class EmployeeController extends UserController {
	private IUserService employeeService;
	private com.vti.ultist.MessageProperties messageProperties;

	/**
	 * Constructor for class EmployeeController
	 * 
	 * @Description: .
	 * @author: Bich.NTN
	 * @create_date: May 31, 2020
	 * @version: 1.0
	 * @modifer: Bich.NTN
	 * @modifer_date: May 31, 2020
	 */
	public EmployeeController() throws IOException {
		employeeService = new EmployeeService();
		messageProperties = new com.vti.ultist.MessageProperties();
	}

	/*
	 * @see com.vti.backend.presentasionlayer.UserController#getPassWord(java.lang.
	 * String)
	 */
	@Override
	public String getPassWord(String email)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		return employeeService.getPassWord(email);
	}

	/*
	 * @see com.vti.backend.presentasionlayer.UserController#isUserExist(java.lang.
	 * String)
	 */
	@Override
	public boolean isUserExist(String email)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		return employeeService.isUserExist(email);
	}

	/*
	 * @see com.vti.backend.presentasionlayer.UserController#register()
	 */

//	public void register(String firstName, String lastName, String phone, String email, ProjectName projectName,
//			String proSkill, String passWord) throws Exception {
//		
//		if (isUserExist(email)) {
//			throw new Exception(messageProperties.getProperty("phone.false"));
//		}
//		employeeService.register();
//	}

	/*
	 * @see com.vti.backend.presentasionlayer.UserController#login(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public void login(String email, String passWord) throws Exception {
		// TODO Auto-generated method stub
		super.login(email, passWord);
	}

}
