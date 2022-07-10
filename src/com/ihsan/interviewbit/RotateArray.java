package com.ihsan.interviewbit;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
//        int[][] arr = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
        int[][] arr = {
                {1, 2},
                {3, 4}
        };
        rotateArr(arr);
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
    public static void rotateArr(int[][] arr){
        int i = 0;
        int j = 0;
        int n = arr.length;
        int m = arr[0].length;
        while(j < n){
            while(i < n/2) {
                int temp = arr[i][j];
                arr[i][j] = arr[n-i-1][j];
                arr[n-i-1][j] = temp;
                i++;
            }
            i = 0;
            j++;
        }
        for(int l=0;l<n;l++){
            for(int k=0;k<m;k++){
                if(l < k) {
                    int temp = arr[l][k];
                    arr[l][k] = arr[k][l];
                    arr[k][l] = temp;
                }
            }
        }
    }
}
