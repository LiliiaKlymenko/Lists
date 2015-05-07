package threads;

public class PriorityRunner {
    public static void main(String[ ] args) {
        ThreadPriority min = new ThreadPriority("Min");
        ThreadPriority max = new ThreadPriority("Max");
        ThreadPriority norm = new ThreadPriority("Norm");
        min.setPriority(Thread.MIN_PRIORITY); // 1
        max.setPriority(Thread.MAX_PRIORITY); // 10
        norm.setPriority(Thread.NORM_PRIORITY); // 5
        min.start();
        norm.start();
        max.start();
    }
}
