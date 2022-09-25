package com.ihsan.codeforces;

import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        StringBuilder t = new StringBuilder(s);
        t.replace(0,1, Character.toUpperCase(t.charAt(0))+"");
        System.out.println(t);
        in.close();
    }
}
