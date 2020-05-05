import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		// Create Deparment
					Department department1 = new Department ();
					department1.id = 1;
					department1.name = "Sale";

					Department department2 = new Department ();
					department2.id = 2;
					department2.name = "Marketting";

					Department department3 = new Department ();
					department3.id = 3;
					department3.name = "HR";
					
					Department department4 = new Department ();
					department4.id = 4;
					department4.name = "Sale Main";
					
					Department department5 = new Department ();
					department5.id = 5;
					department5.name = "Sale Support";
					
		Department[] departments = {department1, department2, department3, department4, department5};
		Arrays.sort(departments);
		for (Department department : departments) {
		System.out.println(departments);
				
		}
}
}
	

	
	

