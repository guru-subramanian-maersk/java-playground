package org.example.streams;

import java.util.function.Function;

public class LambdaExamples {

    static <T> Function<T, String> getGreeter(String greeting) {
        return name -> greeting + ", " + name;
    }

    public static void main(String[] args) {
        Function<String, String> helloGreeter = getGreeter("Hello");
        Function<String, String> welcomeGreeter = getGreeter("Welcome");

        System.out.println(helloGreeter.apply("Alice"));   // Hello, Alice
        System.out.println(welcomeGreeter.apply("Bob"));   // Welcome, Bob
    }




}
