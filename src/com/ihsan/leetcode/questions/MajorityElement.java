package com.ihsan.leetcode.questions;

import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = { 2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement1(arr));
        System.out.println(majorityElement2(arr));
    }

    public static int majorityElement1(int[] nums) {  // By Sorting
        if(nums.length == 1) return nums[0];
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

    public static int majorityElement2(int[] nums) {
        int res = 0, c = 0;
        for (int num : nums) {
            if (c == 0) {
                res = num;
                c = 1;
            } else if (res == num) {
                c++;
            } else {
                c--;
            }
        }
        return res;
    }
}
