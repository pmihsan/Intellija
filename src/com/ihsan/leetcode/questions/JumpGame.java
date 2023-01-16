package com.ihsan.leetcode.questions;

public class JumpGame {
    public static void main(String[] args) {
        int[] arr = {0,0,0,0};
        System.out.println(canJump(arr));
        int[] arr1 = {2, 3, 3, 1, 4};
        System.out.println(canJump(arr1));
    }

    public static boolean canJump(int[] nums) {
        if(nums.length == 1) return true;
        int maxReach = 0;
        int stop = 0;
        for(int i=0;i<nums.length-1;i++){
            maxReach = Math.max(maxReach, i+nums[i]);
            if(i == stop){
                stop = maxReach;
                if(stop >= nums.length-1) return true;
            }
        }
        return false;
    }
}
