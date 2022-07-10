package com.ihsan.geeksforgeeks;

import java.util.Arrays;

public class EvenIndex {
    public static void main(String[] args) {
        int[] arr = {3,1,6,2,1,4};
        AfterChange(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void AfterChange(int[] arr) {  // Similar to quick sort approach if found two violations one for even and another for odd we swap those two
        int k = 0;
        int j = 1;
        while (true){
            while(k < arr.length && arr[k] % 2 == 0){
                k += 2;
            }
            while(j < arr.length && arr[j] % 2 != 0){
                j += 2;
            }
            if(k < arr.length && j < arr.length){
                swap(arr,k,j);
            }
            else{
                break;
            }
        }
    }

    static void swap(int[] arr, int k, int j) {
        int temp = arr[k];
        arr[k] = arr[j];
        arr[j] = temp;
    }
}
