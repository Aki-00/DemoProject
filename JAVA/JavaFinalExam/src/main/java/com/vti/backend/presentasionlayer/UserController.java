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
import com.vti.backend.businesslayer.UserService;
import com.vti.entity.ProjectName;

/**
 * This class is UserPresentation entity.
 * 
 * @Description: .
 * @author: Bich.NTT
 * @create_date:May 31, 2020
 * @version: 1.0
 * @modifer: Bich.NTT
 * @modifer_date: May 31, 2020
 */
public class UserController implements IUserService {
	private IUserService userService;
	private com.vti.ultist.MessageProperties messageProperties;

	/**
	 * Constructor for class UserController
	 * 
	 * @Description: .
	 * @author: Bich.NTN
	 * @create_date: May 31, 2020
	 * @version: 1.0
	 * @throws IOException
	 * @modifer: Bich.NTN
	 * @modifer_date: May 31, 2020
	 */
	public UserController() throws IOException {
		messageProperties = new com.vti.ultist.MessageProperties();
	}

	/*
	 * @see com.vti.backend.businesslayer.IUserService#getPassWord(java.lang.String)
	 */
	public String getPassWord(String email)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		userService = new UserService();
		return userService.getPassWord(email);
	}

	/*
	 * @see com.vti.backend.businesslayer.IUserService#isUserExist(java.lang.String)
	 */
	public boolean isUserExist(String email)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		userService = new UserService();
		return userService.isUserExist(email);
	}

	/*
	 * @see com.vti.backend.businesslayer.IUserService#login(java.lang.String,
	 * java.lang.String)
	 */
	public void login(String email, String passWord) throws Exception {
		if (!emailValid(email)) {
			throw new Exception(messageProperties.getProperty("email.false"));
		}
		if (!isUserExist(email)) {
			throw new Exception(messageProperties.getProperty("user.notexist"));
		}
		if (!passWordValid(passWord)) {
			throw new Exception(messageProperties.getProperty("password.notexist"));
		}
		userService = new UserService();
		userService.login(email, passWord);
	}

//	public void managerRegister(String firstName, String lastName, String phone, String email, byte expInYear,
//			String passWord) throws Exception {
//		if (isUserExist(email)) {
//			throw new Exception(messageProperties.getProperty("user.exist"));
//		}
//		if (phone.length() < 9 || phone.length() > 12) {
//			throw new Exception(messageProperties.getProperty("phone.false"));
//		}
//		if (!emailValid(email)) {
//			throw new Exception(messageProperties.getProperty("email.false"));
//		}
//		if (expInYear < 0 || expInYear > 20) {
//			throw new Exception(messageProperties.getProperty("ExpIntYear.false"));
//		}
//		userService = new ManagerService();
//		userService.managerRegister(firstName, lastName, phone, email, expInYear, passWord);
//	}

	/*
	 * @see com.vti.backend.businesslayer.IUserService#register(java.lang.String,
	 * java.lang.String, java.lang.String, java.lang.String,
	 * com.vti.entity.ProjectName, java.lang.String, java.lang.String)
	 */
//	public void employeeRegister(String firstName, String lastName, String phone, String email, ProjectName projectName,
//			String proSkill, String passWord) throws Exception {
//		if (isUserExist(email)) {
//			throw new Exception(messageProperties.getProperty("user.exist"));
//		}
//		if (phone.length() < 9 || phone.length() > 12) {
//			throw new Exception(messageProperties.getProperty("phone.false"));
//		}
//		if (!emailValid(email)) {
//			throw new Exception(messageProperties.getProperty("email.false"));
//		}
//		userService = new EmployeeService();
//		userService.employeeRegister(firstName, lastName, phone, email, projectName, proSkill, passWord);
//	}

	public boolean emailValid(String email) {
		String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		return email.matches(EMAIL_REGEX);
	}

	public boolean passWordValid(String passWord) {
		byte countCapital = 0;
		for (int i = 0; i < passWord.length(); i++) {
			if (Character.isUpperCase(passWord.charAt(i))) {
				countCapital = 1;
			}
		}
		if (passWord.length() < 6 || passWord.length() > 12) {
			return false;
		} else if (countCapital < 1) {
			return false;
		} else {
			return true;
		}

	}

	/*
		 * @see com.vti.backend.businesslayer.IUserService#register()
		 */
	
	
	public void register() {
		
	}
	
	public void register(String firstName, String lastName, String phone, String email, byte expInYear,
			String passWord) throws Exception {
		if (isUserExist(email)) {
			throw new Exception(messageProperties.getProperty("user.exist"));
		}
		if (phone.length() < 9 || phone.length() > 12) {
			throw new Exception(messageProperties.getProperty("phone.false"));
		}
		if (!emailValid(email)) {
			throw new Exception(messageProperties.getProperty("email.false"));
		}
		if (expInYear < 0 || expInYear > 20) {
			throw new Exception(messageProperties.getProperty("ExpIntYear.false"));
		}
		userService = new ManagerService();
		userService.register();
	}
	
//	public void register(String firstName, String lastName, String phone, String email, ProjectName projectName,
//			String proSkill, String passWord) throws Exception {
//		if (isUserExist(email)) {
//			throw new Exception(messageProperties.getProperty("user.exist"));
//		}
//		if (phone.length() < 9 || phone.length() > 12) {
//			throw new Exception(messageProperties.getProperty("phone.false"));
//		}
//		if (!emailValid(email)) {
//			throw new Exception(messageProperties.getProperty("email.false"));
//		}
//		userService = new EmployeeService();
//		userService.employeeRegister(firstName, lastName, phone, email, projectName, proSkill, passWord);
//	}
	
}
