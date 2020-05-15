package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q5Q6 {

	public static void main(String[] args) throws Exception {
		inputAge();
	}

	public static int inputAge() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Moi ban nhap vao mot so nguyen");
		int age=0;
		boolean retry =false;
		while (!retry){
			try {
				String x = scanner.next();
				age = Integer.parseInt(x);
				retry = true;
			} catch (Exception e) {
				System.out.println("wrong inputing! Please input a number as int");	
				retry = false;
			}
	}
		return age;
}
	
	
//	public static float inputFloat(String errorMessage) {
//		Scanner scanner = new Scanner(System.in);
//		float x=0;
//		boolean retry =false;
//		while (!retry){
//			try {
//				x = scanner.nextFloat();
//				if (x%1!=0) {
//				retry = true;
//				}else System.out.println(errorMessage);
//				 			
//			} catch (Exception e) {
//				System.out.println(errorMessage);	
//				retry = false;
//			}
//	}
//		scanner.close();
//		return x;
//		
//	}
}

