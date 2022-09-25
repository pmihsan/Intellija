package com.ihsan.leetcode.questions;

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));
        System.out.println(findNumbers2(nums));
    }
    public static int findNumbers(int[] nums) {
        int c = 0;
        for(int i : nums){
            if(isEven(i)) c++;
        }
        return c;
    }

    public static boolean isEven(int n){
        return digitCount(n) % 2 == 0;
    }

    public static int digitCount(int n){
        if(n == 0) return 0;
        if(n < 0 ) n *= -1;
        int c = 0;
        while(n > 0) {
            c++;
            n /= 10;
        }
        return c;
    }

    public static int digitCount2(int n){
        if(n == 0) return 0;
        if(n < 0 ) n *= -1;
        return (int)(Math.log10(n)) + 1;
    }

    public static int findNumbers2(int[] nums) {
        int c = 0;
        for(int i : nums){
            if(digitCount2(i) % 2 == 0) c++;
        }
        return c;
    }
}
