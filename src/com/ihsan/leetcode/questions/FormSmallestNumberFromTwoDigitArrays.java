package com.ihsan.leetcode.questions;

import java.util.HashMap;

public class FormSmallestNumberFromTwoDigitArrays {
    public static void main(String[] args) {
        int[] n1 = {3, 5, 6};
        int[] n2 = {8, 1, 7};

        System.out.println(minNumber(n1, n2));
    }
    public static int minNumber(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int res = 0;
        int min1 = 10;
        int min2 = 10;
        for(int i=0;i<nums1.length;i++) {
            hm.put(nums1[i], 1);
            if(min1 > nums1[i]) min1 = nums1[i];
        }
        for(int i=0;i<nums2.length;i++) {
            if(hm.containsKey(nums2[i])) hm.put(nums2[i], hm.get(nums2[i])+1);
            if(min2 > nums2[i]) min2 = nums2[i];
        }
        for(int i=1;i<=9;i++){
            if(hm.containsKey(i) && hm.get(i) == 2){
                return i;
            }
        }
        res = Math.min(min1, min2)  * 10;
        res += Math.max(min1, min2);
        return res;
    }
}
