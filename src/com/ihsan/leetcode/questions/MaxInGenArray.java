package com.ihsan.leetcode.questions;

import java.util.Arrays;

public class MaxInGenArray {
    public static void main(String[] args) {
        int n = 100;
        System.out.println(getMax(n));
        System.out.println(getMax(9));
        System.out.println(getMax(10));
        System.out.println(getMax(3));
    }
    public static int getMax(int n){
        if(n == 0) return 0;
        if(n == 1 || n == 2) return 1;
        if(n == 3) return 2;
        int max = 1;
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 2;
        int j = 1;
        for(int i=2;i<=n;i+=2){
            dp[(2 * j)] = dp[j];
            if((2 * j) + 1 == n+1) break;
            dp[(2 * j) + 1] = dp[j] + dp[j+1];
            j++;
        }
        for(int i=0;i<=n;i++){
            max = Math.max(max, dp[i]);
        }
//        System.out.println(Arrays.toString(dp));
        return max;
    }
}
