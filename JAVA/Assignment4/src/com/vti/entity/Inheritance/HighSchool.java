package com.vti.entity.Inheritance;

public class HighSchool extends Student {
	String clazz;
	String desiredUniversity;

	public HighSchool(String fullName, int id, String clazz, String desiredUniversity) {
		super(fullName, id);
		this.clazz = clazz;
		this.desiredUniversity = desiredUniversity;		
	}

	
	public static void main(String[] args) {
		HighSchool highschool = new HighSchool("Nam",1,"chuyen Van","DHCN");
	}
}
