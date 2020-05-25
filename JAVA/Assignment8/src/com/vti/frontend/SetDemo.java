package com.vti.frontend;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.vti.entity.Student;

public class SetDemo {
	static Set <Student> students = new HashSet<>();
	
	public static void main(String[] args) {
		students.add(new Student("Linh"));
		students.add(new Student("Linh"));
		students.add(new Student("Linh"));
		
		for (Student student : students) {
			System.out.println(student);
			
		}
		
	System.out.println(students.iterator());
		
	}
	
//	public static void withoutDuplicateName() {
//		String s = "";
//		for (int i = 0; i < students.size() - 1; i++) {
//			for (int j = i + 1; j < students.size() - 1; j++) {
//				if (!students..get(i).getName().equalsIgnoreCase(students.get(j).getName())) {
//					s = students.get(i).getName() + " ";
//				}
//			}
//
//		}
//		System.out.println(s);
//	}
	
}
