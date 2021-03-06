import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class FlowControl{
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

		// Q1.
		if (account2.department == null) {
			System.out.println("Nhân viên này chưa có phòng ban");
		}else System.out.println("Phòng ban của nhân viên này là: " + account2.department.name);

		//Q2.

		if (account2.groups == null) {
			System.out.println("Nhân viên này chưa có group");
		} else if (account2.groups.length <= 2) {
			System.out.println(account2.groups);
		}else if (account2.groups.length == 3) {
			System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
		}else System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
		// Q3.
		System.out.println(account2.department == null? "Chua co phong ban" : "Phong ban:" + account2.department.name);

		// Q4.
		System.out.println(account1.position.name == "Dev"? "Đây là Developer" : "Người này không phải là Developer" );

		// Q5.			
		int x = group1.accounts.length;
		switch(x) {
		case 1:
			System.out.println("Nhóm có một thành viên");
			break;
		case 2:
			System.out.println("Nhóm có hai thành viên");
			break;
		case 3: 
			System.out.println("Nhóm có ba thành viên");
		default:
			System.out.println("Nhóm có nhiều thành viên");
		}
		// Q6.
		int y = account2.groups.length;
		switch(y) {
		case 0:
			System.out.println("Nhân viên này chưa có group");
			break;
		case 1:
		case 2:
			System.out.println("Group của nhân viên này là "+ account2.groups);
			break;
		case 3:
			System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
			break;
		default:
			System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
		}
		// Q7.
		String z = account1.position.name;
		switch (z) {
		case "Dev":
			System.out.println("Đây là Developer");
			break;
		default:
			System.out.println("Người này không phải là Developer");		
		}

		//Q8.

		String[] fullnames = {account1.fullName, account2.fullName, account3.fullName};
		String[] emails = {account1.email, account2.email, account3.email};
		String[] departments = {account1.department.name, account2.department.name, account3.department.name};
		for (String fullnameA : fullnames) {
			System.out.println(fullnameA);}
		for (String emailA : emails) {
			System.out.println(emailA);}
		for (String departmentA : departments) {
			System.out.println(departmentA);}
		// Q9.
		int[] departmentIDs = {department1.id, department2.id, department3.id};
		String[] departmentNames = {department1.name, department2.name, department3.name};
		for (int departmentID : departmentIDs)
		{ System.out.println(departmentID);
		} for (String departmentName : departmentNames)
		{System.out.println(departmentName);}

		// Q10.
		for (int i1=1;i1>=1;i1++) {
			System.out.println("Thông tin account thứ"+i1+"là:" );
			System.out.println("Email: " + emails[i1]);
			System.out.println("Fullname: "+ fullnames[i1]);
			System.out.println("Department: "+ departmentNames[i1]);
		}
		// Q11.
		for (int i1=1;i1>=1;i1++) {
			System.out.println("Thông tin department thứ"+i1+"là:");
			System.out.println("ID: "+departmentIDs[i1]);
			System.out.println("Name: "+departmentNames[i1]);
		}

		// Q12.
		int[] departmentIdA = {account1.department.id, account2.department.id, account3.department.id};
		for (int i1=1;i1>=1;i1++) {
			if (departmentIdA[i1] <= 2) {
				System.out.println("Thông tin account thứ"+i1+"là:" );
				System.out.println("Email: " + emails[i1]);
				System.out.println("Fullname: "+ fullnames[i1]);
				System.out.println("Department: "+ departmentNames[i1]);
			}else System.out.println("Khong co account nao");

			// Q13.
			int[] accountIdA = {account1.accountId, account2.accountId, account3.accountId};
			for (;i1>=1;i1++) {
				if (accountIdA[i1] != 2) {
					System.out.println("Thông tin account thứ"+i1+"là:" );
					System.out.println("Email: " + emails[i1]);
					System.out.println("Fullname: "+ fullnames[i1]);
					System.out.println("Department: "+ departmentNames[i1]);

				}

				// Q14.
				for (;i1<=1;i1++) {
					if (accountIdA[i1] <= 4) {
						System.out.println("Thông tin account thứ"+i1+"là:" );
						System.out.println("Email: " + emails[i1]);
						System.out.println("Fullname: "+ fullnames[i1]);
						System.out.println("Department: "+ departmentNames[i1]);

					}

					// Q15.
					for(;i1<=20;i1++) {
						for(;i1%2==0;i1++) {
							System.out.println(i1);
						}

					}


					// Q16-10.
					while (i1>=1){
						System.out.println("Thông tin account thứ"+i1+"là:" );
						System.out.println("Email: " + emails[i1]);
						System.out.println("Fullname: "+ fullnames[i1]);
						System.out.println("Department: "+ departmentNames[i1]);
						i1++;
					}
					//Q16-11.
					while (i1>=1){
						System.out.println("Thông tin department thứ"+i1+"là:");
						System.out.println("ID: "+departmentIDs[i1]);
						System.out.println("Name: "+departmentNames[i1]);
						i1++;
					}
					//Q16-12.
					while (i1>=1) {
						if (departmentIdA[i1] > 2)
						{continue;}

						System.out.println("Thông tin account thứ"+i1+"là:" );
						System.out.println("Email: " + emails[i1]);
						System.out.println("Fullname: "+ fullnames[i1]);
						System.out.println("Department: "+ departmentNames[i1]);		
					}
					//Q16-13.
					while (i1>=1) {
						if (accountIdA[i1] == 2) {
							continue;
						}
						System.out.println("Thông tin account thứ"+i1+"là:" );
						System.out.println("Email: " + emails[i1]);
						System.out.println("Fullname: "+ fullnames[i1]);
						System.out.println("Department: "+ departmentNames[i1]);
					}
					//Q16-14.				
					while (i1>=1) {
						if (accountIdA[i1] > 4) {
							break;
						}
						System.out.println("Thông tin account thứ"+i1+"là:" );
						System.out.println("Email: " + emails[i1]);
						System.out.println("Fullname: "+ fullnames[i1]);
						System.out.println("Department: "+ departmentNames[i1]);	
					}

					//Q16-15.
					for(;i1<=20;i1++) {
						if(i1%2==1) {
							continue;
						}
						System.out.println(i1);
					}
				}
			}
		}
	}
}















