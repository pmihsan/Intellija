package com.ihsan.leetcode.questions;

import java.util.Arrays;

public class MinCostClimbingStairs {
    public static void main(String[] args) {
        int[] arr = {1,100,1,1,1,100,1,1,100,1};
        int[] arr2 ={10,15,20};
        int[] arr3 = {1,2,1,4,2,4,1,6};
        int[] arr4 = {0,0,0,1};
        System.out.println(findMinCost(arr));
        System.out.println(findMinCost(arr2));
        System.out.println(findMinCost(arr3));
        System.out.println(findMinCost(arr4));
    }

    public static int findMinCost(int[] arr){
        int[] dp = new int[arr.length + 1];
        Arrays.fill(dp, -1);
        dp[0] = arr[0];
        dp[1] = arr[1];
        for(int i=2;i< arr.length;i++){
            dp[i] = arr[i] + Math.min(dp[i-1], dp[i-2]);
        }
        int cost = Math.min(dp[arr.length - 1], dp[arr.length - 2]);
        return cost;
    }
}
