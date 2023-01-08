package com.ihsan.leetcode.questions;

public class NumberOfOneBits {
    public static void main(String[] args) {
//        n = 00000010100101000001111010011100;
//        Consider this n as the input
    }

    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
        int count = 0;
        for(int i=0;i<32;i++){
            if((n & 1) == 1){ // checking for last bit if one then increment the count
                count++;
            }
            n = n >> 1; // shift to right for checking the last before bit
        }
        return count;
    }
}
