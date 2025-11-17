package org.example.poc.excel;

import java.io.File;
import java.io.FileInputStream;
import java.util.*;

public class ExcelToDTOMapper {

        public static void main(String[] args) {
            // Simulated Excel row (header -> value)
            Map<String, String> row = Map.of(
                    "name", "Alice",
                    "age", "30",
                    "active", "true",
                    "joined", "2024-01-01T10:30",
                    "salary", "1000.50"
            );

            // Setup field map for mapping headers to DTO setters
            PersonDTO dto = new PersonDTO();
            Map<String, FieldSetter<PersonDTO>> fieldMap = new HashMap<>();

            fieldMap.put("name", FieldSetters.stringSetter(PersonDTO::setName));
            fieldMap.put("age", FieldSetters.intSetter(PersonDTO::setAge));
            fieldMap.put("active", FieldSetters.booleanSetter(PersonDTO::setActive));
            fieldMap.put("salary", FieldSetters.bigDecimalSetter(PersonDTO::setSalary));

            // ✅ Header validation
            List<String> requiredHeaders = List.of("name", "age", "active", "joined", "salary");
            for (String header : requiredHeaders) {
                if (!row.containsKey(header)) {
                    throw new IllegalArgumentException("Missing required header: " + header);
                }
            }

            // ✅ Mapping values
            for (Map.Entry<String, String> entry : row.entrySet()) {
                String header = entry.getKey();
                String value = entry.getValue();
                FieldSetter<PersonDTO> setter = fieldMap.get(header);

                if (setter != null) {
                    setter.set(dto, value);
                }
            }

            // ✅ Final DTO
            System.out.println(dto.getName()); // Alice
        }

}
