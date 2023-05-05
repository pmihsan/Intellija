package com.ihsan.codeforces;

import java.util.Scanner;

public class MaximumIncrease {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long s = in.nextLong();
        long c = 1;
        long max = 1;
        long a;
        for(long i=1;i<n;i++){
            a = in.nextLong();
            if(a > s){
                c++;
                max = Math.max(c, max);
            }
            else c = 1;

            s = a;
        }
        System.out.println(max);
    }
}
