package com.vti.frontend;

import com.vti.entity.Static.PrimaryStudent;
import com.vti.entity.Static.SecondaryStudent;
import com.vti.entity.Static.Student;

import con.vti.entity.Final.MyMath;

public class Ex1_Run {
	public static void main(String[] args) {
		
//Q1.
		Student student1 = new PrimaryStudent(1,"Nguyen Linh");
		Student student2 = new PrimaryStudent(2,"Nguyen Sa");
		Student student3 = new SecondaryStudent(1,"Nguyen Linh");
		Student student4 = new SecondaryStudent(2,"Nguyen An");
		Student student5 = new SecondaryStudent(3,"Nguyen Hoai");
		Student student6 = new SecondaryStudent(4,"Nguyen Trong");
	
		Student[] students = { student1, student2, student3 };
		for (Student student : students) {
			System.out.println(student);
		}

		Student.setCollege("Đại học công nghệ");
		for (Student student : students) {
			System.out.println(student);
		}
//Q2
		for (Student student : students) {
			Student.money = student.money + 100;
		}

		System.out.println(Student.money);

		Student.money = student1.money - 50;
		System.out.println(Student.money);

		Student.money = student2.money - 20;
		System.out.println(Student.money);

		Student.money = student3.money - 150;
		System.out.println(Student.money);

		for (Student student : students) {
			Student.money = student.money + 50;
		}
		System.out.println(Student.money);
//Q3
		MyMath.sum(2);
		
//Q6
		
		
		System.out.println(Student.count);
		System.out.println(PrimaryStudent.count);
		System.out.println(SecondaryStudent.count);
		
		
	}
}
