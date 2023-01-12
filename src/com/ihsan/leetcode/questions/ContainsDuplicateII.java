package com.ihsan.leetcode.questions;

import java.util.HashMap;

public class ContainsDuplicateII {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 3};
        int k = 2;
        System.out.println(containsNearbyDuplicate(arr,k));
        System.out.println(containsNearbyDuplicate2(arr,k));
    }

    // Optimized
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i]) && (Math.abs(hm.get(nums[i]) - i) <= k)) {
                return true;
            }
            else hm.put(nums[i],i);
        }
        return false;
    }

    // Bruteforce

    public static boolean containsNearbyDuplicate2(int[] nums, int k) {
        for(int i=0;i<nums.length-1;i++){
            for(int j=nums.length-1;j>i;j--){
                if(nums[i] == nums[j] && Math.abs(i-j) <= k){
                    return true;
                }
            }
        }
        return false;
    }
}
