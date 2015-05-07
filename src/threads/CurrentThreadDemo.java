package threads;

import java.io.IOException;

/**
 * Created by Liliia_Klymenko on 30-Apr-15.
 */
public class CurrentThreadDemo {

    public static void main(String[] args) throws IOException {
        Thread t = Thread.currentThread();
        System.out.println("currentThread: " + t);
        t.setName("My Thread");

        System.out.println("after name is changed: " + t);

        try {
            for (int n = 5; n>0; n--){
                System.out.println(n);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread is interrupted");
        }
    }

}
