package Subtask1.Task3;

public class Main {
    public static void main(String[] args) {
        T1Runnable t1 = new T1Runnable();
        T1Thread t2 = new T1Thread(t1);

        t2.start();

        try
        {
            t2.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Parent thread terminated after T1Thread");



    }


}
