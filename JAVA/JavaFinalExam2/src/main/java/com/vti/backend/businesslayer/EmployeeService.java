/**
 * 
 */
package com.vti.backend.businesslayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.vti.backend.datalayer.EmployeeRepository;
import com.vti.backend.datalayer.IUserRepository;
import com.vti.entity.ProjectName;

/**
 * This class is EmployeeService entity.
 * 
 * @Description: .
 * @author: Bich.NTT
 * @create_date:May 31, 2020
 * @version: 1.0
 * @modifer: Bich.NTT
 * @modifer_date: May 31, 2020
 */
public class EmployeeService extends UserService {
	private IUserRepository employeeRepository;

	/**
	 * Constructor for class EmployeeService
	 * 
	 * @Description: .
	 * @author: Bich.NTN
	 * @create_date: May 31, 2020
	 * @version: 1.0
	 * @modifer: Bich.NTN
	 * @modifer_date: May 31, 2020
	 */
	public EmployeeService() throws IOException {
		employeeRepository = new EmployeeRepository();
	}

	/*
	 * @see com.vti.backend.businesslayer.UserService#getPassWord(java.lang.String)
	 */
	@Override
	public String getPassWord(String email)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		return employeeRepository.getPassWord(email);
	}

	/*
	 * @see com.vti.backend.businesslayer.UserService#isUserExist(java.lang.String)
	 */
	@Override
	public boolean isUserExist(String email)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		return employeeRepository.isUserExist(email);
	}

	/*
	 * @see com.vti.backend.businesslayer.UserService#register(java.lang.String[])
	 */
	@Override
	public void register(String... infos) throws Exception {
		employeeRepository.register(infos);
	}

	/*
	 * @see com.vti.backend.businesslayer.UserService#login(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public void login(String email, String passWord) throws Exception {
		employeeRepository.login(email, passWord);
	}

}
