package com.ihsan.leetcode.questions;

import java.util.HashMap;

public class SubarraySumEqK {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int k = 3;
        System.out.println(subarraySum(arr, k));
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int k1 = 8;
        System.out.println(subarraySum(arr1, k1));
    }

    public static int subarraySum(int[] nums, int k){
        HashMap<Integer, Integer> hm = new HashMap<>();
        int c = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum == k) c++;
            if (hm.get(sum - k) != null) c += hm.get(sum-k);
            if (hm.get(sum) != null) hm.put(sum, hm.get(sum) + 1);
            else hm.put(sum, 1);
        }
        System.out.println(hm);
        return c;
    }
/*
    public static int count = 0;
    public static void countSubArraySum(int[] nums, int s, int sum, int k){
        if(sum == k){
            System.out.println("Got It " + sum);
            count++;
            return;
        }
        sum += nums[s];
        if(sum <= k && s < nums.length - 1){
//            System.out.println("Add " + s + " " + sum);
            countSubArraySum(nums,s + 1, sum, k);
        }
        sum -= nums[s];
        if(s > 0) {
//            System.out.println("Minus " + s + " " + sum);
            countSubArraySum(nums, s - 1, sum, k);
        }
    }
*/

    public int subarraySum1(int[] nums, int k) { //brute force
        int c = 0;
        for(int i=0;i<nums.length;i++){
            int sum = 0;
            for(int j = i;j<nums.length;j++){
                sum += nums[j];
                if(sum == k) c++;
            }
        }
        return c;
    }

}
