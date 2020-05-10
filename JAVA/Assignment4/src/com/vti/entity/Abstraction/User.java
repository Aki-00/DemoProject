package com.vti.entity.Abstraction;

public abstract class User {
	private String name;
	private double salaryRatio;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalaryRatio() {
		return salaryRatio;
	}
	public void setSalaryRatio(double salaryRatio) {
		this.salaryRatio = salaryRatio;
	}
	public User(String name, double salaryRatio) {
		this.name = name;
		this.salaryRatio = salaryRatio;
	}
	
	public User() {
	}

	public double calculatePay() {
		return salaryRatio;
	}
	
	public void displayInfo() {
		System.out.println("Name: "+name);
		System.out.println("Salary Ratio: "+salaryRatio);
		System.out.println("Salary: "+calculatePay());
	}

}
