package com.ihsan.leetcode.questions;

public class JumpGameII {
    public static void main(String[] args) {
        int[] nums = {2, 3, 0, 1, 4};
        System.out.println(jump(nums));
        int[] nums1 = {1, 2};
        System.out.println(jump(nums1));
    }

    public static int jump(int[] nums) {
        int steps = 0;
        int maxReach = 0;
        int stop = 0;
        for(int i=0;i<nums.length-1;i++){
            maxReach = Math.max(maxReach, i+nums[i]);
            if(i == stop){
                steps += 1;
                stop = maxReach;
                if(stop >= nums.length-1) return steps;
            }
        }
        return steps;
    }

}
