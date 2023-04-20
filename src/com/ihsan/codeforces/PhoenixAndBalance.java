package com.ihsan.codeforces;

import java.util.Scanner;

public class PhoenixAndBalance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t > 0) {
            int n = in.nextInt();
            int c = 1;
            long last = (long) Math.pow(2, n);
            long sum = 0;
            for (int i = 1; i < (n / 2); i++) {
                last += (long) Math.pow(2, i);
            }
            for (int i = (n / 2); i < n; i++) {
                sum += (long) Math.pow(2, i);
            }
            System.out.println(last - sum);
            t--;
        }
    }
}
