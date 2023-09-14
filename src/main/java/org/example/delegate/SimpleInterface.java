package org.example.delegate;

public interface SimpleInterface {
    default void addTo(String item) {
        System.out.println(item);
    }

    boolean removeFrom(String item);
}