package com.ihsan.leetcode.questions;

public class RomanToInteger {
    public static void main(String[] args) {
        String s = "LVIII";
        System.out.println(romanToInt(s));
        s = "MX";
        System.out.println(romanToInt(s));
        s = "MCMXC";
        System.out.println(romanToInt(s));
        s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {
        int res = 0;
        for(int i=0;i<s.length();i++){
            int ch_i = getPriority(s.charAt(i));
            if(i < s.length() - 1 && ch_i == 1){
                int ch_ip = getPriority(s.charAt(i+1));
                if (ch_ip == 2){
                    res += 4; i++;
                }
                else if(ch_ip == 3){
                    res += 9; i++;
                }
                else {
                    res += getInteger(s.charAt(i));
                }
            }
            else if(i < s.length() - 1 && ch_i == 3){
                int ch_ip = getPriority(s.charAt(i+1));
                if (ch_ip == 4){
                    res += 40; i++;
                }
                else if(ch_ip == 5){
                    res += 90; i++;
                }
                else {
                    res += getInteger(s.charAt(i));
                }
            }
            else if(i < s.length() - 1 && ch_i == 5){
                int ch_ip = getPriority(s.charAt(i+1));
                if (ch_ip == 6){
                    res += 400; i++;
                }
                else if(ch_ip == 7){
                    res += 900; i++;
                }
                else {
                    res += getInteger(s.charAt(i));
                }
            }
            else {
                res += getInteger(s.charAt(i));
            }
//            else if(i < s.length() - 1 && (getPriority(s.charAt(i)) == 3 && (getPriority(s.charAt(i+1)) == 4 || getPriority(s.charAt(i+1)) == 5) ) ){
//                res += getInteger(s.charAt(i)) + getInteger(s.charAt(i+1));
//                i++;
//            }
//            else if(i < s.length() - 1 && (getPriority(s.charAt(i)) == 5 && (getPriority(s.charAt(i+1)) == 6 || getPriority(s.charAt(i+1)) == 7) ) ){
//                res += getInteger(s.charAt(i)) + getInteger(s.charAt(i+1));
//                i++;
//            }
        }
        return res;
    }

    public static int getPriority(char ch){
        return switch (ch) {
            case 'M' -> 7;
            case 'D' -> 6;
            case 'C' -> 5;
            case 'L' -> 4;
            case 'X' -> 3;
            case 'V' -> 2;
            case 'I' -> 1;
            default -> 0;
        };
    }

    public static int getInteger(char ch){
        return switch (ch) {
            case 'M' -> 1000;
            case 'D' -> 500;
            case 'C' -> 100;
            case 'L' -> 50;
            case 'X' -> 10;
            case 'V' -> 5;
            case 'I' -> 1;
            default -> 0;
        };
    }
}
