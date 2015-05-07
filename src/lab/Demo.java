package lab;

import java.io.*;

/**
 * Created by Liliia_Klymenko on 29-Apr-15.
 */
public class Demo {
        public static void main(String[] args) {
            Student goncharenko =  new Student("MMF", "Goncharenko", 1, "G017s9");
            System.out.println(goncharenko);
            File fw = new File("demo.dat");
            try {
                ObjectOutputStream ostream = new ObjectOutputStream(new FileOutputStream(fw));
                ostream.writeObject(goncharenko);
                ostream.close();
            } catch (IOException e) {
                System.err.println(e);
            }
            Student.faculty = "GEO";
            File fr = new File("demo.dat");
            try {
                ObjectInputStream istream = new ObjectInputStream(new FileInputStream(fr));
                Student unknown =(Student)istream.readObject();
                istream.close();
                System.out.println(unknown);
            } catch (ClassNotFoundException ce) {
                System.err.println(ce);
                System.err.println("Класс не существует");
            } catch (FileNotFoundException fe) {
                System.err.println(fe);
                System.err.println("Файл не найден");
            } catch (IOException ioe) {
                System.err.println(ioe);
                System.err.println("Ошибка доступа");
            }

        }
}
