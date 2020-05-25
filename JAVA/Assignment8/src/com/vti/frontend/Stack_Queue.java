package com.vti.frontend;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import com.vti.entity.Student;

public class Stack_Queue{
	public static void main(String[] args) {
//		Stack <Student> candicates = new Stack<Student>();
//		candicates.push(new Student("Nguyen Van Nam"));
//		candicates.push(new Student("Nguyen Van Huyen"));
//		candicates.push(new Student("Tran Van Nam"));
//		candicates.push(new Student("Nguyen Van A"));
//		
//		
//		while(!candicates.isEmpty()) {
//			System.out.println(candicates.pop());
//		}
		
		
		Queue <Student> candicates2 = new LinkedList<Student>();
		
		candicates2.add(new Student("Nguyen Van Nam"));
		candicates2.add(new Student("Nguyen Van Huyen"));
		candicates2.add(new Student("Tran Van Nam"));
		candicates2.add(new Student("Nguyen Van A"));
		
		while(!candicates2.isEmpty()) {
			System.out.println(candicates2.poll());
		}
	}

	
	
}
