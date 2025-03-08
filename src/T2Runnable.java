public class T2Runnable implements Runnable
{
    private String threadName;

    public T2Runnable(String threadName)
    {
        this.threadName = threadName;
    }

    @Override
    public void run (){
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + threadName + " " + i);
                Thread.sleep(2000);
            }
        }
        catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " was interrupted.");
        }
    }
}
