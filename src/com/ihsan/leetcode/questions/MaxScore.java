package com.ihsan.leetcode.questions;

import java.util.Arrays;

public class MaxScore {
    public static void main(String[] args) {
        int[] nums = {-5,-3,-3,-2,7,1};
        int[] multipliers = {-10,-5,3,4,6};
        System.out.println(maximumScore(nums,multipliers));
    }
    public static int maximumScore(int[] nums, int[] multipliers) {
        Arrays.sort(nums);
        int score = 0;
        int j = 0;
        int k = nums.length - 1;
        for (int multiplier : multipliers) {
            int max1 = multiplier * nums[j];
            int max2 = multiplier * nums[k];
            if (max1 >= max2 || max1 < 0) {
                score += max1;
                j++;
            } else {
                score += max2;
                k--;
            }
            System.out.println(j + " " + k);
            System.out.println(max1 + " " + max2 + " " + score);
        }
        return score;
    }
}
