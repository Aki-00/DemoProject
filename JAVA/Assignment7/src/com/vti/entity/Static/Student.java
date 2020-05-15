package com.vti.entity.Static;

public class Student {
	private int id;
	private String name;
	private static String college;
	public static int money;
	public static int count;

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

	public static String getCollege() {
		return college;
	}

	public static void setCollege(String college) {
		Student.college = college;
	}

	protected Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		college = "Đại học bách khoa";
		count++;
	}

	protected Student() {

	}

	private static Student student;

	public static Student controlNumber(int id, String name) throws Exception {

		if (count < 2) {
			student = new Student(id,name);
		} else {
			student = null;
			throw new Exception("Khong the tao nhieu hon 2 hoc sinh");
		}

		return student;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", college=" + college + "]";
	}

}
