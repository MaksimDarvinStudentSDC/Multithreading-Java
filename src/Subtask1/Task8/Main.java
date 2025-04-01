package Subtask1.Task8;

public class Main {
    public static void main(String[] args) {
        int M = 1000;
        int K = 5000;

        PThread p = new PThread(M);
        CThread c = new CThread(p, K, M / 10);

        Thread producerThread = new Thread(p);
        Thread consumerThread = new Thread(c);

        producerThread.start();
        consumerThread.start();

        try {
            consumerThread.join();
            producerThread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
