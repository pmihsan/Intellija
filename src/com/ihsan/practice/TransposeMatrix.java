package com.ihsan.practice;

import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 34},
                {4, 5, 6, 35},
                {7, 8, 9, 36},
                {10, 11, 12, 13}
        };
        for(int[] a: arr){
            System.out.println(Arrays.toString(a));
        }
        System.out.println();
        getTranspose(arr);
    }

    public static void getTranspose(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(i < j) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
        }
        for(int[] a: arr){
            System.out.println(Arrays.toString(a));
        }
        System.out.println();
    }
}
