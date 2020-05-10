package com.vti.entity.Abstraction;

public enum Priority {

	
	LOW, MEDIUM, HIGH;

//	private String text;
//	Priority(String text) {
//		this.text = text;
//	}

	public static Priority getPriority(String priority) {
		Priority low = LOW;
		if (priority.equals(low)){
			return low;
		} else {
			Priority medium2 = MEDIUM;
			if (priority.equals(medium2)){
				return medium2;
			} else {
				Priority high2 = HIGH;
				if (priority.equals(high2)) {
					return high2;
				}else System.out.println("Moi nhap lai!");
				return null;
			}
			}
		}
		
}
