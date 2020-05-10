package com.vti.entity.Abstraction;

public class Waiter extends User {
	
	
	
	public Waiter() {
		super();
	}

	public Waiter(String name, double salaryRatio) {
		super(name, salaryRatio);
	}

	@Override
	public double calculatePay() {
		return super.calculatePay()*220;
	}
	
	@Override
	public void displayInfo() {
		System.out.println("Thong tin cua Waiter");
		super.displayInfo();
		System.out.println();
	}
}
