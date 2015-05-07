package threads;

import java.io.IOException;

/**
 * Created by Liliia_Klymenko on 30-Apr-15.
 */
public class ThreadWithAnonClass {
    public static void main(String[] args) throws IOException {
        new Thread(){
            @Override
            public void run() {
                System.out.println("1 start");
                Thread.yield();
                System.out.println("1 end");

            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                System.out.println("2 start");
                System.out.println("2 end");
            }
        }.start();
    }
}
