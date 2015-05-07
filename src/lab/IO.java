package lab;

import java.io.*;
import java.net.URL;

/**
 * Created by Liliia_Klymenko on 29-Apr-15.
 */
public class IO {
    public static void main(String[] args) throws IOException {

       // InputStream inFile   = new FileInputStream("c:/tmp/text.txt");

      //  readFullyByByte(inFile);
      //  System.out.print("\n\n\n");

        InputStream inUrl = new URL("http://google.com").openStream();

        readFullyByByte(inUrl);
        System.out.print("\n\n\n");

        InputStream inArray = new ByteArrayInputStream(new byte[] {65, 66, 67, 68, 69});
        readFullyByByte(inArray);
        System.out.print("\n\n\n");

    }

    private static void readFullyByByte(InputStream in) throws IOException {
        while (true) {
            int oneByte = in.read();

            if(oneByte!=-1) {
                System.out.print((char) oneByte);
            }
            else
            {
                System.out.println("\nend");
                break;
            }

        }

    }


}
