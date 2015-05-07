package lab;

import java.io.File;
import java.util.Date;

/**
 * Created by Liliia_Klymenko on 29-Apr-15.
 */
public class FileDemo {
   public static Date a;
    public static final String fileName = ".\\test.txt";
    public static final String dirName = ".\\out";
    public static File[] files;


    public static void main(String[] args) {

        File f1 = new File(fileName);
        if(!f1.exists()){
            System.out.printf("File %s doesn't exist",f1.getAbsolutePath());
        }
        else {
            ifFile(f1);
        }

        File d1 = new File(dirName);

        if(!d1.exists()){
            System.out.printf("Dir %s doesn't exist",d1.getAbsolutePath());
        }
        else
        {
            isDir(d1);
        }

    }

    public static void ifFile(File f1) {

            System.out.println("_____Work with file_______");
            a = new Date(f1.lastModified());
            System.out.printf("File %s  Date: %s Size :%d\n",f1.getName(),a.toString(),f1.length());


    }

    public static void isDir(File d1) {

        if(!d1.isDirectory()){
            System.out.println("_____Work with directory_______");
            System.out.println(d1.getName());
            files = d1.listFiles();
            for (File file:files) {
                if (file.isDirectory())
                    isDir(file);
                else
                    System.out.println(file.getName().toLowerCase());
            }
        }
    }


}
