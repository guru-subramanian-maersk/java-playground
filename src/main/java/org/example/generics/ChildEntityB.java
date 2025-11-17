package org.example.generics;

import lombok.*;
import lombok.experimental.SuperBuilder;


@Getter
@Setter
@SuperBuilder
public class ChildEntityB extends BaseEntity {
    private String additionalFieldB;
}

