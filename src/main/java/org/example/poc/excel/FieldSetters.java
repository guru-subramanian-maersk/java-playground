package org.example.poc.excel;

import java.math.BigDecimal;
import java.util.function.BiConsumer;

public class FieldSetters {

    public static <T> FieldSetter<T> stringSetter(BiConsumer<T, String> consumer) {
        return (target, value) -> {
            if (value == null || value.trim().isEmpty()) {
                return;
            }
            consumer.accept(target, value.trim());
        };
    }

    public static <T> FieldSetter<T> intSetter(BiConsumer<T, Integer> consumer) {
        return (target, value) -> {
            try {
                consumer.accept(target, Integer.parseInt(value.trim()));
            } catch (Exception e) {
                System.out.println("Error parsing integer for '" + "' at row " );
            }
        };
    }

    public static <T> FieldSetter<T> booleanSetter(BiConsumer<T, Boolean> consumer) {
        return (target, value) -> {
            consumer.accept(target, Boolean.parseBoolean(value.trim()));
        };
    }

    public static <T> FieldSetter<T> bigDecimalSetter(BiConsumer<T, BigDecimal> consumer) {
        return (target, value) -> {
            try {
                consumer.accept(target, new BigDecimal(value.trim()));
            } catch (Exception e) {
                System.out.println("Error parsing integer for '" + "' at row " );
            }
        };
    }
}
