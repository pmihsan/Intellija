package com.ihsan.leetcode.questions;

public class ReverseBits {
    public static void main(String[] args) {
//        n = 00000010100101000001111010011100;
//        Consider this n as the input
    }

    // you need treat n as an unsigned value
    public static int reverseBits(int n) { // n length <= 32
        int rev = 0;  // for reverse number
        for(int i=0;i<32;i++){
            rev = rev << 1; // always left shift for performing operation with last bit
            if((n & 1) == 1){ // checking for the last bit whether it is one or not
                rev = rev | 1; // if one the or(|) it with reverse(It would or to the last bit because of 1)
            }
            n = n >> 1; // Then Right shift n to consider the next last bit
            // It Basically check the last bit and n and puts it as the first bit of reverse
        }
        return rev;
    }
}
