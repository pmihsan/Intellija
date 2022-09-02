package com.ihsan.leetcode.questions;

public class SubarraySumEqK {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 8;
        System.out.println(subarraySum(arr, k));
    }
    public static int count = 0;
    public static int subarraySum(int[] nums, int k){
        countSubarray(nums, 0, 0, k);
        return count;
    }

    public static void countSubarray(int[] nums,int s, int sum, int k){
        if(sum == k){
            count++;
            System.out.println(count);
            return;
        }
        sum += nums[s];
        if(sum <= k){
            countSubarray(nums, s+1, sum, k);
        }
        sum -= nums[s];
        if(sum + nums[s] <= sum){
            countSubarray(nums, s+1, sum, k);
        }
    }
}
