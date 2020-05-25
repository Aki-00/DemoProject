package com.vti.entity.IOStream;

import java.io.Serializable;

public class Student implements Serializable{

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
int id;
String name;

public Student () {
	id = ScannerUtils.inputInt("nhap id");
	name = ScannerUtils.inputString();
}

@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + "]";
}

public static void main(String[] args) {
	
	int id = ScannerUtils.inputInt("nhap id");
	String name = ScannerUtils.inputString();
	
	
Student student1 = new Student();
Student student2 = new Student();
Student student3 = new Student();

try {
	IOManager.writeObject(student1, "studentinformation.txt");
} catch (Exception e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}
try {
	IOManager.writeObject(student2, "studentinformation.txt");
} catch (Exception e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}
try {
	IOManager.writeObject(student3, "studentinformation.txt");
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

try {
	IOManager.readObject("studentinformation.txt");
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();


}
}
}

