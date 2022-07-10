package com.ihsan.practice;

import java.util.Arrays;

public class Subtraction {
    public static void main(String[] args) {
        int a = 15;
        int b = 13;
        System.out.println(Sub3(a,b));
    }
    public static int Sub(int a, int b){
        String s = Integer.toBinaryString(b);
        String p = "";
        char[] ch = s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i] == '0') ch[i] = '1';
            else ch[i] = '0';
            p += ch[i];
        }
        System.out.println(p);
        int res = Integer.parseInt(p,2);
        System.out.println(res);
        return a - b;
    }

    public static int Sub2(int a, int b) {
        int borrow = 0;
        while (b != 0){
            borrow = (~a) & b;
            a = a ^ b;
            b = borrow << 1;
        }
        return a;
//        return a - b;
    }

    public static int Sub3(int a, int b){
        System.out.println((~a));
        return a - b;
    }

}
