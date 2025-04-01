package Subtask1.Task3;

import java.util.Scanner;

public class T1Runnable implements Runnable {

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        //int n = scanner.nextInt();
        for (int i = 1; i <= 100; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Index runnable number:" + i);
        }
        //    Thread.sleep(500);
    }
}
