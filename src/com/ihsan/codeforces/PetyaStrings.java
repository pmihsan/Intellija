package com.ihsan.codeforces;

import java.util.Scanner;

public class PetyaStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        if(s.equalsIgnoreCase(t)) System.out.println(0);
        else {
            s = s.toLowerCase();
            t = t.toLowerCase();
            int a = 0, b = 0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i) < t.charAt(i)) a++;
                else if(s.charAt(i) > t.charAt(i)) b++;
            }
            if(a > b) System.out.println(1);
            else System.out.println(-1);
        }
    }
}
