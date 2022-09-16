package com.ihsan.codeforces;

import java.util.Scanner;

public class BitPP {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = 0;
        int n = in.nextInt();
        while(n > 0){
            String s = in.next();
            if(s.charAt(0) == '+' || s.charAt(s.length() - 1) == '+') x++;
            else x--;
            n--;
        }
        System.out.println(x);
    }
}
