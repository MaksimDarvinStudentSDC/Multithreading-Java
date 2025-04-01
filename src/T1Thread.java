public class T1Thread extends Thread {
    private int n;
    public T1Thread(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        for (int i = 0; i < n; i++) {
            System.out.println("Lol");
        }
    }
}
