package com.vti.entity.Abstraction;

public class Employee extends User {

	public Employee() {
		super();
	}

	public Employee(String name, double salaryRatio) {
		super(name, salaryRatio);
	}

	@Override
	public double calculatePay() {
		return super.calculatePay()*420;
	}
	
	@Override
	public void displayInfo() {
		System.out.println("Thong tin cua employee la:");
		super.displayInfo();
		System.out.println();
	}
}
