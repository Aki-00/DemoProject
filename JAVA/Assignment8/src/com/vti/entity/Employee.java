package com.vti.entity;

import java.util.List;

public class Employee<E> {
private int id;
private String name;
private List<E> salaries;
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
public List<E> getSalaries() {
	return salaries;
}
public void setSalaries(List<E> salaries) {
	this.salaries = salaries;
}
public Employee(int id, String name, List<E> salaries) {
	this.id = id;
	this.name = name;
	this.salaries = salaries;
}

public void print() {
	System.out.println("id: "+id);
	System.out.println("name: "+name);
	for (E e : salaries) {
		System.out.println(e);
	}
}

public void printSalary() {
	System.out.println(salaries.get(salaries.size()-1));
}
	
}
