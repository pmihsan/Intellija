package com.ihsan.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        printPermutations(arr);
    }

    public static void printPermutations(int[] arr){
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        boolean[] flag = new boolean[arr.length];
        backtrack(ans, l, flag, arr);
        for(List<Integer> d : ans){
            System.out.println(d);
        }
    }

    public static void backtrack(List<List<Integer>> ans, List<Integer> l, boolean[] f, int[] nums){
        if(l.size() == nums.length){
            ans.add(new ArrayList<>(l));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!f[i]){
                l.add(nums[i]);
                f[i] = true;
                backtrack(ans, l, f, nums);
                l.remove(l.size() - 1);
                f[i] = false;
            }
        }
    }
}
