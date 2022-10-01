package com.ihsan.leetcode.questions;

import java.util.Arrays;

public class CoinChange {
    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amt = 11;
        System.out.println(coinChange(coins, amt));
        int[] coins2 = {186, 419, 83, 408};
        int amt2 = 6249;
        System.out.println(coinChange(coins2, amt2));
    }
    public static int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int i = coins.length - 1;
        int sum = 0, c = 0;
        while(i >= 0){
            if(sum == amount){
                return c;
            }
            else if(sum < amount){
                sum += coins[i];
                c++;
            }
            else if(sum > amount){
                sum -= coins[i];
                i--;
                c--;
            }
        }
        return -1;
    }
}
