package com.ihsan.codeforces;

import java.util.Scanner;

public class Borze {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '.' ){
                t += "0";
            }
            else if(i < s.length() - 1 && s.charAt(i) == '-' && s.charAt(i+1) == '.'){
                t += "1";
                i++;
            }
            else if (i < s.length() - 1 && s.charAt(i) == '-' && s.charAt(i+1) == '-') {
                t += "2";
                i++;
            }
        }
        System.out.println(t);
    }
}
