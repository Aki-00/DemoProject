package com.vti.entity;

public class Staff extends Employee{
	
	private String job;
	
	public Staff(String fullName, Gender gender, String job) {
		super(fullName, gender);
		this.job = job;
	}


	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
	
}
