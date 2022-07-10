package com.ihsan.leetcode.questions;

public class SearchIn2D {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 3, 5, 7},
                {11 ,13, 15, 21},
                {22, 23, 25, 30}
        };
        int target = 9;
        System.out.println(Search(arr,target));
    }
    public static boolean Search(int[][] arr, int target){
        int i = 0;
        int j = arr[0].length - 1;
        int m = arr.length;
        while(i < m && j >= 0){
            if(arr[i][j] == target) return true;
            else if(arr[i][j] > target) j--;
            else i++;
        }
        return false;
    }
}
