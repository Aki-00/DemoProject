package com.vti.frontend;

import java.util.ArrayList;
import java.util.List;

import com.vti.entity.Employee;
import com.vti.entity.GenericStudent;

public class Program3 {
public static void main(String[] args) {
	
	//Q1
	GenericStudent<Integer> student1 = new GenericStudent<Integer>(1, "Linh");
	GenericStudent<Double> student2 = new GenericStudent<Double>(3.0, "Anh");
	GenericStudent<Float> student3 = new GenericStudent<Float>(3.0f, "Anh");

	//Q2
	print(student1);
}
//	print(4);
//	print(4.0);
//	
//	//Q4
//	List<Integer> numbers1 = new ArrayList<Integer>();
//	for (int i = 0; i < 10; i++) {
//		numbers1.add(i);
//	}
//	
//	List<Float> numbers2 = new ArrayList<Float>();
//	numbers2.add(0.2f);
//	numbers2.add(4.0f);
//	numbers2.add(7.2f);
//	
//	printNumber(numbers1);
//	printNumber(numbers2);
//	
//	//Q5
//	List<Integer> salaries1 = new ArrayList<Integer>();
//	salaries1.add(100);
//	salaries1.add(200);
//	salaries1.add(300);
//	salaries1.add(400);
//	
//	Employee<Integer> employee1 = new Employee<Integer>(1,"Linh",salaries1);
//	employee1.print();
//	employee1.printSalary();
//}
//
public static <T> void print (T a) {
	System.out.println(a);
}
//
//public static <E> void printNumber (List<E> array) {
//	for (E  x : array) {
//		System.out.println(x);
//	}
//	}

}



