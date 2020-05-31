/**
 * 
 */
package com.vti.backend.businesslayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.vti.backend.datalayer.IUserRepository;
import com.vti.backend.datalayer.ManagerRepository;

/**
 * This class is ManagementService entity.
 * 
 * @Description: .
 * @author: Bich.NTT
 * @create_date:May 31, 2020
 * @version: 1.0
 * @modifer: Bich.NTT
 * @modifer_date: May 31, 2020
 */
public class ManagerService extends UserService {
	private IUserRepository managerRepository;

	/**
	 * Constructor for class ManagementService
	 * 
	 * @Description: .
	 * @author: Bich.NTN
	 * @create_date: May 31, 2020
	 * @version: 1.0
	 * @modifer: Bich.NTN
	 * @modifer_date: May 31, 2020
	 */
	public ManagerService() throws IOException {
		managerRepository = new ManagerRepository();
	}

	/*
	 * @see com.vti.backend.businesslayer.UserService#getPassWord(java.lang.String)
	 */
	@Override
	public String getPassWord(String email)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		return managerRepository.getPassWord(email);
	}

	/*
	 * @see com.vti.backend.businesslayer.UserService#isUserExist(java.lang.String)
	 */
	@Override
	public boolean isUserExist(String email)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		return managerRepository.isUserExist(email);
	}

	/*
	 * @see com.vti.backend.businesslayer.UserService#register(java.lang.String[])
	 */
	@Override
	public void register(String... infos) throws Exception {
		managerRepository.register(infos);
	}

	/*
	 * @see com.vti.backend.businesslayer.UserService#login(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public void login(String email, String passWord) throws Exception {
		managerRepository.login(email, passWord);
	}

}
