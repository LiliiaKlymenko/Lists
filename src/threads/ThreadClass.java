package threads;

/**
 * Created by Liliia_Klymenko on 30-Apr-15.
 */
public class ThreadClass extends Thread {
    @Override
    public void run() {
        System.out.println("Hello from another thread");
    }

}
