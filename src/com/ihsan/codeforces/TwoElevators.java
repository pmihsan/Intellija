package com.ihsan.codeforces;

import java.util.Scanner;

public class TwoElevators {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t > 0){
            long a = in.nextLong();
            long b = in.nextLong();
            long c = in.nextLong();

            long e1 = a - 1;
            long e2 = Math.abs(b - c) + (c - 1);

            if(e1 < e2) System.out.println("1");
            else if(e2 < e1) System.out.println("2");
            else System.out.println("3");
            t--;
        }
    }
}
