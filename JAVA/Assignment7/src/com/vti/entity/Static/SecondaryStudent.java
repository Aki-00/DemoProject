package com.vti.entity.Static;

public class SecondaryStudent extends Student {
	public static int count;

	public SecondaryStudent(int id, String name) {
		super(id, name);
		count++;
	}

}
