package XML_task;
import java.io.FileInputStream;
import java.io.InputStream;
/**
 * Created by Liliia_Klymenko on 06-May-15.
 */
public class StAX_main {

    public static void main(String[] args) throws Exception {

        StAX_parser parser = new PlaneStAXPrser();

// �������� �������� ������ ������ �� xml-�����

    InputStream input =

            new FileInputStream("plane.xml");

// ������ ����� � ������� ���������� �� �������

    parser.parse(input);

}

}
