package com.ihsan.leetcode.questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4};
        int t = 6;
        System.out.println(Arrays.toString(twoSum(arr, t)));
    }


    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> m = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(m.containsKey(target - nums[i])){
                return new int[] {i, m.get(target - nums[i])};
            }
            m.put(nums[i], i);
        }
        return new int[0];
    }
}
