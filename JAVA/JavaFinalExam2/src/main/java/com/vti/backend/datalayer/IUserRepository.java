/**
 * 
 */
package com.vti.backend.datalayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

/**
 * This class is IUserRepository entity.
 * 
 * @Description: .
 * @author: Bich.NTT
 * @create_date:May 30, 2020
 * @version: 1.0
 * @modifer: Bich.NTT
 * @modifer_date: May 30, 2020
 */
public interface IUserRepository {
	String getPassWord(String email) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException;

	boolean isUserExist(String email) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException;

	void register(String...infos) throws Exception;

	void login(String email, String passWord)throws Exception;

}
