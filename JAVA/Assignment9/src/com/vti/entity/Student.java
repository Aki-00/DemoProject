package com.vti.entity;

public class Student {

	private int id;
	private String name;
	public static int count=1;
	public Student(String name) {
		super();
		this.id = count++;
		this.name = name;
	}
	
	/**
	 * 
	 * @deprecated replaced by {@link #getIdV2()}}
	 */
	@Deprecated
	public int getId() {
		return id;
	}
	
	public void getIdV2() {
		System.out.println("MSV: "+id);
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

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
