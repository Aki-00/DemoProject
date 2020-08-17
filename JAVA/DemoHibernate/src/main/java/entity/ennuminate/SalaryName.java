package entity.ennuminate;

public enum SalaryName {
	DEV("600"), TEST("700"), ScrumMaster("1500"), PM("2000");
	
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
	private SalaryName(String value) {
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
	public static SalaryName of (String value) {
		if (value == null) {
			return null;
		}
		
		for (SalaryName name : SalaryName.values()) {
			if (name.getValue().equals(value)) {
				return name;
			}
		}
		return null;
	}
	
	
}
