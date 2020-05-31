/**
 * 
 */
package com.vti.backend.businesslayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.vti.backend.datalayer.IUserRepository;
import com.vti.backend.datalayer.UserRepository;
import com.vti.entity.ProjectName;

/**
 * This class is UserService entity.
 * 
 * @Description: .
 * @author: Bich.NTT
 * @create_date:May 31, 2020
 * @version: 1.0
 * @modifer: Bich.NTT
 * @modifer_date: May 31, 2020
 */
public class UserService implements IUserService {
	private IUserRepository userRepository;

	/**
	 * Constructor for class UserService
	 * 
	 * @Description: .
	 * @author: Bich.NTN
	 * @create_date: May 31, 2020
	 * @version: 1.0
	 * @throws IOException
	 * @modifer: Bich.NTN
	 * @modifer_date: May 31, 2020
	 */
	public UserService() throws IOException {
		userRepository = new UserRepository();
	}

	/*
	 * @see com.vti.backend.businesslayer.IUserService#getPassWord(java.lang.String)
	 */
	public String getPassWord(String email)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		return userRepository.getPassWord(email);
	}

	/*
	 * @see com.vti.backend.businesslayer.IUserService#isUserExist(java.lang.String)
	 */
	public boolean isUserExist(String email)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		return userRepository.isUserExist(email);
	}

	/*
	 * @see com.vti.backend.businesslayer.IUserService#register()
	 */
	public void register() {
		userRepository.register();
	}

	/*
	 * @see com.vti.backend.businesslayer.IUserService#login(java.lang.String,
	 * java.lang.String)
	 */
	public void login(String email, String passWord) throws Exception {
		userRepository.login(email, passWord);
	}

	/*
		 * @see com.vti.backend.businesslayer.IUserService#managerRegister(java.lang.String, java.lang.String, java.lang.String, java.lang.String, byte, java.lang.String)
		 */
	public void managerRegister(String firstName, String lastName, String phone, String email, byte expInYear,
			String passWord) throws Exception {
		
	}

	/*
		 * @see com.vti.backend.businesslayer.IUserService#employeeRegister(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.vti.entity.ProjectName, java.lang.String, java.lang.String)
		 */
	public void employeeRegister(String firstName, String lastName, String phone, String email, ProjectName projectName,
			String proSkill, String passWord) throws Exception {
		
	}

}
