/**
 * 
 */
package com.vti.entity;

import com.vti.ultist.ScannerUtils;

/**
 * This class is Employee entity.
 * 
 * @Description: .
 * @author: Bich.NTT
 * @create_date:May 30, 2020
 * @version: 1.0
 * @modifer: Bich.NTT
 * @modifer_date: May 30, 2020
 */
public class Employee extends User {
	private ProjectName projectName;
	private String proSkill;

	/**
	 * @return the projectName
	 */
	public String getProjectName() {
		return projectName.toString();
	}

	/**
	 * This method is used to input project name
	 * 
	 * @Description: .
	 * @author: Bich.NTN
	 * @create_date: May 30, 2020
	 * @version: 1.0
	 * @modifer: Bich.NTN
	 * @modifer_date: May 30, 2020
	 * @throws Exception
	 */
	public void setProjectName() {
		System.out.println("Please input project name: (1:Testing System, 2: CRM, 3:Timesheet)");
		int choose = (byte) ScannerUtils.inputInt("Please input a number");
		while (true) {
			switch (choose) {
			case 1:
				projectName = ProjectName.valueOf("TESTING_SYSTEM");
				return;
			case 2:
				projectName = ProjectName.valueOf("CRM");
				return;
			case 3:
				projectName = ProjectName.valueOf("TIME_SHEET");
				return;
			default:
				System.out.println("Please input 1 or 2 or 3");
				break;
			}
		}
	}

	/**
	 * @return the proSkill
	 */
	public String getProSkill() {
		return proSkill;
	}

	/**
	 * Constructor for class Employee
	 * 
	 * @Description: .
	 * @author: Bich.NTN
	 * @create_date: May 30, 2020
	 * @version: 1.0
	 * @modifer: Bich.NTN
	 * @modifer_date: May 30, 2020
	 */
	public Employee() {
		super();
		setProjectName();
		System.out.println("Please input pro skill");
		proSkill = ScannerUtils.inputString("Please input a string");

	}

}
