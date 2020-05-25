package com.vti.backend;

import java.util.Date;

import com.vti.entity.Constructor.Account;
import com.vti.entity.Constructor.Department;
import com.vti.entity.Constructor.Group;
import com.vti.entity.Constructor.Position;

public class Ex1 {
	public static void main(String[] args) {

		// Ex1.

		// Ex2.

		// Ex3.

	}

	public void Ex1() {
		Department department1 = new Department();
		Department department2 = new Department("HR");
	}

	public Account[] Ex2() {
		Position position1 = new Position((byte) 1, "Fresher");

		Account account1 = new Account();

		Account account2 = new Account(2, "an@gmail.com", "an nguyen", "Nguyen An");

		Account account3 = new Account(3, "linh@gamil.com", "linhnguyen", "Nguyen Linh", position1);

		Account account4 = new Account(4, "loan@gmail", "loando", "Do Loan", position1, new Date());

		Account[] allAccounts = { account1, account2, account3, account4 };
		return allAccounts;

	}

	public void Ex3(Account[] allAccounts) {
		Group group1 = new Group();
		Position position1 = new Position((byte) 1, "Fresher");
		Account account1 = new Account();
		Account account2 = new Account(2, "an@gmail.com", "an nguyen", "Nguyen An");

		Account account3 = new Account(3, "linh@gamil.com", "linhnguyen", "Nguyen Linh", position1);

		Account account4 = new Account(4, "loan@gmail", "loando", "Do Loan", position1, new Date());

		Account[] accountOfGroup2s = { account1, account2, account3 };

		Group group2 = new Group("Group Java", account2, accountOfGroup2s, new Date());

		String[] userNameOfGroup3 = { "loananh", "hongmai", "phuminh" };
		Group group3 = new Group("Group DB", account2, userNameOfGroup3, new Date());
	}

}
