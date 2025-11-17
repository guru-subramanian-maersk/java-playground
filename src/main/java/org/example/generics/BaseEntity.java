package org.example.generics;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder // Enables inheritance of builders
public class BaseEntity {
    private Long id;
    private String name;
    private String description;
}
