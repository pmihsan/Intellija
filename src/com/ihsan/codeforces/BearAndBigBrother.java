package com.ihsan.codeforces;

import java.util.Scanner;

public class BearAndBigBrother {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b;
        a = in.nextInt();
        b = in.nextInt();
        int c = 0;
        while(a <= b){
            a *= 3;
            b *= 2;
            c++;
        }
        System.out.println(c);
        in.close();
    }
}
