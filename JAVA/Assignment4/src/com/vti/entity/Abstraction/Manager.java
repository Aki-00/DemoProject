package com.vti.entity.Abstraction;

public class Manager extends User {

	public Manager() {
		super();
	}

	public Manager(String name, double salaryRatio) {
		super(name, salaryRatio);
	}

	@Override
	public double calculatePay() {
		return super.calculatePay()*520;
	}
	
	@Override
	public void displayInfo() {
		System.out.println("Thong tin cua manager");
		super.displayInfo();
		System.out.println();
	}
}
