package com.ihsan.practice;

public class Complement
{
    public static void main(String[] args) {
        int a = 16;
        double log2 = Math.log(a) / Math.log(2);
        int noOfBits = (int) Math.floor(log2) + 1;
        System.out.println("No of Bits in the given number is " + noOfBits);
        int res = ( (1 << noOfBits) - 1 ) ^ a;
        System.out.println("The Complement of " + a + " is " + res);
    }
}