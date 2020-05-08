package com.vti.entity;

public class Engineer extends Employee{

	
	private String field;
	
	public Engineer(String fullName, Gender gender,String field) {
		super(fullName, gender);
		this.field = field;
		
	}


	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}
	
	private void toSting() {
		String info = "Ho ten: "+getFullName() +" Gender: "+ getGender() + "Linh vuc: "+field;

	}
	
}
