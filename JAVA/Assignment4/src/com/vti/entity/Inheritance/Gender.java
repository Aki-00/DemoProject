package com.vti.entity.Inheritance;

public enum Gender {
	
 MALE, FEMALE, NA;


		public static Gender getGender(int inputGender) {
	        switch(inputGender) {
	        case 0:
	            return NA;
	        case 1:
	            return FEMALE;
	        case 2:
	        	return MALE;
	        }
	        return NA;
	    }
	
}
