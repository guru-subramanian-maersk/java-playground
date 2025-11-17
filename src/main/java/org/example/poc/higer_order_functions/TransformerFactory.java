package org.example.poc.higer_order_functions;

import java.util.function.Consumer;

public class TransformerFactory {

    public static StringTransformer getUpperCaseTransformer(Consumer<String> beforeTransform) {
        return input -> {
            beforeTransform.accept(input); // Do something before transformation
            return input.toUpperCase();    // Actual transformation
        };
    }
}
