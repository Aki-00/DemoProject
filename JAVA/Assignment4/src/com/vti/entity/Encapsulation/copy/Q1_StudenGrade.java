package com.vti.entity.Encapsulation.copy;

public class Q1_StudenGrade {
	public static void main(String[] args) {
		Student student1 = new Student("Do Thi Mai", "Hanoi");
		Student student2 = new Student("Do Nhat Minh", "Bac Ninh");
		student1.setGrade(5);
		student1.setGrade2(-2);
		System.out.println("Thong tin hoc sinh la: "+student1);
		
	}
	
}
