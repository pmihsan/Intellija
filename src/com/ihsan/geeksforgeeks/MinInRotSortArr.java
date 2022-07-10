package com.ihsan.geeksforgeeks;

public class MinInRotSortArr {
    public static void main(String[] args) {
        int[] arr  = {3,4,5,1,2};
        int[] arr1 = {2,3,4,5,1};
        int[] arr2 = {5,1,2,3,4};
        int[] arr3 = {4,5,1,2,3};
        int[] arr4 = {1,2,3,4,5}; // Not a rotated sorted Array Hence added a final check
        int[] arr5 = {2,2,2,2,1};

        System.out.println(Min(arr));
        System.out.println(Min(arr1));
        System.out.println(Min(arr2));
        System.out.println(Min(arr3));
        System.out.println(Min(arr4));
        System.out.println(Min(arr5));
    }

    static int Min(int[] arr) { // Accepted by GFG but not there is some problem
        int s = 0;
        int e = arr.length - 1;
        while(s <= e){
            int m = s + (e - s)/2;
            if(m < e && arr[m] > arr[m+1]){
                return arr[m+1];
            }
            if(s < m && arr[m] < arr[m-1]){
                return arr[m];
            }
            if(arr[s] > arr[m]){
                e = m - 1;
            }
            else{
                s = m + 1;
            }

        }
        if(arr[arr.length-1] < arr[0]){
            return arr[arr.length-1];
        }
        return arr[0];
    }
}
