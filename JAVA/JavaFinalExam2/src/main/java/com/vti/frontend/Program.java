/**
 * 
 */
package com.vti.frontend;

import java.io.IOException;

import com.vti.backend.presentasionlayer.UserController;
import com.vti.entity.Employee;
import com.vti.entity.Manager;
import com.vti.entity.ProjectName;
import com.vti.ultist.ScannerUtils;

/**
 * This class is Program entity.
 * 
 * @Description: .
 * @author: Bich.NTT
 * @create_date:May 31, 2020
 * @version: 1.0
 * @modifer: Bich.NTT
 * @modifer_date: May 31, 2020
 */
public class Program {

	private static UserController userController;

	public static void main(String[] args) {
		try {
			userController = new UserController();
		} catch (IOException e) {
			e.printStackTrace();
		}

		byte choose;
		do {
			menuUser();
			choose = (byte) ScannerUtils.inputInt();
			switch (choose) {
			case 1:
				logIn();
				break;
			case 2:
				register();
				break;
			case 0:
				break;
			default:
				System.out.println("please input 1 or 2 or 0");
			}
		} while (choose != 0);
	}

	/**
	 * This method is used for creatting menu
	 * 
	 * @Description: .
	 * @author: Bich.NTN
	 * @create_date: May 31, 2020
	 * @version: 1.0
	 * @modifer: Bich.NTN
	 * @modifer_date: May 31, 2020
	 * @throws Exception
	 */

	private static void menuUser() {

		System.out.println("============MENU===========");
		System.out.println("Already user?");
		System.out.println("1. Signin");
		System.out.println("New? Join with us!");
		System.out.println("2. Create new account");
		System.out.println("0. Exit");
	}

	/**
		 * This method is used for login function 
		 * 
		 * @Description: .
		 * @author: Bich.NTN
		 * @create_date: May 31, 2020
		 * @version: 1.0
		 * @modifer: Bich.NTN
		 * @modifer_date: May 31, 2020
		 * @throws Exception
		 */
	private static void logIn() {
		System.out.println("--Signin--");
		byte choose;
		do {
			System.out.println("Please choose account type to signin (1: manager, 2:employee, 0: exit)");
			choose = (byte) ScannerUtils.inputInt("Please input a int");
			switch (choose) {
			case 0:
				return;
			case 1:
			case 2:
				System.out.print("Please input registered email: ");
				String email = ScannerUtils.inputString("Please input a string");
				System.out.print("Please input registered password: ");
				String passWord = ScannerUtils.inputString("Please input a string");
				try {
					userController.login(email, passWord, choose);
				} catch (Exception e) {
					e.printStackTrace();
				}
				return;
			default:
				System.out.println("Please input 1 or 2 or 0");
				break;
			}
		} while (choose != 0);

	}

	/**
		 * This method is used for creatting new account 
		 * 
		 * @Description: .
		 * @author: Bich.NTN
		 * @create_date: May 31, 2020
		 * @version: 1.0
		 * @modifer: Bich.NTN
		 * @modifer_date: May 31, 2020
		 * @throws Exception
		 */
	private static void create() {

		byte choose;
		do {
			System.out
					.println("Please choose which type of account you want to create (1: manager, 2:employee, 0:exit)");
			choose = (byte) ScannerUtils.inputInt("Please input a int");
			switch (choose) {
			case 0:
				return;
			case 1:
				Manager manager = new Manager();
				try {
					userController.register(manager.getFirstName(), manager.getLastName(), manager.getPhone(),
							manager.getEmail(), Integer.toString(manager.getExpInYear()), manager.getPassWord());
				} catch (Exception e) {
					e.printStackTrace();
				}
				return;
			case 2:
				Employee employee = new Employee();
				try {
					userController.register(employee.getFirstName(), employee.getLastName(), employee.getPhone(),
							employee.getEmail(), employee.getProjectName(), employee.getProSkill(),
							employee.getPassWord());
				} catch (Exception e) {
					e.printStackTrace();
				}
				return;
			default:
				System.out.println("Please input 1 or 2 or 0");
				break;
			}
		} while (choose != 0);
	}

	/**
		 * This method is used for show signin function auto 
		 * 
		 * @Description: .
		 * @author: Bich.NTN
		 * @create_date: May 31, 2020
		 * @version: 1.0
		 * @modifer: Bich.NTN
		 * @modifer_date: May 31, 2020
		 * @throws Exception
		 */
	private static void register() {
		create();
		logIn();
	}

}
