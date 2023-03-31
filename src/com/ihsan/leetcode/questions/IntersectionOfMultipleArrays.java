package com.ihsan.leetcode.questions;

import java.util.*;

public class IntersectionOfMultipleArrays {
    public static void main(String[] args) {
        int[][] nums1 = {
                {3, 1, 2, 4, 5},
                {1, 2, 3, 4},
                {3, 4, 5, 6}
        };
        System.out.println(intersection(nums1));

        int[][] nums2 = {
                {1, 2, 3},
                {4, 5 ,6}
        };
        System.out.println(intersection(nums2));
    }

    public static List<Integer> intersection(int[][] nums) {
        List<Integer> l = new ArrayList<>();
        int[] ans = new int[1000];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                ans[nums[i][j] - 1]++;
            }
        }
        for(int i=0;i<1000;i++){
            if(ans[i] == nums.length) l.add(i+1);
        }
        return l;
    }
}
