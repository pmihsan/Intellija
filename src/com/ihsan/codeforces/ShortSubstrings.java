package com.ihsan.codeforces;

import java.util.Scanner;

public class ShortSubstrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t > 0){
            String s = in.next();
            String r = "";
            for(int i=0;i<s.length();i++){
                if(i % 2 == 0){
                    r += s.charAt(i);
                }
            }
            if(s.length() % 2 == 0) r += s.charAt(s.length()-1);
            System.out.println(r);
            t--;
        }
    }
}
