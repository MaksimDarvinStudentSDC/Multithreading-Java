package Subtask1.Task6;

public class Main {

    public static void main(String[] args) {
        Thread walkMin = new Thread(new WalkThread(), "Min");
        Thread talkMax = new Thread(new TalkThread(), "Max");

        walkMin.setPriority(Thread.MIN_PRIORITY);
       talkMax.setPriority(Thread.MAX_PRIORITY);

       walkMin.start();
       talkMax.start();

    }
}
