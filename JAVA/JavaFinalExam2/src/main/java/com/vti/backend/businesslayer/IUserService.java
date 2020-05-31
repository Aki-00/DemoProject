/**
 * 
 */
package com.vti.backend.businesslayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.vti.entity.ProjectName;

/**
 * This class is IUserService entity.
 * 
 * @Description: .
 * @author: Bich.NTT
 * @create_date:May 31, 2020
 * @version: 1.0
 * @modifer: Bich.NTT
 * @modifer_date: May 31, 2020
 */
public interface IUserService {
	String getPassWord(String email) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException;

	boolean isUserExist(String email) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException;

//	void managerRegister(String firstName, String lastName, String phone, String email, byte expInYear, String passWord)
//			throws Exception;
//	void employeeRegister(String firstName, String lastName, String phone, String email, ProjectName projectName,
//			String proSkill, String passWord) throws Exception;
	void register(String...infos) throws Exception;
	
	void login(String email, String passWord) throws Exception;
	void login(String email, String passWord, byte choose) throws Exception;
	

}
