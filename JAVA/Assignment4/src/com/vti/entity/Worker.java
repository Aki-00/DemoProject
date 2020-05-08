package com.vti.entity;

public class Worker extends Employee{
	

	private Level level;
	
	public Worker(String fullName, Gender gender,Level level) {
		super(fullName, gender);
		this.level = level;
	}

	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}
	
	
}
