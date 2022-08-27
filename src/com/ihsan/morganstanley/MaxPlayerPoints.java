package com.ihsan.morganstanley;

public class MaxPlayerPoints {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6};
        int n = arr.length;
        System.out.println(getMaxDiff(arr,n));
        int[] arr1 = {1, 3, 4, 5, 6, 9, 10, 4};
        int n1 = arr1.length;
        System.out.println(getMaxDiff(arr1,n1));
    }

    static int getMaxDiff(int[] arr, int n) {
        int max = 0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                max = Math.max(Math.abs(arr[j] - arr[i]),max);
            }
        }
        return max;
    }
}
