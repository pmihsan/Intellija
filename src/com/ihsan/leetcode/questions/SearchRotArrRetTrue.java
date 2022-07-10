package com.ihsan.leetcode.questions;

public class SearchRotArrRetTrue {
    public static void main(String[] args) {
//        int[] arr = {3, 4, 5, 1, 2};
//        int target = 2;
//        System.out.println(searchTarget(arr,target));
        int arr1[] = {1,0,1,1,1}; // Fails for this case
        System.out.println(searchTarget(arr1,0));
    }

    public static boolean searchTarget(int[] arr, int target) {
        int pivot = findPivot(arr);
        System.out.println(pivot);
        if(pivot == -1) return binarySearch(arr,target,0, arr.length - 1); // Already sorted array
        if(arr[pivot] == target) return true;
        if(arr[0] <= target) return binarySearch(arr, target, 0, pivot - 1);
        return binarySearch(arr, target, pivot + 1, arr.length - 1);
        /*
        We can also use
        if(arr[arr.length-1] >= target) return binarySearch(arr,target,pivot + 1, arr.length - 1);
        return binarySearch(arr, target, 0, pivot - 1);
        */
    }

    public static int findPivot(int[] arr) {
        int l = 0;
        int h = arr.length - 1;
        if(h < l) return -1;
        if(h == l) return 0;

        while(l < h){
            int m = l + (h - l) / 2;
            if(m < h && arr[m] > arr[m+1]) return m;
            else if(m > l && arr[m] < arr[m-1]) return m-1;
            else if(arr[l] > arr[m]) h = m - 1;
            else l = m + 1;
        }
        return -1;
    }

    static boolean binarySearch(int[] arr, int target,int s, int e){
        while(s <= e){
            int m = s + (e - s) / 2;
            if(arr[m] == target) return true;
            else if(arr[m] < target) s = m + 1;
            else e = m - 1;
        }
        return false;
    }
}
