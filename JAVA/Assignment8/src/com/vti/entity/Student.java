package com.vti.entity;

import java.util.Comparator;
import java.util.Date;

public class Student implements Comparable<Student> {
private int id ;
private String name;
public static int count=1;
private Date dOB;
private float grade;


public Student(String name) {
	this.name = name;
	id = count++;
}

public Student (String name, Date dOB, float grade) {
	this.name = name;
	id = count++;
	this.dOB = dOB;
	this.grade = grade;
}
public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public Date getdOB() {
	return dOB;
}


public void setdOB(Date dOB) {
	this.dOB = dOB;
}


public float getGrade() {
	return grade;
}


public void setGrade(float grade) {
	this.grade = grade;
}


@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", dOB=" + dOB + ", grade=" + grade + "]";
}



@Override
public int compareTo(Student student) {
	return this.getName().compareTo(student.getName());
}



}
