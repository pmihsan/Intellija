package com.ihsan.leetcode.questions;

public class AddStrings {
    public static void main(String[] args) {
        String s = "111";
        String t = "123";
        System.out.println(addStrings(s,t));
    }
    public static String addStrings(String num1, String num2) {
        int a = 0, b = 0;
        for(int i=0;i<num1.length();i++){
            a = a * 10 + num1.charAt(i) - '0';
        }
        for(int i=0;i<num2.length();i++){
            b = b * 10 + num2.charAt(i) - '0';
        }
        return Integer.toString(a+b);
    }
}
