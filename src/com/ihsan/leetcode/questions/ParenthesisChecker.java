package com.ihsan.leetcode.questions;

public class ParenthesisChecker {
    public static void main(String[] args) {
        String str = "{{}{}{}}";
        System.out.println(isValidParen(str));
    }
    public static  boolean isValidParen(String str){
        if(str.length() == 0 || str.length() == 1) return false;
        int c = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '{'){
                c++;
            }
            else c--;
        }
        if(c > 0){
            return false;
        }
        return true;
    }
}
