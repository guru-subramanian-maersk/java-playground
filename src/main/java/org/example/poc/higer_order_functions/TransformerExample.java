package org.example.poc.higer_order_functions;


import java.util.function.Consumer;

public class TransformerExample {
    public static void main(String[] args) {
        // Consumer to log input before transformation
        Consumer<String> logger = s -> System.out.println("Received: " + s);

        // Get transformer with logging behavior
        StringTransformer upper = TransformerFactory.getUpperCaseTransformer(logger);

        System.out.println(upper.transform("java"));  // Logs "Received: java" then prints "JAVA"
    }
}
