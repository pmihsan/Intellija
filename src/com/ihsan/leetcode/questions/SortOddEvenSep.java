package com.ihsan.leetcode.questions;

import java.util.Arrays;

public class SortOddEvenSep {
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 3, 5};
        System.out.println(Arrays.toString(sortOddEvens(nums)));
    }

    public static int[] sortOddEvens(int[] nums) {
        int size = nums.length / 2 + nums.length % 2;
        int[] odd = new int[size];
        int[] even = new int[size];
        for(int i=0;i<nums.length;i++){
            if(i % 2 == 0) even[i/2] = nums[i];
            else odd[i/2] = nums[i];
        }
        Arrays.sort(even);
        Arrays.sort(odd);
//        System.out.println(Arrays.toString(even));
//        System.out.println(Arrays.toString(odd));
        for(int i=0;i<nums.length;i++){
            if(i % 2 == 0) nums[i] = even[i/2];
            else nums[i] = odd[odd.length - 1 - i/2];
        }
        return nums;
    }
}
