package Subtask1.Task3;

import java.util.Scanner;

public class T1Thread extends Thread {

    public T1Thread(Runnable target) {
        super(target);
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        // int n = scanner.nextInt();
        for (int i = 1; i <= 100; i++) {
            System.out.println("Index thread number" +  i);
        }
        // Thread.sleep(500);
    }

}
