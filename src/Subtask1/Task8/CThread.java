package Subtask1.Task8;

public class CThread implements Runnable {

    private PThread pThread;
    private int countdownTime;
    private int stepDelay;

    public CThread(PThread pThread, int countdownTime, int stepDelay) {
        this.pThread = pThread;
        this.countdownTime = countdownTime;
        this.stepDelay = stepDelay;
    }

    @Override
    public void run() {
        int timeLeft = countdownTime;
        while (timeLeft > 0) {
            if (pThread.isRunning()) {
                System.out.println("C thread time left: " + timeLeft);
                timeLeft -= stepDelay;
            }
            try {
                Thread.sleep(stepDelay);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Consumer was completed.");
    }

}

