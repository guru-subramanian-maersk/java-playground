package org.example.streams;

import org.example.generics.BaseEntity;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

public class ConsumerExample {

    public static void main(String[] args) {
        BiConsumer<TestObject, Long> biConsumer = TestObject::setVersion;
        TestObject test = new TestObject();
        biConsumer.accept(test, 42L);

        Function<TestObject, Long> func = TestObject::getId;
        System.out.println(func.apply(test));;
    }
}
