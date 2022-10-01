package com.ihsan.practice;

import java.util.Arrays;

public class PrintDiagonalMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 34},
                {4, 5, 6, 35},
                {7, 8, 9, 36},
                {10, 11, 12, 13}
        };
        printDiagonally(arr);
    }
    public static void printDiagonally(int[][] arr){
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
        for(int i=0;i<arr[0].length;i++){
            int row = 0;
            int col = i;
            while(col >= 0){
                System.out.print(arr[row][col] + " ");
                col--;
                row++;
            }
        }
        for(int i=1;i<arr[0].length;i++){
            int col = arr[0].length - 1;
            int row = i;
            while(row < arr[0].length){
                System.out.print(arr[row][col] + " ");
                row++;
                col--;
            }
        }

        System.out.println();
    }
}
