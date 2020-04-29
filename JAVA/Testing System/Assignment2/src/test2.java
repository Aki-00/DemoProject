import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
	
		// Create group
		Group group1 = new Group();
		group1.groupId = 1;
		group1.groupName = "Java Fresher";
		group1.createDate = new Date (2020-04-21);
		
		
		Group group2 = new Group();
		group2.groupId = 2;
		group2.groupName = "DB Fresher";
		group2.createDate = new Date (2020-04-21);
		
		Group group3 = new Group();
		group3.groupId = 3;
		group3.groupName = "C++ Fresher";
		group3.createDate = new Date (2020-04-16);
		
		
		// Create account
		Account account1 = new Account();
		account1.accountId = 1;
		account1.createDate = new Date (2020-03-17);
		account1.department = department1;
		account1.email = "An@gmail.com";
		account1.fullName = "Nguyen Van An";
		Group[] groupOfAccount1 = {group1};
		account1.groups = groupOfAccount1;
		account1.joinDate = new Date (2020-03-13);
		account1.position = position1;
		account1.userName = "an.nguyenvan";
		
		Account account2 = new Account();
		account2.accountId = 2;
		account2.createDate = new Date (2020-01-9);
		account2.department = department1;
		account2.email = "Linh@gmail.com";
		account2.fullName = "Nguyen Hoai Linh";
		Group[] groupOfAccount2 = {group3};
		account2.groups = groupOfAccount2;
		account2.joinDate = new Date (2020-03-13);
		account2.position = position3;
		account2.userName = "Linh.nguyenhoai";
		
		Account account3 = new Account();
		account3.accountId = 3;
		account3.createDate = new Date (2020-03-19);
		account3.department = department2;
		account3.email = "ha@gmail.com";
		account3.fullName = "Pham Hai Ha";
		Group[] groupOfAccount3 = {group1};
		account3.groups = groupOfAccount3;
		account3.joinDate = new Date (2020-03-13);
		account3.position = position1;
		account3.userName = "Ha.phamhai";
		
		// Q9.
		
		//In ra account
		Account[] accounts = {account1, account2, account3};
		for (int i =0; i<accounts.length;i++) {
		System.out.println("Cac user dang co: "+accounts[i].fullName);}
		// Nhap account
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Hay nhap vao 1 user");
		String user = scanner.nextLine();
		// In ra ten group
		for (int i =1; i<accounts.length;i++) {
			for (int j=0; j<accounts[i].groups.length;j++) {
			System.out.println("Cac group dang co: "+accounts[i].groups[j].groupName);
		// Nhap vao ten group
			System.out.println("Hay nhap vao 1 group");
			String group = scanner.nextLine();
		// Them account vao group
			String[] newAccount = {user};
			
			
			
			}
		}
			
		
		
		
			
		

	}
	
	
	public static int chooseMethod() {
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Moi ban nhap chuc nang muon su dung (1: tao account or 2: tao department");
		int methodNumber = scanner.nextInt();
		return methodNumber;
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
}

