import java.util.Date;
import java.util.Random;

public class Ex1_DataTypeCasting {

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
				account1.email = "An@gmail.com";
				account1.fullName = "Nguyen Van An";
				Group[] groupOfAccount1 = {group1};
				account1.groups = groupOfAccount1;
				account1.joinDate = new Date (2020-03-13);
				account1.userName = "an.nguyenvan";
				
				Account account2 = new Account();
				account2.accountId = 2;
				account2.createDate = new Date (2020-01-9);
				account2.email = "Linh@gmail.com";
				account2.fullName = "Nguyen Hoai Linh";
				Group[] groupOfAccount2 = {group3};
				account2.groups = groupOfAccount2;
				account2.joinDate = new Date (2020-03-13);
				account2.userName = "Linh.nguyenhoai";
				
				Account account3 = new Account();
				account3.accountId = 3;
				account3.createDate = new Date (2020-03-19);
				account3.email = "ha@gmail.com";
				account3.fullName = "Pham Hai Ha";
				Group[] groupOfAccount3 = {group1};
				account3.groups = groupOfAccount3;
				account3.joinDate = new Date (2020-03-13);
				account3.userName = "Ha.phamhai";
				
				//Q1	

		float salary1 = 5240.5f;
		float salary2 = 10970.055f;
		int salary1I = (int)salary1;
		int salary2I = (int)salary2;
		
		String salaryOfAccount = Float.toString(salary1);
		String salaryOfAccount1 = salary1 + "";
		
		System.out.println(salary1I);
		System.out.println(salary2I);
		
		int a = 1;
		int b = 2;
		
		float c = (float)a/b;
		
		System.out.println(c);
		
		//Q2
		Random random = new Random();
		int number = random.nextInt(99999);
		String numberFormat = String.format("%05d",number);
		System.out.println(numberFormat);
		
		//Q3
		String endNumber = numberFormat.substring(numberFormat.length() - 2);
		System.out.println(endNumber);
		
		//Q4
		byte x = (byte) account1.groups.length;
		System.out.println(x);
		
	
		
		//Q5
	
	    float result = tinhThuong(1,2);
	    System.out.println(result);
	    
	}
		
		//Method tra ve thuong
		public static float tinhThuong (int a, int b) {
			float c = (float)a/b;
			return c;
							
		}
		
	}


