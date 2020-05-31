/**
 * 
 */
package com.vti.backend.presentasionlayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.vti.backend.businesslayer.IUserService;
import com.vti.backend.businesslayer.ManagerService;
import com.vti.backend.businesslayer.UserService;

/**
 * This class is ManagerController entity.
 * 
 * @Description: .
 * @author: Bich.NTT
 * @create_date:May 31, 2020
 * @version: 1.0
 * @modifer: Bich.NTT
 * @modifer_date: May 31, 2020
 */
public class ManagerController extends UserController {
	private IUserService managerService;
	private com.vti.ultist.MessageProperties messageProperties;

	/**
	 * Constructor for class ManagerController
	 * 
	 * @Description: .
	 * @author: Bich.NTN
	 * @create_date: May 31, 2020
	 * @version: 1.0
	 * @modifer: Bich.NTN
	 * @modifer_date: May 31, 2020
	 */
	public ManagerController() throws IOException {
		managerService = new ManagerService();
		messageProperties = new com.vti.ultist.MessageProperties();
	}

	/*
	 * @see com.vti.backend.presentasionlayer.UserController#getPassWord(java.lang.
	 * String)
	 */
	@Override
	public String getPassWord(String email)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		return managerService.getPassWord(email);
	}

	/*
	 * @see com.vti.backend.presentasionlayer.UserController#isUserExist(java.lang.
	 * String)
	 */
	@Override
	public boolean isUserExist(String email)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		return managerService.isUserExist(email);
	}

	/*
	 * @see com.vti.backend.presentasionlayer.UserController#register()
	 */
	public void register(String firstName, String lastName, String phone, String email, byte expInYear, String passWord)
			throws Exception {
		if (isUserExist(email)) {
			throw new Exception(messageProperties.getProperty("user.exist"));
		}
		managerService.managerRegister(firstName, lastName, phone,  email,  expInYear,  passWord);
	}

	/*
	 * @see com.vti.backend.presentasionlayer.UserController#login(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public void login(String email, String passWord) throws Exception {

		super.login(email, passWord);
	}

}
