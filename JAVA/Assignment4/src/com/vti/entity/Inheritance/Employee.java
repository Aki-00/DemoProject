package com.vti.entity.Inheritance;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
	
	private String fullName;
	private byte age;
	private Gender gender;
	private String address;
	
	public String getFullName() {
	return fullName;
	}
	
	public void setFullName (String fullName) {
		this.fullName = fullName;
	}
	
	public byte getAge() {
		return age;
	}
	
	
	public Gender getGender() {
		return gender;
	}
	
	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}
	
	public Employee(String fullName, Gender gender) {
		this.fullName = fullName;
		this.gender = gender;
	}
	
	public Employee() {
		
	}
	

		public void input() {	
			Scanner scanner = new Scanner(System.in);
			
					System.out.print("Moi ban nhap ten");
					setFullName(scanner.nextLine());
					System.out.print("Moi ban nhap so gender, chon tu 1:FEMALE, 2:MALE, 0:NA");
					int inputGender = scanner.nextInt();
					setGender(Gender.getGender(inputGender));										
			
			}
	
		public void ouput() {
			System.out.println("Ho ten: "+ this.getFullName());
			System.out.println("Gender: "+this.getGender());
		}
	
	
	
}
