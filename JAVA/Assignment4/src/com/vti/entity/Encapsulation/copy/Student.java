package com.vti.entity.Encapsulation.copy;

public class Student {

	private int id;
	private String name;
	private String hometown;
	private float grade;
	private String level;
	
	public Student(String name, String hometown){
		this.name = name;
		this.hometown = hometown;
		grade =0;
	}
	
	
	//tao ham getter
	public String getName() {
		return name;
	}
		
	public String getHometown() {
		return hometown;
	}
	
	public float getGrade() {
		return grade;
	}
	
	public String getLevel() {
		if (grade <4.0) {
			return level = "Yeu";
		}else if (grade>=4.0 && grade<6.0) {
			return level ="Trung Binh";
		}else if (grade>6.0 && grade>8.0) {
			return level ="Kha";
		}else return level = "Gioi";
		
	}
	
	//Tao ham setter
	public void setGrade(float grade) {
		this.grade=grade;
	}
	
	public void setGrade2(float plusGrade) {
		this.grade=grade+plusGrade;
	}
	

	
	//Override toString
	@Override
	public String toString() {
		String info ="Ten: "+name+" Diem hoc luc:"+ grade+" Xep loai: "+getLevel();
		return info;
	}
}
