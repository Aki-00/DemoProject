package com.vti.backend;

import com.vti.entity.Abstraction.News;
import com.vti.entity.Interface.Student;
import com.vti.entity.Polymorphism.Mymath;

public class Run {

	public static void main(String[] args) {
		Student[] students = new Student[10];
		students[0] = new Student("nguyen linh",1);
		students[1] = new Student("nguyen van vu",2);
		students[2] = new Student("nguyen hoa",3);
		students[3] = new Student("nguyen hoa",1);
		students[4]= new Student("nguyen hoa",3);
		students[5] = new Student("nguyen hoa",3);
		students[6]= new Student("nguyen hoa",2);
		students[7]= new Student("nguyen hoa",1);
		students[8] = new Student("nguyen hoa",2);
		students[9] = new Student("nguyen hoa",1);
		

		for (Student student : students) {
			student.rollUp();
			
		}
		
		for (Student student : students) {
		if (student.getGroup()==1) {
			student.study();
		}
	}
		
		for (Student student : students) {
			if (student.getGroup()==2) {
				student.clean();
			}
		}
		
		Mymath myMath = new Mymath();
		int x = myMath.sum(2, 3);
		System.out.println(x);

}
}
