package com.ihsan.codeforces;

import java.util.Scanner;

public class APlusB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t > 0){
            String s = in.next();
            int res = (s.charAt(0) - '0') + (s.charAt(2) - '0');
            System.out.println(res);
            t--;
        }
    }
}
