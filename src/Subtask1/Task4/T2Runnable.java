package Subtask1.Task4;

import java.util.Random;

public class T2Runnable implements Runnable {

    private final String[] messages;

    public T2Runnable(String[] messages) {
        this.messages = messages;
    }

    @Override
    public void run() {
        for (String message : messages) {
            System.out.println(Thread.currentThread().getName() + ": " + message);
            try {
                Thread.sleep(new Random().nextInt(500)); // Имитация работы
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
    }

