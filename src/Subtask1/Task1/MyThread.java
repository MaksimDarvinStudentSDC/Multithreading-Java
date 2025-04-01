package Subtask1.Task1;

public class MyThread extends Thread {
    private int n;
    public MyThread(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        for (int i = 0; i < n; i++) {
            System.out.println("Lol");
        }
    }
}
