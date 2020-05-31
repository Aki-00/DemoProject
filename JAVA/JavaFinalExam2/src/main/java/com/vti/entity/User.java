package com.vti.entity;

import com.vti.ultist.ScannerUtils;

/**
 * This class is User entity.
 * 
 * @Description: .
 * @author: Bich.NTT
 * @create_date:May 30, 2020
 * @version: 1.0
 * @modifer: Bich.NTT
 * @modifer_date: May 30, 2020
 */
public abstract class User {

	private String firstName;
	private String lastName;
	private String phone;
	private String email;
	private String passWord;

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @return the passWord
	 */
	public String getPassWord() {
		return passWord;
	}

	/**
	 * Constructor for class User
	 * 
	 * @Description: .
	 * @author: Bich.NTN
	 * @create_date: May 30, 2020
	 * @version: 1.0
	 * @modifer: Bich.NTN
	 * @modifer_date: May 30, 2020
	 */

	public User() {
		inputInfor();
	}

	/**
	 * This method is used to input User
	 * 
	 * @Description: .
	 * @author: Bich.NTN
	 * @create_date: May 30, 2020
	 * @version: 1.0
	 * @modifer: Bich.NTN
	 * @modifer_date: May 30, 2020
	 * @throws Exception
	 */
	private void inputInfor() {
		System.out.print("Please input firstname: ");
		firstName = ScannerUtils.inputString("Please input a string!");
		System.out.print("Please input lastname: ");
		lastName = ScannerUtils.inputString("Please input a string!");
		System.out.print("Please input phone: ");
		phone = ScannerUtils.inputString("Please input a string!");
		System.out.print("Please input email: ");
		email = ScannerUtils.inputString("Please input a string!");
		System.out.print("Please input password");
		passWord = ScannerUtils.inputString("Please input a string!");
	}

	/*
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", phone=" + phone + ", email=" + email
				+ "]";
	}

}
