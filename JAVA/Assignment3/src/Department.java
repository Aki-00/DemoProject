

public class Department {
	byte id;
	String name;
	
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

