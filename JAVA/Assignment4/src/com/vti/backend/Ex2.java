package com.vti.backend;

import com.vti.entity.Encapsulation.copy.Student;

public class Ex2 {

	
	//Q1. Xep loai hoc luc
	public static void studentGrade() {
		Student student1 = new Student("Do Thi Mai", "Hanoi");
		Student student2 = new Student("Do Nhat Minh", "Bac Ninh");
		student1.setGrade(5);
		student1.setGrade2(-2);
		System.out.println("Thong tin hoc sinh la: "+student1);
}
}
