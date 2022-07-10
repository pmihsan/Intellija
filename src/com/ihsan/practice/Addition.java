package com.ihsan.practice;

public class Addition {
    public static void main(String[] args) {
        int a = 5;
        int b = 12;
        System.out.println(Add(a,b));
    }

    private static int Add(int a, int b) {
        int carry = 0;
        while (b != 0){
            carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
//        return a + b;
    }
}
