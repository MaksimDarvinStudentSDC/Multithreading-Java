package Subtask1.Task4;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int N = new Random().nextInt(3) + 4;

        String[][] sequences = {
                {"Thread 1- message 1", "Thread 1 - message 2", "Thread 1 - message 3"},
                {"Thread 2 - message 1", "Thread 2 - message 2", "Thread 2 - message 3"},
                {"Thread 3 - message 1", "Thread 3 - message 2", "Thread 3 - message 3"},
                {"Thread 4 - message 1", "Thread 4 - message 2", "Thread 4 - message 3"},
                {"Thread 5- message 1", "Thread 5 - message 2", "Thread 5 - message 3"},
                {"Thread 6- message 1", "Thread 6 - message 2", "Thread 6 - message 3"},
        };

        Thread[] threads = new Thread[N];

        for (int i = 0; i < N; i++) {
            threads[i] = new Thread(new T2Runnable(sequences[i]), "Thread-" + (i + 1));
            threads[i].start();
        }
    }

}
