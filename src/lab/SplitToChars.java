package lab;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Liliia_Klymenko on 29-Apr-15.
 */
public class SplitToChars {

    public static final String sourceFileName= "out.txt";
    public static final String destFileName= "dest.txt";
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(sourceFileName));

        PrintWriter write=new PrintWriter(destFileName);

        String s=null;
        int words=0, lines=0,chars=0;
        while ((s=reader.readLine())!=null)
        {
            lines++;
            String[] ws=s.trim().split("\\s");
            words+=ws.length;
            for(String l:ws)
                chars+=l.length();

            write.println(s.toUpperCase());
        }
        reader.close();
        write.close();
        System.out.printf("Cpoeid chars - %d; words-%d;lines-%d\n",chars,words,lines);
    }

}
