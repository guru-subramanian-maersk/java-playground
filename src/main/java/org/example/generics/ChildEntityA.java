package org.example.generics;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
public class ChildEntityA extends BaseEntity {
    private String additionalFieldA;
}

