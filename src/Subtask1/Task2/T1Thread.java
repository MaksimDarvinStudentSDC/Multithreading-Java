package Subtask1.Task2;

public class T1Thread extends Thread {
    public T1Thread(Runnable r) {
        super(r);
    }
    @Override
    public void run() {
        System.out.println("T1Thread is running");
    }
}
