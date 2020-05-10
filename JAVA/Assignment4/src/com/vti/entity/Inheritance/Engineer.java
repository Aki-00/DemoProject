package com.vti.entity.Inheritance;

import java.util.Scanner;

public class Engineer extends Employee{

	
	private String field;
	
	
	
	public Engineer(String fullName, Gender gender,String field) {
		super(fullName, gender);
		this.field = field;
		
	}

	public Engineer() {
		
	}
	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}
	
	private void toSting() {
		String info = "Ho ten: "+getFullName() +" Gender: "+ getGender() + "Linh vuc: "+field;

	}
	
	@Override
	public void input() {
		System.out.println();
		System.out.println("Moi ban nhap thong tin ki su");
		Scanner scanner = new Scanner(System.in);		
		super.input();
		System.out.print("Moi ban nhap linh vuc: ");
		setField(scanner.next());
	}
	
	@Override
	public void ouput() {		
		super.ouput();
		System.out.println("Linh vuc: "+ this.getField());
	}
	
}
