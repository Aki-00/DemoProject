package com.vti.frontend;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.vti.entity.Student;

public class MapDemo {
	
	static Map <Integer, String> students = new HashMap<>();
	
public static void main(String[] args) {
	students.put(1, "Nguyen Van Nam");
	students.put(2, "Nguyen Van Huyen");
	students.put(3, "Tran Van Nam");
	students.put(4, "Nguyen Van A");

	//a
	Set<Integer> set = students.keySet();
	System.out.println(set);
	//b
	for (Integer key : set) {
		System.out.println(students.get(key));
	}
	//c

	
	//d
	Set set1 =students.entrySet();
	
}
}
