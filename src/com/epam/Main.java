package com.epam;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        List<Integer> llist = new LinkedList<Integer>();

        Random rand = new Random();
        for (int i=0; i<10000; i++) {
            list.add(rand.nextInt(100));
            llist.add(rand.nextInt(100));
        }

        System.out.println("Get from ArrayList:");
        long start = System.nanoTime();
        list.get(5000);
        long end = System.nanoTime();
        long traceTime = end - start;
        System.out.println("Time: " + traceTime);

        System.out.println("Get from LinkedList:");
        start = System.nanoTime();
        llist.get(5000);
        end = System.nanoTime();
        traceTime = end - start;
        System.out.println("Time: " + traceTime);

        System.out.println("\nRemove from ArrayList:");
        start = System.nanoTime();
        list.remove(5000);
        end = System.nanoTime();
        traceTime = end - start;
        System.out.println("Time: " + traceTime);

        System.out.println("Remove from LinkedList:");
        start = System.nanoTime();
        llist.remove(5000);
        end = System.nanoTime();
        traceTime = end - start;
        System.out.println("Time: " + traceTime);

        System.out.println("\nInsert to middle of ArrayList:");
        start = System.nanoTime();
        list.add(5000, 50);
        end = System.nanoTime();
        traceTime = end - start;
        System.out.println("Time: " + traceTime);

        System.out.println("Insert to middle of LinkedList:");
        start = System.nanoTime();
        llist.add(5000, 50);
        end = System.nanoTime();
        traceTime = end - start;
        System.out.println("Time: " + traceTime);

        System.out.println("\nInsert to end of ArrayList:");
        start = System.nanoTime();
        list.add(list.size(), 50);
        end = System.nanoTime();
        traceTime = end - start;
        System.out.println("Time: " + traceTime);

        System.out.println("Insert to end of LinkedList:");
        start = System.nanoTime();
        llist.add(llist.size(), 50);
        end = System.nanoTime();
        traceTime = end - start;
        System.out.println("Time: " + traceTime);



    }
}
