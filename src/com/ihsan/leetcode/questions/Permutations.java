package com.ihsan.leetcode.questions;

import java.util.ArrayList;
import java.util.List;

// Both Permutations I and II
public class Permutations {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        System.out.println(permute(nums));
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] flag = new boolean[nums.length];
        ArrayList<Integer> a = new ArrayList<>();
        getPermutations(nums, flag, a, result);
        return result;
    }

    public static void getPermutations(int[] nums, boolean[] flag, ArrayList<Integer> l, List<List<Integer>> result) {
        if(l.size() == nums.length){
            ArrayList<Integer> t = new ArrayList<>(l);
            if(!result.contains(t)) {
                result.add(t);
            }
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(!flag[i]) {
                l.add(nums[i]);
                flag[i] = !flag[i];
                getPermutations(nums, flag, l, result);
                flag[i] = !flag[i];
                l.remove(l.size() - 1);
            }
        }
    }
}
