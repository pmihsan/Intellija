package com.ihsan.leetcode.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DisappearedNumbers {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        cyclicSort(nums);
        System.out.println(Arrays.toString(nums));
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i] != i+1){
                l.add(i+1);
            }
        }
        return l;
    }

    public static void cyclicSort(int[] nums){
        int i = 0;
        while(i < nums.length){
            int index = nums[i] - 1;
            if(nums[i] != nums[index]){
                int t = nums[i];
                nums[i] = nums[index];
                nums[index] = t;
            }
            else{
                i++;
            }
        }
    }
}
