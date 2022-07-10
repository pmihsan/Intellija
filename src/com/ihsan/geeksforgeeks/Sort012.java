package com.ihsan.geeksforgeeks;

import java.util.Arrays;

public class Sort012 {
    public static void main(String[] args) {
        int[] arr = {0,2,1,2,2,1,2,1,0,0,1};
        sortArr(arr);
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sortArr(int[] arr){ // Optimized One
        int l,m,h;
        l = m = 0;
        h = arr.length - 1;
        while (m < h){
            if(arr[m] == 0){
                swap(arr,m,l);
                m++;
                l++;
            }
            else if(arr[m] == 2){
                swap(arr,m,h);
                h--;
            }
            else{
                m++;
            }
        }
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void sort(int[] arr){ // Brute Force Method
        int c0, c1, c2;
        c0 = c1 = c2 = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0) c0++;
            else if(arr[i] == 1) c1++;
            else c2++;
        }
        for(int i=0;i<arr.length;i++){
            if(i < c1) arr[i] = 0;
            else if(i < c1 + c2) arr[i] = 1;
            else arr[i] = 2;
        }
    }
}
