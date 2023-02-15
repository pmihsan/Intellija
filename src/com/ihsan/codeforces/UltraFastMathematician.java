package com.ihsan.codeforces;

import java.util.Scanner;

public class UltraFastMathematician {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        String res = "";
        for(int i=0;i<s.length();i++){
            res += (s.charAt(i) != t.charAt(i)  ? "1" : "0");
        }
        System.out.println(res);
    }
}
