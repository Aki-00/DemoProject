import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.swing.JTable;

public class SystemOutPrintf {

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
		// Create Position
		Position position1 = new Position();
		position1.id = 1;
		position1.name = "Manager";

		Position position2 = new Position();
		position2.id = 2;
		position2.name = "Team Leader";

		Position position3 = new Position();
		position3.id = 3;
		position3.name = "Trainee";

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


		// Q1
		int a = 5;
		System.out.printf("%d%n",a);

		//Q2
		int b = 100000000;
		System.out.printf(Locale.US, "%,d%n", b);

		//Q3
		float c = 5.567098f;
		System.out.printf("%5.4f%n",c);

		//Q4
		String s = "Nguyen Van A";
		System.out.printf("Tên tôi là" +s+ "và tôi đang độc thân");

		//Q5.
		String pattern = "dd/MM/yyyy HH:mm:ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date = simpleDateFormat.format(new Date());
		System.out.println(date);

		//Q6
		Account[] accounts = {account1, account2, account3};
		for(int i=0;i<accounts.length;i++) {
			System.out.println(accounts[i].fullName);
			System.out.println(accounts[i].email);
			System.out.println(accounts[i].department.name);
		}

		//Q7
		for(int i=0;i<accounts.length;i++) {
			System.out.println(accounts[i].fullName);
			for (int j=0;j<accounts[i].groups.length;j++) {
				System.out.println(accounts[i].groups[j].groupName);
			}
			System.out.println(simpleDateFormat.format(accounts[i].joinDate));
		}

	}

}
