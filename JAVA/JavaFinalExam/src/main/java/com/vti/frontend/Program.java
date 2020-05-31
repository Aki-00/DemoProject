///**
// * 
// */
//package com.vti.frontend;
//
//import java.io.IOException;
//
//import com.vti.backend.presentasionlayer.UserController;
//import com.vti.entity.Employee;
//import com.vti.entity.Manager;
//import com.vti.entity.ProjectName;
//import com.vti.ultist.ScannerUtils;
//
///**
// * This class is Program entity.
// * 
// * @Description: .
// * @author: Bich.NTT
// * @create_date:May 31, 2020
// * @version: 1.0
// * @modifer: Bich.NTT
// * @modifer_date: May 31, 2020
// */
//public class Program {
//
//	
//	/**
//		 * This method is used for creatting menu 
//		 * 
//		 * @Description: .
//		 * @author: Bich.NTN
//		 * @create_date: May 31, 2020
//		 * @version: 1.0
//		 * @modifer: Bich.NTN
//		 * @modifer_date: May 31, 2020
//		 * @throws Exception
//		 */
//	
//	private static UserController userController;
//	
//	public static void main(String[] args) {
//		try {
//			userController = new UserController();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//		byte choose;
//		do {
//			menuUser();
//			choose = (byte) ScannerUtils.inputInt();
//			switch (choose) {
//			case 1:
//				logIn();
//				break;
//			case 2: 			
//				register();
//				break;
//			case 0:
//				break;
//			default:
//				System.out.println("please input 1 or 2 or 0");
//			}
//		} while (choose != 0);
//	}
//	
//	
//	private static void menuUser() {
//		
//		System.out.println("============MENU===========");
//		System.out.println("Already user?");
//		System.out.println("1. Signin");
//		System.out.println("New? Join with us!");
//		System.out.println("2. Create new account");
//		System.out.println("0. Exit");
//	}
//	
//	private static void logIn() {
//		System.out.println("--Signin--");
//		System.out.print("Please input registered email: ");
//		String email = ScannerUtils.inputString("Please input a string");
//		System.out.print("Please input registered password: ");
//		String passWord = ScannerUtils.inputString("Please input a string");
//		try {
//			userController.login(email, passWord);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//	
//	private static void create() {
//		//choose user type
//		System.out.println("Please choose which type of account you want to create (1: manager, 2:employee");
//		byte choose = (byte) ScannerUtils.inputInt("Please input a int");
//		//create variable
//		String firstName= null;
//		String lastName= null;
//		String phone = null;
//		String email= null;
//		String passWord = null;
//		ProjectName projectName= null;
//		String proSkill= null;
//		byte expInYear= 0;
//		while(true) {
//			switch(choose) {
//			case 1:
//				System.out.print("Please input firstname: ");
//				firstName = ScannerUtils.inputString("Please input a string!");
//				System.out.print("Please input lastname: ");
//				lastName = ScannerUtils.inputString("Please input a string!");
//				System.out.print("Please input phone: ");
//				phone = ScannerUtils.inputString("Please input a string!");
//				System.out.print("Please input email: ");
//				email = ScannerUtils.inputString("Please input a string!");
//				
//				System.out.print("Please input experience year: ");
//				expInYear = (byte) ScannerUtils.inputInt("Please input a string!");
//				System.out.print("Please input password");
//				passWord = ScannerUtils.inputString("Please input a string!");
////				new Manager();
//				try {
//					userController.managerRegister(firstName, lastName, phone, email, expInYear, passWord);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//				return;
//			case 2:
//				new Employee();
//				try {
//					userController.employeeRegister(firstName, lastName, phone, email, projectName, proSkill, passWord);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//				return;
//			default:
//				System.out.println("Please input 1 or 2");
//			}
//		}
//	}
//	
//	private static void register () {
//		create();
//		logIn();
//	}
//	
//	
//}
