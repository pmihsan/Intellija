package com.ihsan.codeforces;

import java.util.Scanner;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int c1 = 0, c2 = 0, c3 = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '1') c1++;
            else if (s.charAt(i) == '2') c2++;
            else if (s.charAt(i) == '3') c3++;
        }
        StringBuilder t = new StringBuilder();
        for(int i=0;i<(c1+c2+c3);i++){
            if(i < c1) t.append("1+");
            else if (i < c1+c2) t.append("2+");
            else t.append("3+");
        }
        System.out.println(t.substring(0,t.length()-1));
        in.close();
    }
}
