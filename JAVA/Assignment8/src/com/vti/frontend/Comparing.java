package com.vti.frontend;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import com.vti.entity.Student;

public class Comparing {
public static void main(String[] args) throws ParseException {
	List<Student> students = new ArrayList<Student>();
	
	// dateformat.parse
	SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
	
	students.add(new Student("Linh", dateformat.parse("2000-03-14"),9.7f));
	students.add(new Student("Linh", dateformat.parse("1993-03-14"),6.9f));
	students.add(new Student("Linh", dateformat.parse("2000-05-14"),8.0f));
	students.add(new Student("An", dateformat.parse("2000-03-14"),6.7f));
	
	//Q1
	Collections.sort(students);
	for (Student student : students) {
		System.out.println(student);
	}
	
	//Q2
	Comparator<Student> comparator  = new Comparator<Student>() {

		@Override
		public int compare(Student o1, Student o2) {
			return Comparator.comparing(Student::getName)
					.thenComparing(Student::getdOB)
					.thenComparingDouble(Student::getGrade)
					.compare(o1,o2);
		}
		
	};
	
//	Collections.sort(students, comparator);
//	for (Student student : students) {
//		System.out.println(student);
//	}
	
}
}
