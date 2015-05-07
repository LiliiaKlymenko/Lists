package lab;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * Created by Liliia_Klymenko on 30-Apr-15.
 */
public class Main {

    public static final String sourceLocation = "dir";
    public static final String targetLocation = "d:/newDir";
    public static File[] files;

    public static void main(String[] args) throws IOException {

        DecimalFormat formatterDecimal = new DecimalFormat("0.00");
        NumberFormat formatterNumber = NumberFormat.getNumberInstance();

        File sourceDir = new File(sourceLocation);
        File targetDir = new File(targetLocation);


        double start = System.nanoTime();
        CopyDir.copyDir(sourceDir, targetDir);
        double end = System.nanoTime();
        double traceTime = end - start;
        double spaceInKb = getFolderSize(sourceDir);
        System.out.println("\nDirectory total space: " + spaceInKb + " KB");
        System.out.println("Trace time for copy using Files.copy: " + (formatterNumber.format(traceTime/1000000000.0)) + " seconds");

        System.out.println("\n\n\n");
        System.out.println("Deleting... ");

        try {
            CopyDir.delDir(targetDir);
        } catch (IOException x) {
            System.err.println(x);
        }

        System.out.println("\n\n\n");

        start = System.nanoTime();
        CopyDirWithBuff.copyDirWithBuff(sourceDir, targetDir);
        end = System.nanoTime();
        traceTime = end - start;
        System.out.println("\nDirectory total space: " + spaceInKb + " KB");
        System.out.println("Trace time for copy using BufferedReader: " +  (formatterNumber.format(traceTime/1000000000.0)) + " seconds");

        System.out.println("\n\n\n");
        System.out.println("Deleting... ");

        try {
            CopyDir.delDir(targetDir);
        } catch (IOException x) {
            System.err.println(x);
        }

        System.out.println("\n\n\n");

        start = System.nanoTime();
        CopyDirWithNio.copyDirWithNio(sourceDir, targetDir);
        end = System.nanoTime();
        traceTime = end - start;
        System.out.println("\nDirectory total space: " + spaceInKb + " KB");
        System.out.println("Trace time for copy using NIO: " + (formatterNumber.format(traceTime/1000000000.0)) + " seconds");


    }

    public static long getFolderSize(File dir) throws IOException {
        long size = 0;
        if (dir.isDirectory()) {
            for (File file : dir.listFiles()) {
                if (file.isFile()) {
                    size += Files.size(file.toPath());
                } else
                    size += getFolderSize(file);
            }
        } else if (dir.isFile()) {
            size += dir.length();
        }
        return size;
    }

}
