package com.vti.entity.Static;

public class PrimaryStudent extends Student {
	public static int count;

	public PrimaryStudent(int id, String name) {
		super(id, name);
		count++;
	}

}
