package org.example.googlejavaformat;

import com.google.googlejavaformat.java.Formatter;
import com.google.googlejavaformat.java.FormatterException;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class TestGoogleFormat {
    public static void main(String[] args) {
        // Specify the directory containing your Java files
        Path startDirectory = Paths.get("./src");

        // Use the default Formatter instance
        Formatter formatter = new Formatter();

        System.out.println(
                "Starting to format files in directory: " + startDirectory.toAbsolutePath());

        try (Stream<Path> paths = Files.walk(startDirectory)) {
            paths.filter(Files::isRegularFile)
                    .filter(p -> p.toString().endsWith(".java"))
                    .forEach(file -> formatAndReplaceFile(file, formatter));

        } catch (IOException e) {
            System.err.println("Error walking through directory: " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Formatting complete.");
    }

    private static void formatAndReplaceFile(Path file, Formatter formatter) {
        try {
            // 1. Read the file content into a string
            String sourceCode = new String(Files.readAllBytes(file), StandardCharsets.UTF_8);

            // 2. Format the source code using the library
            String formattedSource = formatter.formatSource(sourceCode);

            // 3. Write the formatted content back to the file
            Files.write(file, formattedSource.getBytes(StandardCharsets.UTF_8));

            System.out.println("Formatted: " + file.getFileName());

        } catch (IOException e) {
            System.err.println(
                    "IO error processing file " + file.getFileName() + ": " + e.getMessage());
        } catch (FormatterException e) {
            System.err.println(
                    "Formatting error in file " + file.getFileName() + ": " + e.getMessage());
        }
    }
}
