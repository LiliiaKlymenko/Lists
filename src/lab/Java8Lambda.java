package lab;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Liliia_Klymenko on 08-May-15.
 */
public class Java8Lambda {
    public static void main(String[] args) {
        new Thread(
                () -> System.out.println("Hello from thread")
        ).start();


        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        list.forEach(System.out::println);

    }
}
