package org.example.stable;

import lombok.SneakyThrows;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SneakyThrowsTest {
    public static void main(String[] args) {
        System.out.println(readFile());
    }

    @SneakyThrows(IOException.class)
    private static String readFile() {
        return new String(Files.readAllBytes(Paths.get("README.md")));
    }
}