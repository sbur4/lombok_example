package org.example.util;

@lombok.experimental.UtilityClass
public class UtilityClazz {
    private final int CONSTANT = 5;

    public int addSomething(int in) {
        return in + CONSTANT;
    }
}