import java.util.Date;

public class data {

	public static void main(String[] args) {
		byte id;
		String name;
		
		int groupId;
		String groupName;
		Account creator;
		Date createDate;
		Account[] accounts;
		
		int accountId;
		String email;
		String userName;
		String fullName;
		Department department;
		Position position;
		Group[] groups;
		Date joinDate;
		
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
			
				account2.userName = "Linh.nguyenhoai";
	}

}
