package org.example.poc.excel;


import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
public class PersonDTO {
    private String name;
    private int age;
    private boolean active;
    private LocalDateTime createdDate;
    private BigDecimal salary;

    // Getters and Setters
}
