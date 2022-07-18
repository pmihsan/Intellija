package com.ihsan.leetcode.questions;

import java.util.ArrayList;
import java.util.List;

public class PascalTri {
    public static void main(String[] args) {
//        int rowIndex = 3;
//        System.out.println(pascalRow(rowIndex));
        List<List<Integer>> lists = new ArrayList<>();
        for(int i=0;i<6;i++){
            lists.add(pascalRow(i));
//            System.out.println(pascalRow(i));
        }
        for(List<Integer> l : lists){
            System.out.println("Row => " + l);
        }
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
}
