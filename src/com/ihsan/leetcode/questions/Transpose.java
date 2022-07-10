package com.ihsan.leetcode.questions;

import java.util.Arrays;

public class Transpose {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6}
//                {7, 8, 9}
        };
//        transposeMatrix(arr);
//        for(int[] a : arr){
//            System.out.println(Arrays.toString(a));
//        }
        int[][] mat = transposeMat(arr);
        for(int[] m : mat){
            System.out.println(Arrays.toString(m));
        }


    }
    public static void transposeMatrix(int[][] arr){
        int m = arr.length;
        int n = arr[0].length;
        int i,j;
        i = j = 0;
        while(i < m){
            while(j < n){
                if(i != j) {
                    int t = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = t;
                }
                j++;
            }
            i++;
        }
    }
    public static int[][] transposeMat(int[][] arr){
        int m = arr.length;
        int n = arr[0].length;
        int[][] res = new int[n][m];
        int i,j;
        i = j = 0;
        while(i < m){
            while(j < n){
                res[j][i] = arr[i][j];
                j++;
            }
            j = 0;
            i++;
        }
        return res;
    }
}
