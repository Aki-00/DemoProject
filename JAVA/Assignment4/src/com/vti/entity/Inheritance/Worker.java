package com.vti.entity.Inheritance;

import java.util.Scanner;

public class Worker extends Employee{
	

	private Level level;
	
	public Worker(String fullName, Gender gender,Level level) {
		super(fullName, gender);
		this.level = level;
	}
	
	public Worker() {
		
	}

	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}
	
	@Override
	public void input() {
		System.out.println();
		System.out.println("Moi ban nhap thong tin nhan vien");
		Scanner scanner = new Scanner(System.in);
		super.input();
		System.out.print("Moi ban nhap bac, chon so tu 1=>10 ");
		int inputLevel = scanner.nextInt();
		setLevel(Level.getLevel(inputLevel));
	}
	
	@Override
	public void ouput() {
		super.ouput();
		System.out.println("Bac: "+this.getLevel());
	}
	
}
