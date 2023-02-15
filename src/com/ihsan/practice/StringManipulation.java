package com.ihsan.practice;

import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        Palindrome p = new Palindrome(s);
        System.out.println("Palindrome - " + p.isPalindrome());
    }
    public static class Palindrome{
        String str;
        Palindrome(){
            str = "empty";
        }
        Palindrome(String s){
            str = s;
        }
        private String reverse(){
            String t = "";
            for(int i=str.length()-1;i>=0;i--){
                t += str.charAt(i);
            }
            return t;
        }

        public boolean isPalindrome(){
            return str.equals(reverse());
        }
    }
}
