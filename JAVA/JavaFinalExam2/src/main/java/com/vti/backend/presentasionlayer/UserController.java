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
		userService = new UserService();
		messageProperties = new com.vti.ultist.MessageProperties();
	}

	/**
	 * This method is used for getting password.
	 * 
	 * @Description: .
	 * @author: Bich.NTN
	 * @create_date: May 31, 2020
	 * @version: 1.0
	 * @modifer: Bich.NTN
	 * @modifer_date: May 31, 2020
	 * @throws Exception
	 */
	public String getPassWord(String email)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {

		userService = new UserService();
		return userService.getPassWord(email);
	}

	/**
	 * This method is used for check user esist or not
	 * 
	 * @Description: .
	 * @author: Bich.NTN
	 * @create_date: May 31, 2020
	 * @version: 1.0
	 * @modifer: Bich.NTN
	 * @modifer_date: May 31, 2020
	 * @throws Exception
	 */
	public boolean isUserExist(String email)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		return userService.isUserExist(email);
	}

	/**
	 * This method is used for signin
	 * 
	 * @Description: .
	 * @author: Bich.NTN
	 * @create_date: May 31, 2020
	 * @version: 1.0
	 * @modifer: Bich.NTN
	 * @modifer_date: May 31, 2020
	 * @throws Exception
	 */
	public void login(String email, String passWord, byte choose) throws Exception {
		if (!emailValid(email)) {
			throw new Exception(messageProperties.getProperty("email.false"));
		}
		if (!passWordValid(passWord)) {
			throw new Exception(messageProperties.getProperty("password.notexist"));
		}

		switch (choose) {
		case 1:
			userService = new ManagerService();
			if (!userService.isUserExist(email)) {
				throw new Exception(messageProperties.getProperty("user.notexist"));
			}
			userService.login(email, passWord);
			break;
		case 2:
			userService = new EmployeeService();
			if (!userService.isUserExist(email)) {
				throw new Exception(messageProperties.getProperty("user.notexist"));
			}
			userService.login(email, passWord);
			break;
		case 0:
			break;

		}
	}

	/**
	 * This method is used for chekking email valid or not
	 * 
	 * @Description: .
	 * @author: Bich.NTN
	 * @create_date: May 31, 2020
	 * @version: 1.0
	 * @modifer: Bich.NTN
	 * @modifer_date: May 31, 2020
	 * @throws Exception
	 */
	public boolean emailValid(String email) {
		String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		return email.matches(EMAIL_REGEX);
	}

	/**
	 * This method is used for checkking password valid or not
	 * 
	 * @Description: .
	 * @author: Bich.NTN
	 * @create_date: May 31, 2020
	 * @version: 1.0
	 * @modifer: Bich.NTN
	 * @modifer_date: May 31, 2020
	 * @throws Exception
	 */
	public boolean passWordValid(String passWord) {
		byte countCapital = 0;
		for (int i = 0; i < passWord.length(); i++) {
			if (Character.isUpperCase(passWord.charAt(i))) {
				countCapital = 1;
				break;
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

	/**
	 * This method is used for registering employee account
	 * 
	 * @Description: .
	 * @author: Bich.NTN
	 * @create_date: May 31, 2020
	 * @version: 1.0
	 * @modifer: Bich.NTN
	 * @modifer_date: May 31, 2020
	 * @throws Exception
	 */
	public void register(String firstName, String lastName, String phone, String email, String projectName,
			String proSkill, String passWord) throws Exception {
		userService = new EmployeeService();
		if (phone.length() < 9 || phone.length() > 12) {
			throw new Exception(messageProperties.getProperty("phone.false"));
		}
		if (!emailValid(email)) {
			throw new Exception(messageProperties.getProperty("email.false"));
		}
		if (userService.isUserExist(email)) {
			throw new Exception(messageProperties.getProperty("user.exist"));
		}
		if (!passWordValid(passWord)) {
			throw new Exception(messageProperties.getProperty("password.false"));
		}

		userService.register(firstName, lastName, phone, email, projectName, proSkill, passWord);
	}

	/**
	 * This method is used for registering manager account
	 * 
	 * @Description: .
	 * @author: Bich.NTN
	 * @create_date: May 31, 2020
	 * @version: 1.0
	 * @modifer: Bich.NTN
	 * @modifer_date: May 31, 2020
	 * @throws Exception
	 */

	public void register(String firstName, String lastName, String phone, String email, String expInYear,
			String passWord) throws Exception {
		userService = new ManagerService();

		if (phone.length() < 9 || phone.length() > 12) {
			throw new Exception(messageProperties.getProperty("phone.false"));
		}
		if (!emailValid(email)) {
			throw new Exception(messageProperties.getProperty("email.false"));
		}
		if (Integer.parseInt(expInYear) < 0 || Integer.parseInt(expInYear) > 20) {
			throw new Exception(messageProperties.getProperty("ExpIntYear.false"));
		}
		if (userService.isUserExist(email)) {
			throw new Exception(messageProperties.getProperty("user.exist"));
		}
		if (!passWordValid(passWord)) {
			throw new Exception(messageProperties.getProperty("password.false"));
		}
		userService.register(firstName, lastName, phone, email, expInYear, passWord);
	}

	/*
	 * @see com.vti.backend.businesslayer.IUserService#register(java.lang.String[])
	 */
	public void register(String... infos) {

	}

	/*
	 * @see com.vti.backend.businesslayer.IUserService#login(java.lang.String,
	 * java.lang.String)
	 */
	public void login(String email, String passWord) throws Exception {

	}

}
