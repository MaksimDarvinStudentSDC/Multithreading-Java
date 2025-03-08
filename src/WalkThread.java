import java.util.Scanner;

public class WalkThread extends Thread {


    public void run() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }

}
