package Subtask1.Task6;

import java.util.Scanner;

public class TalkThread extends Thread
{
    @Override
    public void run()
    {
        Scanner scanner = new Scanner(System.in);
        //int n = scanner.nextInt();
        for (int i = 0; i < 100; i++) {
            System.out.println("talk thread " + i);
        }
    }

}