package lab;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/**
 * Created by Liliia_Klymenko on 30-Apr-15.
 */
public class CopyDirWithNio {

    public static final String sourceLocation = "dir";
    public static final String targetLocation = "d:/newDir";
    public static File[] files;

    public static void copyNio(File source, File dest) throws IOException {
        FileChannel sourceChannel = new FileInputStream(source).getChannel();
        try {
            FileChannel destChannel = new FileOutputStream(dest).getChannel();
            try {
                destChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
            } finally {
                destChannel.close();
            }
        } finally {
            sourceChannel.close();
        }
    }

    public static void copyDirWithNio(File sourceDir, File targetDir) throws IOException {
        if (sourceDir.isDirectory()) {
            if (!targetDir.exists()) {
                targetDir.mkdir();
                System.out.println("Directory created : " + targetDir);
            }

            files = sourceDir.listFiles();
            for (File file : files) {

                File srcFile = new File(sourceDir, file.getName());
                File destFile = new File(targetDir, file.getName());
                copyDirWithNio(srcFile, destFile);
            }
        } else {
            copyNio(sourceDir, targetDir);
            System.out.println("File copied : " + targetDir);
        }
    }
}
