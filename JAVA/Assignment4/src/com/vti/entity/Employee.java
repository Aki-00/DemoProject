package com.vti.entity;

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

	public String getAddress() {
		return address;
	}
	
	public Employee(String fullName, Gender gender) {
		this.fullName = fullName;
		this.gender = gender;
	}
	
	
}
