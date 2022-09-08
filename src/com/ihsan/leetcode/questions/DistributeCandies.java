package com.ihsan.leetcode.questions;

import java.util.Arrays;

public class DistributeCandies {
    public static void main(String[] args) {
        int cand = 60;
        int num_people = 4;
        System.out.println(Arrays.toString(getOrderCandies(cand, num_people)));
    }

    public static int[] getOrderCandies(int c, int n){
        int[] arr = new int[n];
        int k = 0;
        int num = 1;
        while(c - num > 0){
            if(k == n) k = k % n;
            arr[k++] += num;
            c -= num;
            num++;
        }
        if(c > 0){
            arr[k%n] += c;
        }
        return arr;
    }
}
