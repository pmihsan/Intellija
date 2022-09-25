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
            if(s.compareTo(t) == 0) System.out.println(0);
            else if (s.compareTo(t) < 0 ) System.out.println(-1);
            else System.out.println(1);
        }
    }
}
