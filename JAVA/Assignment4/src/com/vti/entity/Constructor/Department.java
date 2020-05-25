package com.vti.entity.Constructor;


public class Department {
	private byte id;
	private String name;
	
public Department(){
		
	}
	
public	Department(String name){
		this.name =name;
		id = 0;
	}
	
	public byte getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setId( String name) {
		this.id = id;
	}
	
	
	public String toString() {
		String result ="";
		result += "id: " + id+"\n";
		result += "name: "+name+"\n";
		return result;
		
	}
	
	
	
	public boolean equals(Object obj ) {
	if (obj == null) {
		return false;
	}
		
		Department department = (Department) obj;
		if (department.name.equals(this.name)) {
			return true;
		}
			return false;
		
	}

}

