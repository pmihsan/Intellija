package com.ihsan.leetcode.questions;

import java.util.ArrayList;
import java.util.List;

public class PascalTri {
    public static void main(String[] args) {
        int rowIndex = 33;
//        System.out.println(pascalRow(rowIndex));
        List<List<Integer>> lists = new ArrayList<>();
        if(rowIndex <= 5) {
            for (int i = 0; i < rowIndex; i++) {
                lists.add(pascalRow(i));
                System.out.println(pascalRow(i));
            }
        }
        if(rowIndex > 5){
            correctPascal(lists,rowIndex);
        }
        printList(lists);
        System.out.println(lists.get(5));
    }

    public static List<Integer> pascalRow(int r){
        return findAndRetList(r);
    }

    public static List<Integer> findAndRetList(int r){
        int a = 1;
        for(int i=0;i<r;i++){
            a *= 11;
        }
        List<Integer> l = new ArrayList<>();
        while(a > 0){
            int rem = a % 10;
            l.add(0,rem);
            a = a / 10;
        }
        return l;
    }
    public static void correctPascal(List<List<Integer>> lists, int r){
        for (int i = 0; i < r; i++) {
            lists.add(pascalRow(i));
        }
        for(int i=5;i<r;i++){
            List<Integer> l = new ArrayList<>();
            l.add(1);
            for(int j=1;j<i;j++){
                int a = lists.get(i-1).get(j) + lists.get(i-1).get(j-1);
                l.add(a);
//                System.out.print(a+" ");
            }
            l.add(1);
//            System.out.println(l);
            lists.set(i,l);
//            System.out.println();
        }
    }
    public static void printList(List<List<Integer>> lists){
        for(List<Integer> l : lists){
            System.out.println("Row => " + l);
        }
    }
}
