package org.example;

import org.example.generics.BaseEntity;
import org.example.generics.ChildEntityA;
import org.example.generics.ChildEntityB;
import org.example.generics.EntityBuilderUtil;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        // Set up common fields
        Long id = 1L;
        String name = "Common Name";
        String description = "Common Description";

        // Create an instance of ChildEntityA with additional fields
        ChildEntityA childA = EntityBuilderUtil.setupCommonFields(
                        ChildEntityA.builder(), id, name, description)
                .additionalFieldA("Extra Info A")
                .build();

        System.out.println("Child A ID: " + childA.getId());
        System.out.println("Child A Name: " + childA.getName());
        System.out.println("Child A Description: " + childA.getDescription());
        System.out.println("Child A Additional Field: " + childA.getAdditionalFieldA());

        // Create an instance of ChildEntityB with additional fields
        ChildEntityB childB = EntityBuilderUtil.setupCommonFields(
                        ChildEntityB.builder(), id, name, description)
                .additionalFieldB("Extra Info B")
                .build();

        System.out.println("\nChild B ID: " + childB.getId());
        System.out.println("Child B Name: " + childB.getName());
        System.out.println("Child B Description: " + childB.getDescription());
        System.out.println("Child B Additional Field: " + childB.getAdditionalFieldB());
    }
}
