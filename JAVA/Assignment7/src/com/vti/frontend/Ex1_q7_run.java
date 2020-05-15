package com.vti.frontend;

import com.vti.entity.Static.Student;

public class Ex1_q7_run {

	
	
	public static void main(String[] args) {
		
			Student student1;
			try {
				student1 = Student.controlNumber(1, "Linh");
			} catch (Exception e) {
				student1 = null;
				e.printStackTrace();
			}
			Student student2;
			try {
				student2 = Student.controlNumber(2, "Anh");
			} catch (Exception e) {
				student2 = null;
				e.printStackTrace();
			}
			Student student3;
			try {
				student3 = Student.controlNumber(3, "Hang");
			} catch (Exception e) {
				student3 = null;
				e.printStackTrace();
			}
			
		
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		
	}
}
