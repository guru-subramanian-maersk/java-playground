package org.example.poc.excel;

import java.util.List;

@FunctionalInterface
public interface FieldSetter<T> {
    void set(T target, String value);
}
