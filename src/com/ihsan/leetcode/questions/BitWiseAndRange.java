package com.ihsan.leetcode.questions;

public class BitWiseAndRange {
    public static void main(String[] args) {
        int l = 5;
        int r = 7;
        System.out.println(bitwiseAnd(l,r));
        System.out.println(bitwiseAnd(0,0));
        System.out.println(bitwiseAnd(1,2147483647));
        System.out.println(bitwiseAnd(3,7));
    }
    public static int bitwiseAnd(int l, int r){
        if(l == r){
            return l & r;
        }
        int ans = r;
        while(l < r){
            ans &= l;
            l++;
        }
        return ans;
    }
}
