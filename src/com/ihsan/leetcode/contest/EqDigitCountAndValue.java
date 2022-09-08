package com.ihsan.leetcode.contest;

import java.util.Arrays;

public class EqDigitCountAndValue {
    public static void main(String[] args) {
        String num = "01";
        System.out.println(CheckNum(num));
    }

    static boolean CheckNum(String num) {
        int[] arr = new int[num.length()];
        getSeparateDigits(arr,num);
        System.out.println(Arrays.toString(arr));
        int i = 0;
        while(i < num.length()){
            int c = getCount(arr,i);
            if(c != arr[i]){
                return false;
            }
            i++;
        }
        return true;
    }

    static int getCount(int[] arr, int val) {
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == val){
                count++;
            }
        }
        return count;
    }

    static void getSeparateDigits(int[] arr, String num) {
        for(int i=0;i<num.length();i++){
            arr[i] = num.charAt(i) - '0';
        }
    }
}
