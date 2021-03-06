import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ex5_InputFromConsole {
	public static void main(String[] args) throws ParseException {

		Scanner scanner = new Scanner(System.in) ;

		//Q1.
		System.out.println("Moi ban nhap vao 3 so nguyen duong ");
		for (int i=1; i<=3; i++) {
			int x= scanner.nextInt();
			System.out.println("Ban da nhap: " + x + "\n");}

		//Q2.
		System.out.println("Moi ban nhap vao 2 so thuc");
		for (int i1=1;i1<=2;i1++) {
			double d1 = scanner.nextDouble();
			System.out.println("Ban da nhap: " + d1 + "\n");}

		//Q3.

		System.out.println("Moi ban nhap vao ho");
		String s1 = scanner.next();
		System.out.println("Moi ban nhap vao ten");
		String s2 = scanner.next();
		System.out.println("Ten ban da nhap: "+s1 + " " +s2 +"\n");

		//Q4.
		System.out.println("Moi nhap vao ngay sinh");
		String dob = scanner.next();
		String pattern = "yyyy/MM/dd";
		SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
		Date date = dateFormat.parse(dob);
		System.out.println("Input: "+date);


		//Q5. 

		//public static void runInputAccount(String[] args) {
		inputAccount();

		// Q7.
		System.out.println("Moi ban nhap vao 1 so chan");
		int number = scanner.nextInt();
		if (number%2==0) {
			System.out.println("Input: "+number);
		}else {System.out.println("Nhap sai");
		}
		
		//Q8.
		for(;;) {
			int methodNumber = chooseMethod();
			System.out.println("Chuc nang da chon:" + methodNumber);
			switch(methodNumber) {
			case 1:
				inputAccount();
				break;
			case 2:
				inputDepartment();
				break;
			default:
				System.out.println("Moi ban nhap lai");
				chooseMethod();
				
			}

		}
	}



public static void inputAccount() {
	Scanner scanner = new Scanner(System.in) ;
	for (;;) {
		System.out.print("Nhap vao Account ID:");
		int iD = scanner.nextInt();
		scanner.nextLine(); 
		System.out.print("Nhap vao username:");
		String userName = scanner.nextLine();
		System.out.print("Nhap vao Department:");
		String department = scanner.nextLine();
		System.out.print("Nhap vao Position ID (tu 1 -> 5):");
		int position = scanner.nextInt(6);
		switch(position) {
		case 1:
			System.out.print("Dev");
			break;
		case 2:
			System.out.print("Test");
			break;
		case 3:
			System.out.print("ScrumMaster");
			break;
		case 4:
			System.out.print("PM");
			break;
		default:
			System.out.print("SA");	
		}
		System.out.print("\nNhap vao group:");
		scanner.nextLine();
		String groups = scanner.nextLine();
		System.out.print("\nNhap vao ngay:");
		String date = scanner.nextLine();



	}

}

//Q6.
public static void inputDepartment() {
	Scanner scanner = new Scanner(System.in) ;
	System.out.println("Moi ban nhap ten department muon tao");
	for(;;) {
		String department = scanner.nextLine();
		System.out.println("Department da tao la: "+department);
	}


}

//Tao method chon method
public static int chooseMethod() {
	Scanner scanner = new Scanner(System.in) ;
	System.out.println("Moi ban nhap chuc nang muon su dung (1: tao account or 2: tao department");
	int methodNumber = scanner.nextInt();
	return methodNumber;
}
}


