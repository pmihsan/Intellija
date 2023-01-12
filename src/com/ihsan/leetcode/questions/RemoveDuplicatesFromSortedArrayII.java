package com.ihsan.leetcode.questions;

public class RemoveDuplicatesFromSortedArrayII {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 2, 2, 3, 3};
        int n = removeDuplicates(nums);
        for(int i=0;i<n;i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static int removeDuplicates(int[] nums) {
        int index = 1;
        int count = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] == nums[i-1]) count++;
            else count = 1;
            if(count < 3){
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
