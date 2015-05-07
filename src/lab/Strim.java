package lab;

import java.io.*;

/**
 * Created by Liliia_Klymenko on 29-Apr-15.
 */
public class Strim {

    public static void main(String[] args) throws IOException {
        FileInputStream st= new FileInputStream("test.txt");
        System.out.print("\n___________read by bytes_____________\n");
        while(st.available()!=0)// пока нет конца файла читаем по символам!
        {
            int b=st.read();
            char ch=(char)b;
            System.out.print(ch);

        }
        st.close();
        FileOutputStream so= new FileOutputStream("out.txt");// запись в фаил!
        String d="Hello";
        byte[] bytes= d.getBytes();
        so.write(bytes);
        so.close();

        BufferedReader reader = new BufferedReader(new FileReader("test.txt"));
        String s=null;
        System.out.print("\n___________BufferedReader read by char_____________\n");
        while ((s=reader.readLine())!=null)
        {
            System.out.println(s);
        }
        reader.close();

        PrintWriter write=new PrintWriter("out1.txt");
        write.printf("%s %d %c", "String",100,'q');
        write.close();
    }
}
