package entity.ennuminate;

public enum TypeName {
	ESAY("0"), MULTIPLECHOICE("1");
	
	private String value;

	/**
		 * Constructor for class PositionName
		 * 
		 * @Description: .
		 * @author: Bich.NTN
		 * @create_date: Jul 5, 2020
		 * @version: 1.0
		 * @modifer: Bich.NTN
		 * @modifer_date: Jul 5, 2020
		 */
	private TypeName(String value) {
		this.value = value;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public static TypeName of (String value) {
		if (value == null) {
			return null;
		}
		
		for (TypeName name : TypeName.values()) {
			if (name.getValue().equals(value)) {
				return name;
			}
		}
		return null;
	}
	
	
}
