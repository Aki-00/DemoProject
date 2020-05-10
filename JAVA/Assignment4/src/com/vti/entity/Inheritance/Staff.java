package com.vti.entity.Inheritance;

import java.util.Scanner;

public class Staff extends Employee{
	
	private String job;
	
	public Staff(String fullName, Gender gender, String job) {
		super(fullName, gender);
		this.job = job;
	}

	public Staff() {
		
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
	
	@Override
	public void input() {
		System.out.println();
		System.out.println("Moi ban nhap thong tin nhan vien");
		Scanner scanner = new Scanner(System.in);	
		super.input();
		System.out.print("Moi ban nhap cong viec ");
		setJob(scanner.next());
	}
	
	@Override
	public void ouput() {
		super.ouput();
		System.out.println("Cong viec: "+this.getJob());
	}
}
