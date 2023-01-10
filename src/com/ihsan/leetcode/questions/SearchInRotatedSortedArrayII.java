package com.ihsan.leetcode.questions;

import java.util.HashMap;

public class SearchInRotatedSortedArrayII {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2};
        int target = 5;
        System.out.println(search(arr, target));
    }

    public static boolean search(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],i);
        }
        if(hm.containsKey(target)) return true;
        return false;
    }
}
