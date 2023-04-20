package com.ihsan.codeforces;

import java.util.Scanner;

public class MostUnstableArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=0;i<t;i++){
            long n = in.nextLong();
            long m = in.nextLong();
            if(n == 1) System.out.println(0);
            else if(n == 2) System.out.println(m);
            else System.out.println(2*m);
        }
    }
}
