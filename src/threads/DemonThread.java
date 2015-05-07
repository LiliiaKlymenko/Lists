package threads;

/**
 * Created by Liliia_Klymenko on 30-Apr-15.
 */
public class DemonThread extends Thread {
    public void run() {
        try{
            if(isDaemon()) {
                System.out.println("start demon");
                Thread.sleep(10_000); // заменить параметр на 1
            } else {
                System.out.println("start simple thread");
            }
        } catch(InterruptedException e) {
            System.err.print(e);
        } finally{
            if(!isDaemon()) {
                System.out.println("end simple thread");
            } else {
                System.out.println("end demon");
            }
        }
    }
}



