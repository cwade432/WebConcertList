/**
 * @author Elizabeth Allen - eallen12
 * CIS175 - Fall 2021
 * Oct 4, 2021
 */
package controller;
import java.sql.Date;
import java.time.LocalDate;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class LocalDateAttributeConverter implements AttributeConverter<LocalDate, Date> {
		
	@Override
	public Date convertToDatabaseColumn(LocalDate attribute) {
		return (attribute == null ? null: Date.valueOf(attribute));
	}
		
	@Override
	public LocalDate convertToEntityAttribute (Date dbData) {
		return (dbData == null ? null : dbData.toLocalDate());
	}
		
}



