package threads;

public class DaemonRunner {
public static void main(String[ ] args) {
        DemonThread usual = new DemonThread();
        DemonThread daemon = new DemonThread();
        daemon.setDaemon(true);
        daemon.start();
        usual.start();
        System.out.println("last main");
        }
}
