package com.vti.frontend;

import java.util.Date;

import com.vti.entity.Student;

public class Annotations {
@SuppressWarnings("deprecation")
public static void main(String[] args) {
	//Q1
	Date date = new Date(2020, 5, 9);
	
	//Q2
	Student student = new Student("Nguyen Van A");
	System.out.println(student);
	
	student.getId();
	student.getIdV2();


}
}
