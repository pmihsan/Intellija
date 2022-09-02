package com.ihsan.leetcode.questions;

public class ValidPalindromeII {
    public static void main(String[] args) {
        String s = "aba";
        String t = "abca";
        String u = "abc";
        String v = "abbaa";
        System.out.println(validPalindrome(s));
        System.out.println(validPalindrome(t));
        System.out.println(validPalindrome(u));
        System.out.println(validPalindrome(v));
    }

    public static boolean validPalindrome(String s){
        int i = 0;
        int j = s.length() - 1;
        while(i < j){
            if(s.charAt(i) == s.charAt(j) ){
                i++;
                j--;
            }
            else if(checkPalindrome(s, i+1, j)){
                return true;
            }
            else{
                return checkPalindrome(s, i, j-1);
            }
        }
        return true;
    }

    public static boolean checkPalindrome(String t, int s, int e){
        while(s < e){
            if(t.charAt(s) != t.charAt(e)) return false;
            s++;e--;
        }
        return true;
    }
}
