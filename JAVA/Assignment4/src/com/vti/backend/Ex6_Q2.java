package com.vti.backend;

import java.util.ArrayList;

import com.vti.entity.Abstraction.Employee;
import com.vti.entity.Abstraction.Manager;
import com.vti.entity.Abstraction.User;
import com.vti.entity.Abstraction.Waiter;

public class Ex6_Q2 {

	ArrayList<User> users = new ArrayList<User>();
	
    User user1 = new Employee("Jame",2.5);
	User user2 = new Manager("Peter",1.9);
	User user3 = new Waiter("John",3.0);
	
	public void displayInfo() {
		
		users.add(user1);
		users.add(user2);
		users.add(user3);
		
		for(int i=0;i<users.size();i++) {			
			users.get(i).displayInfo();
		}
		
	}
}
