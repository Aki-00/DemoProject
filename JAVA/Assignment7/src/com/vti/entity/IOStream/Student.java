package com.vti.entity.IOStream;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Student implements Serializable{

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
int id;
String name;

public Student () {
	id = ScannerUtils.inputInt("nhap int");
	name = ScannerUtils.inputString();
}

@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + "]";
}

public static void main(String[] args) {
	List<Student> students = new ArrayList<Student>();
	
//	for (int i=0;i<3;i++) {
//		Student student = new Student();
//		int id = ScannerUtils.inputInt("nhap id");
//		String name = ScannerUtils.inputString();
//		students.add(student);
//	}
//	
//	for (Student student : students) {
//		try {
//			IOManager.writeObject(student, "/Users/Aki/Desktop/UBM.text");
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
		
//
	

//	try {
//		IOManager.readObject("/Users/Aki/Desktop/UBM.text");
//	} catch (Exception e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	

}
}

