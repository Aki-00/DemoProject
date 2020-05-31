/**
 * 
 */
package com.vti.entity;

import com.vti.ultist.ScannerUtils;

/**
 * This class is Manager entity.
 * 
 * @Description: .
 * @author: Bich.NTT
 * @create_date:May 30, 2020
 * @version: 1.0
 * @modifer: Bich.NTT
 * @modifer_date: May 30, 2020
 */
public class Manager extends User {

	private byte expInYear;

	/**
	 * @return the expInYear
	 */
	public byte getExpInYear() {
		return expInYear;
	}

	/**
	 * Constructor for class Manager
	 * 
	 * @Description: .
	 * @author: Bich.NTN
	 * @create_date: May 30, 2020
	 * @version: 1.0
	 * @modifer: Bich.NTN
	 * @modifer_date: May 30, 2020
	 */
	public Manager() {
		super();
		System.out.print("Please input experience year: ");
		expInYear = (byte) ScannerUtils.inputInt("Please input a string!");
	}

}
