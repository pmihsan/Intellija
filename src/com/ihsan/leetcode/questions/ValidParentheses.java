package com.ihsan.leetcode.questions;

import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        String s = "(]";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                st.push(s.charAt(i));
            }
            else if(s.charAt(i) == ')' && (st.isEmpty() || st.pop() != '(')){
                return false;
            }
            else if(s.charAt(i) == '}' && (st.isEmpty() || st.pop() != '{')){
                return false;
            }
            else if(s.charAt(i) == ']' && (st.isEmpty() || st.pop() != '[')){
                return false;
            }
        }
        return st.isEmpty();
    }
}
