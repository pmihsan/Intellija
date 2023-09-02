package com.ihsan.practice;

import java.util.ArrayList;

public class GenerateParenthesis {
    public static void main(String[] args) {
        System.out.println(validParenthesis(3));
    }
    public static ArrayList<String> validParenthesis(int n){
        // Write your code here.
        ArrayList<String> list = new ArrayList<>();
        generateParenthesis("", n, 0, 0, list);
        return list;
    }

    public static void generateParenthesis(String up, int n, int open, int close, ArrayList<String> list){
        if(close == n){
            list.add(up);
            return;
        }
        if(open < n){
            generateParenthesis(up+"(", n, open+1, close, list);
        }
        if(open > close){
            generateParenthesis(up+")", n, open, close+1, list);
        }
    }
}
