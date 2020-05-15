package Exception;

import java.util.Date;

public class Account extends ScannerUtils {
	private int accountId;
	private String email;
	private String userName;
	private String fullName;
	private Department[] departments;
	private Position position;
	private Date createDate;
	private Group[] groups;
	private Date joinDate;

	public Account() {
		System.out.println("Moi nhap thong tin account");
		System.out.println("Moi nhap ID");
		accountId = inputInt("Error! Please input again");
		System.out.println("Moi nhap email");
		email = inputString();
		System.out.println("Moi nhap username");
		userName = inputString();
		System.out.println("Moi nhap fullname");
		fullName = inputString();
		departments = inputDepartment();
		System.out.println("Moi nhap position");
		position = new Position();

	}

	@Override
	public int inputInt(String errorMessage) {
		return super.inputInt(errorMessage);
	}

	@Override
	public String inputString() {
		return super.inputString();
	}

	public int inputInToChoose() {
		int x=0;
		boolean retry = true;
		while (!retry) {
			x = inputInt("Error! Please input again");
			switch (x) {
			case 1:
			case 2:
				return x;
			default:
				System.out.println("Moi nhap lai");
				retry = false;
			}
		}
		return x;
	}

	public Department[] inputDepartment() {
		System.out.println("Ban co muon nhap thong tin department cho account khong? 1:yes, 2:no");
		int x = inputInToChoose();
		if (x == 1) {
			System.out.println("Moi nhap so department muon them");
			int n = inputInt("Error! Please input again");
			for (int i = 0; i < n; i++) {
				Department department = new Department();
				departments[i] = department;
			}
		}
		return departments;
	}
	
	
}
