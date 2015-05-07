package XML_task;
import java.io.FileInputStream;
import java.io.InputStream;
/**
 * Created by Liliia_Klymenko on 06-May-15.
 */
public class StAX_main {

    public static void main(String[] args) throws Exception {

        StAX_parser parser = new PlaneStAXPrser();

// создание входного потока данных из xml-файла

    InputStream input =

            new FileInputStream("plane.xml");

// разбор файла с выводом результата на консоль

    parser.parse(input);

}

}
