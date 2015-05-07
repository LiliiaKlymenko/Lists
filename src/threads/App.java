package threads;

/**
 * Created by Liliia_Klymenko on 05-May-15.
 */
public class App {public static void main(String[] args) throws InterruptedException {

    final Object ref = new  Object();
    new Thread (new Runnable()
    {
        public void run(){
            synchronized (ref) {
                System.out.println("run - wait...");
                try {
                    ref.wait();

                    System.out.println("run -thanks!");
                } catch (InterruptedException e) {
				/*NOP*/
                }
            }
        }}).start();
    System.out.println("sleep...");
    Thread.sleep(2000);
    System.out.println("Main- sleep!");
    System.out.println("Main - notify");
    synchronized (ref) {
        ref.notifyAll();
    }

}

}

