package Subtask1.Task6;

import java.util.Scanner;

public class WalkThread extends Thread {


    public void run() {
        Scanner scanner = new Scanner(System.in);
        //   int n = scanner.nextInt();
        for (int i = 0; i < 100; i++) {
            System.out.println("walk thread " + i);
        }
    }

}
