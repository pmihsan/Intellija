package com.ihsan.leetcode.questions;

import java.util.Arrays;

public class ReplaceWithGreatest {
    public static void main(String[] args) {
        int[] arr = {17, 18, 5, 4, 6, 1};
        System.out.println((Arrays.toString(repGreatest(arr))));
//        System.out.println((Arrays.toString(greatestRep(arr))));
    }
    public static int[] repGreatest(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            arr[i] = Max(arr,i+1);
        }
        arr[arr.length-1] = -1;
        return arr;
    }
    public static int Max(int[] arr, int start){
        int max = arr[start];
        for(int i = start;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

//    public static int[] greatestRep(int[] arr){
//        if(arr.length == 1){
//            arr[0] = -1;
//            return arr;
//        }
//        int h = arr.length - 1;
//        int l = h - 1;
//        while(l >= 0){
//            if(arr[l] > arr[h]){
//                arr[h] = arr[l];
//                h--;
//                l--;
//            }
//            l--;
//        }
//        return arr;
//    }
}
