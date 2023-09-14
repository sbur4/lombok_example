package org.example.stable.synchronization;

import lombok.AllArgsConstructor;
import lombok.Synchronized;

import java.util.stream.IntStream;

public class SynchronizedTest1 {
    public static void main(String args[]) {
        Voice voice = new Voice();

        DogVoice dogVoice = new DogVoice(voice);
        dogVoice.setName("bark");
        CatVoice catVoice = new CatVoice(voice);
        catVoice.setName("meow");

        dogVoice.start();
        catVoice.start();
    }
}

class Voice {
    @Synchronized
    void sound(int n) {//synchronized method
        IntStream.rangeClosed(1, 5).forEach(i -> {
            String s = Thread.currentThread().getName();
            System.out.println(s + " " + n * i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.err.println(e);
            }
        });
    }
}

@AllArgsConstructor
class DogVoice extends Thread {
    Voice voice;

    @Override
    public void run() {
        voice.sound(1);
    }
}

@AllArgsConstructor
class CatVoice extends Thread {
    Voice voice;

    @Override
    public void run() {
        voice.sound(5);
    }
}