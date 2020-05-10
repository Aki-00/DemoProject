package com.vti.entity.Interface;

public class Student implements IStudent {
	private int id;
	private String name;
	private int group;
	

	public Student(String name, int group) {
		this.name = name;
		this.group =group;
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
	public int getGroup() {
		return group;
	}
	public void setGroup(int group) {
		this.group = group;
	}
	
	
	@Override
	public void rollUp() {
		System.out.println(Student.this.getName()+ " điểm danh");
		
	}
	@Override
	public void study() {
		System.out.println(Student.this.getName()+ " dang hoc bai");
		
	}
	@Override
	public void clean() {
		System.out.println(Student.this.getName()+ " dang ve sinh");
		
	}
	
}
