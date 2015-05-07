package threads;

/**
 * Created by Liliia_Klymenko on 30-Apr-15.
 */
public class Program {
    static ThreadClass mSecomdThresd;
    public static void main(String[] args)  {
        mSecomdThresd = new ThreadClass();
        mSecomdThresd.start();
        System.out.println("Main thread completed");
    }
}
