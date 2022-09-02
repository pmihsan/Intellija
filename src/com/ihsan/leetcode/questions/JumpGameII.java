package com.ihsan.leetcode.questions;

public class JumpGameII {
    public static void main(String[] args) {
        int[] nums = {2, 3, 0, 1, 4};
        System.out.println(getMinJumps(nums));
        int[] nums1 = {1, 2};
        System.out.println(getMinJumps(nums1));
    }

    public static int getMinJumps(int[] nums){
        int jumps = 0;
        int currJump = 0;
        int maxJump = 0;
//        for (int i = 0;i < nums.length - 1;i++) {
//            maxJump = Math.max(maxJump, nums[i] + 1);
//            if(i == currJump){
//                jumps++;
//                currJump = maxJump;
//            }
//        }
        return jumps;
    }
}
