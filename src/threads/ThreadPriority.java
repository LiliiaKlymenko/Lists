package threads;

/**
 * Created by Liliia_Klymenko on 30-Apr-15.
 */
public class ThreadPriority extends Thread {
    public ThreadPriority(String name) {
        super(name);
    }
    public void run() {
        for (int i = 0; i < 71; i++) {
            System.out.println(getName() + " " + i);
           /* try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.err.print(e);
            }
            */

        }

    }
}

