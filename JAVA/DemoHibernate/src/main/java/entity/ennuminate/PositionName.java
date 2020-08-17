package entity.ennuminate;

public enum PositionName {
	DEV("Dev"), TEST("Test"), ScrumMaster("ScrumMaster"), PM("PM");
	
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
	private PositionName(String value) {
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
	public static PositionName of (String value) {
		if (value == null) {
			return null;
		}
		
		for (PositionName name : PositionName.values()) {
			if (name.getValue().equals(value)) {
				return name;
			}
		}
		return null;
	}
	
	
}
