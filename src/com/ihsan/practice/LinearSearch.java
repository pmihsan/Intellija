package com.ihsan.practice;


public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2,4,1,5,6,3};
        int target = 6;
        System.out.println(search(arr,target));
    }
    static int search(int[] arr,int target){
        int i;
        for(i=0;i<arr.length;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
