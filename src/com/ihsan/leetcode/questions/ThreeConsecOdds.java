package com.ihsan.leetcode.questions;

public class ThreeConsecOdds {
    public static void main(String[] args) {
        int[] arr = {2,6,4,1};
        int[] arr1 = {1,2,34,3,4,5,7,23,12};
        System.out.println(isThere3ConsOdds(arr));
        System.out.println(isThere3ConsOdds(arr1));
    }
    public static boolean isThere3ConsOdds(int[] arr){
        int c = 0;
        for (int j : arr) {
            if (c == 3) {
                return true;
            }
            if (j % 2 != 0) {
                c++;
            } else {
                c = 0;
            }
            System.out.print(c + " ");
        }
        return c == 3;
    }
}
