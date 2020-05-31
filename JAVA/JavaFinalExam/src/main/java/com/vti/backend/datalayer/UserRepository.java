/**
 * 
 */
package com.vti.backend.datalayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.vti.ultist.JdbcUtils;
import com.vti.ultist.MessageProperties;

/**
 * This class is UserRepository entity.
 * 
 * @Description: .
 * @author: Bich.NTT
 * @create_date:May 30, 2020
 * @version: 1.0
 * @modifer: Bich.NTT
 * @modifer_date: May 30, 2020
 */
public class UserRepository implements IUserRepository {

	private JdbcUtils jdbcUtils;
	private MessageProperties messageProperties;

	/**
	 * Constructor for class UserRepository
	 * 
	 * @Description: .
	 * @author: Bich.NTN
	 * @create_date: May 30, 2020
	 * @version: 1.0
	 * @throws IOException
	 * @modifer: Bich.NTN
	 * @modifer_date: May 30, 2020
	 */
	public UserRepository() throws IOException {
		jdbcUtils = new JdbcUtils();
		messageProperties = new MessageProperties();
	}

	/*
	 * @see com.vti.backend.datalayer.IUserRepository#getPassWord(java.lang.String)
	 */
	public String getPassWord(String email)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		return null;
	}

	/*
	 * @see com.vti.backend.datalayer.IUserRepository#isUserExist(java.lang.String)
	 */
	public boolean isUserExist(String email)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		return false;
	}

	/*
	 * @see com.vti.backend.datalayer.IUserRepository#register()
	 */
	public void register() {

	}

	/*
	 * @see com.vti.backend.datalayer.IUserRepository#login(java.lang.String,
	 * java.lang.String)
	 */
	public void login(String email, String passWord) throws Exception {
		String savedPassWord = getPassWord(email);
		if (passWord.equals(savedPassWord)) {
			System.out.println(messageProperties.getProperty("login.success"));
		} else {
			System.out.println(messageProperties.getProperty("login.false"));
		}

	}

}
