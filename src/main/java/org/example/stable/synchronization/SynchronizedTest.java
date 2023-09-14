package org.example.stable.synchronization;

import lombok.Synchronized;

public class SynchronizedTest {
    private final Object readLock = new Object();
    @Synchronized
    public static void hello() {
        System.out.println("world");
    }

    @Synchronized
    public int answerToLife() {
        return 42;
    }

    @Synchronized("readLock")
    public void foo() {
        System.out.println("bar");
    }
}