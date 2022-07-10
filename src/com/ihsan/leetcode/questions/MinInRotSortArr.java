package com.ihsan.leetcode.questions;

public class MinInRotSortArr {
    public static void main(String[] args) {
        int[] nums1 = {10,1,10,10,10};
        System.out.println(directMin(nums1));
    }
    static int directMin(int[] arr){ // For handling duplicates
        int s = 0;
        int e = arr.length - 1;
        while(s < e){
            int m = s + (e - s) / 2;
            if(arr[m] == arr[e]) e--;
            else if(arr[m] > arr[e]) s = m + 1;
            else e = m;
        }
        return arr[s];
    }
    public static int findMin(int[] arr) { // Does not handle duplicates
        if(arr.length == 1) return arr[0];
        int s = 0;
        int e = arr.length - 1;
        while(s <= e){
            int m = s + (e - s)/2;
            if(m < e && arr[m] > arr[m+1]) return arr[m+1];
            if(s < m && arr[m] < arr[m-1]) return arr[m];
            if(arr[m] <= arr[s]) e = m - 1;
            else s = m + 1;
        }
        if(arr[arr.length-1] < arr[0]) return arr[arr.length-1];
        return arr[0];
    }
}
