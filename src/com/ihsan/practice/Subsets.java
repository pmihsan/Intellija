package com.ihsan.practice;

import java.util.*;

public class Subsets {
    public static void main(String[] args) {
        // Bit Manipulation
        System.out.println(subsets(new int[]{1, 2, 3}));
        System.out.println(subsets(new int[]{1, 2}));

        System.out.println();

        // Recursive
        System.out.println(subsets1(new int[]{1, 2, 3}));
        System.out.println(subsets1(new int[]{1, 2}));
    }

    public static List<List<Integer>> subsets1(int[] arr){
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        solve(arr, 0, temp, list);
//        list.sort((o1, o2) -> o1.size() - o2.size());
        list.sort(Comparator.comparingInt(List::size));
        return list;
    }

    public static void solve(int[] a, int s, List<Integer> temp, List<List<Integer>> l){
        if(s == a.length){
            l.add(new ArrayList<>(temp));
            return;
        }

        if(s < a.length) temp.add(a[s]);
        solve(a, s+1, temp, l);

        if(!temp.isEmpty()) temp.remove(temp.size() - 1);
        solve(a, s+1, temp, l);

    }

    public static List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;

        List<List<Integer>> list = new ArrayList<>();

        for(int num=0;num<(1 << n);num++){
            List<Integer> l = new ArrayList<>();
            for(int i=0;i<n;i++){
                int set = (num & (1 << i));
                if(set != 0){
                    l.add(nums[i]);
                }
            }
            list.add(l);
        }

        return list;
    }
}
