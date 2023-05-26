package com.ihsan.zscaler;

import java.util.*;

public class NetworkChunk {
    static long n;
    static List<List<Long>> chunks;

    public static void main(String[] args) {
        setTestCase1();
        printTestCase();
        System.out.println("Required chunks: " + getMinimumChunks());
        System.out.println();

        setTestCase2();
        printTestCase();
        System.out.println("Required chunks: " + getMinimumChunks());
        System.out.println();

        setTestCase3();
        printTestCase();
        System.out.println("Required chunks: " + getMinimumChunks());
        System.out.println();

        setTestCase4();
        printTestCase();
        System.out.println("Required chunks: " + getMinimumChunks());
        System.out.println();

    }

    public static int getMinimumChunks(){
        int min = 0;

        chunks.sort((o1, o2) -> (int) (o1.get(0) - o2.get(0)));
        min += countOnes(chunks.get(0).get(0) - 1);
        for(int i=1;i<chunks.size();i++){
            min += countOnes(chunks.get(i).get(0) - chunks.get(i-1).get(1) - 1);
        }
        min += countOnes(n - chunks.get(chunks.size() - 1).get(1));

        return min;
    }


    // Brute Force
    public static int countMinChunks(Long e){
        int m = 0;
        while(e > 0) {
            int s = 0;
            while ((long)Math.pow(2, s) < e) s++;
            if ((long)Math.pow(2, s) - e > 0) s--;
            e -= (long)Math.pow(2, s);
            m++;
        }
        return m;
    }

    public static int countOnes(Long e){
        int m = 0;
        while(e > 0){
            m++;
            e = e & (e - 1);
        }
        return m;
    }

    public static void setTestCase1(){
        n = 10;
        chunks = new ArrayList<>();
        Long[] l1 = {1L, 2L}; // Segments
        Long[] l2 = {9L, 10L};
        chunks.add(Arrays.asList(l1));
        chunks.add(Arrays.asList(l2));
    }

    public static void setTestCase2(){
        n = 10;
        chunks = new ArrayList<>();
        Long[] l1 = {1L, 2L}; // Segments
        Long[] l2 = {5L, 6L};
        Long[] l3 = {9L, 10L};
        chunks.add(Arrays.asList(l1));
        chunks.add(Arrays.asList(l2));
        chunks.add(Arrays.asList(l3));
    }

    public static void setTestCase3(){
        n = 18;
        chunks = new ArrayList<>();
        Long[] l1 = {9L, 17L}; // Segments
        Long[] l2 = {9L, 10L};
        chunks.add(Arrays.asList(l1));
        chunks.add(Arrays.asList(l2));
    }

    public static void setTestCase4(){
        n = 54;
        chunks = new ArrayList<>();
        Long[] l1 = {9L, 24L}; // Segments
        Long[] l2 = {1L, 4L};
        Long[] l3 = {50L, 52L};
        chunks.add(Arrays.asList(l1));
        chunks.add(Arrays.asList(l2));
        chunks.add(Arrays.asList(l3));
    }

    public static void printTestCase(){
        System.out.println("Total Packets: " + n);
        System.out.println("Uploaded Packets Range");
        System.out.println(chunks);
    }
}
