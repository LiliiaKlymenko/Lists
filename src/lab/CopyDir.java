package lab;

import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.text.NumberFormat;

/**
 * Created by Liliia_Klymenko on 29-Apr-15.
 */
public class CopyDir {
    public static final String sourceLocation = "dir";
    public static final String targetLocation = "d:/dir_copy";
    public static File[] files;


    public static void copy(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    public static void copyDir(File sourceDir, File targetDir) throws IOException {

        if (sourceDir.isDirectory()) {
            if (!targetDir.exists()) {
                targetDir.mkdir();
                System.out.println("Directory created : " + targetDir);
            }

            files = sourceDir.listFiles(); // files in sourceDir
            for (File file : files) {

                File srcFile = new File(sourceDir, file.getName());
                File destFile = new File(targetDir, file.getName());
                copyDir(srcFile, destFile);
            }
        } else {
            copy(sourceDir, targetDir);
            System.out.println("File copied : " + targetDir);
        }
    }

    public static void del(File targetDir) throws IOException {
        Files.delete(targetDir.toPath());
    }

    public static void delDir(File targetDir) throws IOException {

        if (targetDir.isDirectory()) {

            files = targetDir.listFiles(); // files in sourceDir
            for (File file : files) {
                    if (file.isDirectory()){
                        delDir(file);
                    }
                else
                    del(file);
            }
        }

        else
        {
            del(targetDir);
        }

    }
}

