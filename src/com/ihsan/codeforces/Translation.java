package com.ihsan.codeforces;

import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        StringBuilder sb = new StringBuilder(t);
        t = sb.reverse().toString();
        if(s.equals(t)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
