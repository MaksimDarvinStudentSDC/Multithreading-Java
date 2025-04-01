package Subtask1.Task5;


public class Main {
    public static void main(String[] args) {

        Thread thread = new Thread(()->{
            try {
                System.out.println("Thread started. Sleeping for 5 seconds...");
                Thread.sleep(5000);
                System.out.println("Thread started without interrupt.");
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        });

        thread.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread.interrupt();

    }

    }

