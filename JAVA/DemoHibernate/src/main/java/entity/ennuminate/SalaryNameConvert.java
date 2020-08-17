package entity.ennuminate;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class SalaryNameConvert implements AttributeConverter<SalaryName, String> {

	public String convertToDatabaseColumn(SalaryName name) {
		if (name == null) {
			return null;
		}
		return name.getValue();
	}
	
	public SalaryName convertToEntityAttribute(String value) {
		return SalaryName.of(value);
	}

}
