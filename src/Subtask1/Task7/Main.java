package Subtask1.Task7;

public class Main {
    public static void main(String[] args) {
        WithoutYieldThread t3 = new WithoutYieldThread();
        YieldThread t4 = new YieldThread();

        t3.start();
        t4.start();


    }
}
