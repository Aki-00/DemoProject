package com.vti.testing;

import java.util.Scanner;

public class ScannerUtils {
	static Scanner scanner = new Scanner(System.in);

	public static int inputInt(String errorMessage) {
		int x = 0;
		boolean retry = false;
		while (!retry) {
			try {
				String x1 = scanner.next();
				x = Integer.parseInt(x1);
				retry = true;
			} catch (Exception e) {
				System.out.println(errorMessage);
				retry = false;
			}
		}
		return x;
	}

	public static float inputFloat(String errorMessage) {
		float x = 0;
		boolean retry = false;
		while (!retry) {
			try {
				String x1 = scanner.next();
				x = Float.parseFloat(x1);
				retry = true;
			} catch (Exception e) {
				System.out.println(errorMessage);
				retry = false;
			}
		}
		return x;
	}

	public static double inputDouble(String errorMessage) {

		double x = 0;
		boolean retry = false;
		while (!retry) {
			try {
				String x1 = scanner.next();
				x = Double.parseDouble(x1);
				retry = true;
			} catch (Exception e) {
				System.out.println(errorMessage);
				retry = false;
			}
		}

		return x;
	}

	public static String inputString() {
		String x = scanner.next();
		return x;
	}

//	public static int inputAge() throws InvalidAgeInputingException {
//		System.out.println("Moi ban nhap vao so tuoi");
//		int age = inputInt("wrong inputing! Please input a number as int");
//		if (age <= 0) {
//			throw new InvalidAgeInputingException("The age must be greater than 0 ");
//		}
//		return age;
//	}
//
//	public static int inputAgeGreaterThan18() throws InvalidAgeInputingException {
//		System.out.println("Moi ban nhap vao so tuoi");
//		int age = inputInt("wrong inputing! Please input a number as int");
//		if (age < 18) {
//			throw new InvalidAgeInputingException("The age must be greater than 18 ");
//		}
//		return age;
//	}
}
