package lab;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

/**
 * Created by Liliia_Klymenko on 29-Apr-15.
 */
public class CopyDirWithBuff {
    public static final String sourceLocation = "dir";
    public static final String targetLocation = "d:/newDir";
    public static File[] files;


    public static void copyWithBuff(File sourceDir, File targetDir) throws IOException {

        try (FileInputStream is = new FileInputStream(sourceDir); FileOutputStream os = new FileOutputStream(targetDir); BufferedReader reader = new BufferedReader(new FileReader(targetDir))) {

           try {
                byte[] buffer = new byte[4096];
                int length;
                while ((length = is.read(buffer)) > 0) {
                    os.write(buffer, 0, length);
                }
            } finally {
                os.flush();
            }
        }
    }

    public static void copyDirWithBuff(File sourceDir, File targetDir) throws IOException, FileNotFoundException {

        if (sourceDir.isDirectory()) {
            if (!targetDir.exists()) {
                targetDir.mkdir();
                System.out.println("Directory created : " + targetDir);
            }

            files = sourceDir.listFiles();
            for (File file : files) {

                File srcFile = new File(sourceDir, file.getName());
                File destFile = new File(targetDir, file.getName());
                copyDirWithBuff(srcFile, destFile);
            }
        }

        else {
            copyWithBuff(sourceDir, targetDir);
            System.out.println("File copied : " + targetDir);
        }
    }
}
