package Exception;

import java.util.Scanner;

public class Q4 {
	Scanner scanner = new Scanner(System.in);
	static Department[] departments = new Department[3];

	public static void main(String[] args) {
		departments[0] = new Department(1, "Sale");
		departments[1] = new Department(2, "PR");
		departments[2] = new Department(3, "HR");
		getIndex(5);

	}

	public static void getIndex(int index) {
		try {
			System.out.println(departments[index]);
		} catch (Exception e) {
			System.out.println("Cannot find department.");
		}
	}

}
