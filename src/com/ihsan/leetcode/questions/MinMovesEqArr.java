package com.ihsan.leetcode.questions;

import java.util.Arrays;

public class MinMovesEqArr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 10, 2, 9};
        System.out.println(MinMoves(arr2));
    }
    public static int MinMoves(int[] arr){
        int sum = 0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            sum += Math.abs(arr[i] - arr[arr.length/2]);
        }
        return sum;
    }
}
