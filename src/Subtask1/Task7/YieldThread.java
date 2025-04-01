package Subtask1.Task7;

public class YieldThread extends Thread{
    @Override
    public void run()
    {
        for (int i = 0; i < 100; i++) {
            System.out.println("Yield thread " + i);
            Thread.yield();
        }

    }
}
