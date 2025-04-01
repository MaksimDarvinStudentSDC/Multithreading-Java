package Subtask1.Task8;

public class PThread implements Runnable {
    private int timer;
    private boolean isRunning = false;

    public boolean isRunning() {
        return isRunning;
    }

    PThread (int timer)
    {
        this.timer = timer;
    }

    @Override
    public void run() {
        while(!Thread.currentThread().isInterrupted())
        {
            try{
                Thread.sleep(timer);
                isRunning = !isRunning;
                System.out.println("Current status of CTHread is:" + isRunning);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("CTHread stopped");

    }
}

