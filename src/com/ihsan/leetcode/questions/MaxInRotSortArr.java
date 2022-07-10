package com.ihsan.leetcode.questions;

public class MaxInRotSortArr {
    public static void main(String[] args) {
        /*
        int[] arr  = {3,4,5,1,2};
        int[] arr1 = {2,3,4,5,1};
        int[] arr2 = {5,1,2,3,4};
        int[] arr3 = {4,5,1,2,3};
        int[] arr4 = {1,2,3,4,5}; // Not a rotated sorted Array Hence added a final check

        System.out.println(Max(arr));
        System.out.println(Max(arr1));
        System.out.println(Max(arr2));
        System.out.println(Max(arr3));
        System.out.println(Max(arr4));
        */
        int[] nums = {4, 5, 6, 1, 2, 3};
        int[] nums1 = {10,1,10,10,10};
        System.out.println(directMax(nums));
    }
    static int directMax(int[] arr){ // For handling the duplicates
        int s = 0;
        int e = arr.length - 1;
        while(s < e){
            int m = s + (e - s) / 2;
            if(arr[m] == arr[s]) s++;
            else if(arr[m] < arr[e]) e = m - 1;
            else s = m;
        }
        return arr[s];
    }
    static int Max(int[] arr) { // GFG
        int s = 0;
        int e = arr.length - 1;
        while(s <= e){
            int m = s + (e - s)/2;
            if(m < e && arr[m] > arr[m+1]) return m;
            if(m > s && arr[m] < arr[m-1]) return m-1;
            if(arr[s] >= arr[m]) e = m - 1;
            else s = m + 1;
        }
        return -1;
    }
    public static int findMax(int[] arr){
        int pivot = findPivot(arr);
        System.out.println(pivot);
        if(pivot == -1) return arr[arr.length-1];
        return arr[pivot];
    }
    public static int findPivot(int[] arr) { // Leetcode
        int l = 0;
        int h = arr.length - 1;
        if(h < l) return -1;
        if(h == l) return 0;

        while(l <= h){
            int m = l + (h - l) / 2;
            if(m < h && arr[m] > arr[m+1]) return m;
            else if(m > l && arr[m] < arr[m-1]) return m-1;
            else if(arr[l] > arr[m]) h = m - 1;
            else l = m + 1;
        }
        return -1;
    }
}
