//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
   public static void main(String[] args) {

/*
       T1Runnable t1 = new T1Runnable();
       T1Thread t2 = new T1Thread(t1);
       Thread walkMin = new Thread(new WalkThread(), "Min");
       Thread talkMax = new Thread(new TalkThread(), "Max");
*/

//       walkMin.setPriority(Thread.MIN_PRIORITY);
//       talkMax.setPriority(Thread.MAX_PRIORITY);

//       walkMin.start();
//       talkMax.start();
/*
       WithoutYieldThread t3 = new WithoutYieldThread();
       YieldThread t4 = new YieldThread();

       t3.start();
       t4.start();
*/

//     t2.start();

//       Thread [] t3 = new Thread[5];

//       String [] threads = {"Thread1","Thread2", "Thread3", "Thread4", "Thread5"};

/*       for (int i=0; i<5; i++)
       {
           t3[i] = new Thread(new T2Runnable(threads[i]));
           t3[i].start();
       }

       try {
           Thread.sleep(2000);
           for (int i = 0; i < 5; i++) {
               t3[i].interrupt();
           }
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
*/
 /*      try
       {
           t2.join();

       } catch (InterruptedException e) {
           e.printStackTrace();
       }

       System.out.println("Parent thread terminated after T1Thread");

*/

       int M = 1000;
       int K = 5000;

       PThread p = new PThread(M);
       CThread c = new CThread(p, K, M / 10);

       Thread producerThread = new Thread(p);
       Thread consumerThread = new Thread(c);

       producerThread.start();
       consumerThread.start();

       try {
           consumerThread.join();
           producerThread.interrupt();
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
    }

}