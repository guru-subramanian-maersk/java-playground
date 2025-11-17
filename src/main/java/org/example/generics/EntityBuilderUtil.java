package org.example.generics;



public class EntityBuilderUtil {

    // Generic method to set up common fields for child entities
    public static <T extends BaseEntity.BaseEntityBuilder<?, ?>> T setupCommonFields(
            T builder, Long id, String name, String description) {
        return (T) builder.id(id).name(name).description(description);
    }
}

