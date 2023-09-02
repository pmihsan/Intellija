package com.ihsan.practice;

import java.util.Arrays;

public class BitManipulation {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(bitManipulation(25, 3)));
    }
    public static int[] bitManipulation(int num, int i){
        // Write your code here.

        // get i-th bit
        int get = (num >> (i-1)) & 1;

        int ls = (1 << (i-1));

        // set i-th bit
        int set = num | ls;

        // clear i-th bit
        int clear = num & (~ls);

        return new int[]{get, set, clear};
    }
}
