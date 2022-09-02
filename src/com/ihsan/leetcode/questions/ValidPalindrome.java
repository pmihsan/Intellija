package com.ihsan.leetcode.questions;

import java.util.Locale;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        String t = "race a car";
        String u = "0P";
        System.out.println(isPalindrome(s));
        System.out.println(isPalindrome(t));
        System.out.println(isPalindrome(u));
    }

    public static boolean isPalindrome(String s){
        s = s.toLowerCase();
        System.out.println(s);
        int i = 0;
        int j = s.length() - 1;
        while(i < j){
            if(!isValidAlpha(s.charAt(i))){
                i++;
            }
            else if(!isValidAlpha(s.charAt(j))){
                j--;
            }
            else if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            else{
                i++;
                j--;
            }
        }
        return true;
    }

    public static boolean isValidAlpha(char c){
        return c >= 'a' && c <= 'z' || c >= '0' && c <= '9';
    }
}
