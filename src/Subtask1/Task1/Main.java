package Subtask1.Task1;



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int n =10;
        MyThread thread = new MyThread(n);
        thread.start();
        for (int i = 0; i < n; i++) {
            System.out.println("Parents lol");
        }
    }
}
