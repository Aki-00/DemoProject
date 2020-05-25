package com.vti.frontend;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.vti.entity.Student;

public class Program1 {

	static List<Student> students = new ArrayList<Student>();

	public static void main(String[] args) {

		students.add(new Student("Linh"));
		students.add(new Student("Linh"));
		students.add(new Student("Linh"));
//a
		for (Student student : students) {
			System.out.println(student);
		}
//b
//		System.out.println(students.get(3));
//c
		System.out.println(students.get(0));
		System.out.println(students.get(students.size() - 1));
//d
		students.add(0, new Student("Mai"));
//e
		students.add(students.size(), new Student("An"));

		for (Student student : students) {
			System.out.println(student);

		}
//f
		Collections.reverse(students);
		for (Student student : students) {
			System.out.println(student);
			
		}
//g		
		searchByID(2);
//h
		searchByName("Linh");
//i
		duplicateName();
//j
		searchByID(2).setName(null);
//k
		withoutDuplicateName();

//l
		students.remove(searchByID(5));
//m
		List<Student> studentCopies = new ArrayList<Student>(students.size());
		for (Student student : students) {
			studentCopies.add(student);
		}

	}

	public static Student searchByID(int id) {
		Student student = null;
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getId() == id) {
				student = students.get(i);
				System.out.println(students.get(i));
			}

		}
		return student;
	}

	public static void searchByName(String name) {
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getName() == name) {
				System.out.println(students.get(i));
			}
		}
	}

	public static void duplicateName() {
		String s = "";
		for (int i = 0; i < students.size() - 1; i++) {
			for (int j = i + 1; j < students.size() - 1; j++) {
				if (students.get(i).getName().equalsIgnoreCase(students.get(j).getName())) {
					s = students.get(i).getName() + " ";
				}
			}

		}
		System.out.println(s);
	}

	public static void withoutDuplicateName() {
		String s = "";
		for (int i = 0; i < students.size() - 1; i++) {
			for (int j = i + 1; j < students.size() - 1; j++) {
				if (!students.get(i).getName().equalsIgnoreCase(students.get(j).getName())) {
					s = students.get(i).getName() + " ";
				}
			}

		}
		System.out.println(s);
	}
}
