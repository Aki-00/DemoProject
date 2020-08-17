/**
 * 
 */
package com.vti.DemoProject.backend.object;

/**
 * This class is user entity.
 * 
 * @Description: .
 * @author: Bich.NTT
 * @create_date:Jun 18, 2020
 * @version: 1.0
 * @modifer: Bich.NTT
 * @modifer_date: Jun 18, 2020
 */
public class User {
private String userName;
private String password;
/**
 * @return the userName
 */
public String getUserName() {
	return userName;
}
/**
 * @param userName the userName to set
 */
public void setUserName(String userName) {
	this.userName = userName;
}
/**
 * @return the password
 */
public String getPassword() {
	return password;
}
/**
 * @param password the password to set
 */
public void setPassword(String password) {
	this.password = password;
}
/**
	 * Constructor for class User
	 * 
	 * @Description: .
	 * @author: Bich.NTN
	 * @create_date: Jun 18, 2020
	 * @version: 1.0
	 * @modifer: Bich.NTN
	 * @modifer_date: Jun 18, 2020
	 */
public User(String userName, String password) {
	super();
	this.userName = userName;
	this.password = password;
}


}
