package org.example.stable;

import lombok.Cleanup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class CleanUpTest {
    public static void main(String[] args) {
        try {
            @Cleanup InputStream inputStream = Files.newInputStream(Paths.get("README.md"));
            @Cleanup InputStreamReader inputStreamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
            String text = new BufferedReader(inputStreamReader)
                    .lines()
                    .collect(Collectors.joining("\n"));
            System.out.println(text);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}