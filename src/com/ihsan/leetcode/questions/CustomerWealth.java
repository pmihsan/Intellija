package com.ihsan.leetcode.questions;

public class CustomerWealth {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 1},
                {5, 1, 1}
        };
        System.out.println(maximumWealth(arr));
    }
    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int[] cust : accounts){
            int wealth = 0;
            for(int amt : cust){
                wealth += amt;
            }
            if(wealth > max) max = wealth;
        }
        return max;
    }
}
