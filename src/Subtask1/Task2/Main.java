package Subtask1.Task2;

public class Main {
    public static void main(String[] args) {
        MyRunable myRunnable = new MyRunable();
        T1Thread t1Thread = new T1Thread(myRunnable);
        t1Thread.start();
    }
}
