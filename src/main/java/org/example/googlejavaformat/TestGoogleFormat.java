package org.example.googlejavaformat;

import com.google.googlejavaformat.java.Formatter;

public class TestGoogleFormat {
    public static void main(String[] args) {
        String sourceCode = "public class Example {  private int count = 0; public void setCount(int count) { this.count = count; } }";

        try {
            // Instantiate the Formatter.
            // You can also specify the JavaFormatterOptions, e.g., for different code styles (Google, AOSP).
            Formatter formatter = new Formatter();

            // Format the source code string
            String formattedSource = formatter.formatSource(sourceCode);

            System.out.println("Original Code:");
            System.out.println(sourceCode);
            System.out.println("\nFormatted Code:");
            System.out.println(formattedSource);

        } catch (Exception e) {
            System.err.println("Error formatting source code: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
