package com.ihsan.codeforces;

import java.util.Scanner;

public class NightAtTheMuseum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        char start = 'a';
        int mov = 0;
        for(int i=0;i<s.length();i++){
            int res = (Math.abs(s.charAt(i) - start));
            if(res > 13) res = 26 - res;
            mov += res;
            start = s.charAt(i);
        }
        System.out.println(mov);
    }
}
