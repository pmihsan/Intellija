package com.ihsan.leetcode.questions;

import java.util.*;

public class IntersectionOfTwoArraysII {
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 1};
        int[] b = {2, 2};

        System.out.println(Arrays.toString(intersect(a,b)));

        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};

        System.out.println(Arrays.toString(intersect(nums1,nums2)));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> l = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        HashMap<Integer, Integer> count = new HashMap<>();

        for(int i=0;i<nums1.length;i++){
            if(hm.containsKey(nums1[i])) hm.put(nums1[i], hm.get(nums1[i])+ 1);
            else hm.put(nums1[i], 1);
        }

        for(int i=0;i<nums2.length;i++){
            if(hm.containsKey(nums2[i])){
                if(count.containsKey(nums2[i])) count.put(nums2[i], count.get(nums2[i]) + 1);
                else count.put(nums2[i], 1);
            }
        }

        Iterator iterate = hm.entrySet().iterator();
        while(iterate.hasNext()){
            Map.Entry map = (Map.Entry)iterate.next();
            int k = (int)map.getKey();
            if(count.containsKey(k)){
                int v = Math.min(hm.get(k), count.get(k));
                while(v > 0){
                    l.add(k);
                    v--;
                }
            }
        }

        int[] nums = new int[l.size()];
        for(int i=0;i<nums.length;i++){
            nums[i] = l.get(i);
        }
        return nums;
    }
}
