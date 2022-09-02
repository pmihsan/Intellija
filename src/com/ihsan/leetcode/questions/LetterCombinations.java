package com.ihsan.leetcode.questions;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinations {

/*
            2 abc 0 1 2
            3 def 3 4 5
            4 ghi 6 7 8
            5 jkl 9 10 11
            6 mno 12 13 14
            7 pqrs 15 16 17 18
            8 tuv 19 20 21
            9 wxyz 22 23 24 25
*/
public static void main(String[] args) {
        System.out.println(letterCombinations("78"));
    }

    public static List<String> letterCombinations(String digits) {
        return getCombinations("",digits);
    }

    public  static List<String> getCombinations(String s, String digits) {
        if(digits.length() == 0){
            List<String> list = new ArrayList<>();
            list.add(s);
            return list;
        }
        int num = digits.charAt(0) - '0' - 1;

        List<String> l = new ArrayList<>();

        int end = num*3;
        int start = (num-1) * 3;

        if(num == 6){ end++; }
        else if(num == 7){
            start++;
            end++;
        } else if (num == 8) {
            start++;
            end+=2;
        }
        for(int i=start;i < end;i++){
            char ch = (char) ('a' + i);
            l.addAll(getCombinations(s + ch, digits.substring(1)));
        }

        return l;
    }
}
