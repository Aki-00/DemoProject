package Exception;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {

		try {
			float result = divide(7, 0);
			System.out.println(result);
		} catch (ArithmeticException e1) {
			System.out.println("cannot divide 0");
		} catch (Exception e2) {
			e2.getMessage();

		} finally {
			System.out.println("divide completed!");
		}

	}

	public static float divide(int a, int b) {
		return a / b;
	}

}
