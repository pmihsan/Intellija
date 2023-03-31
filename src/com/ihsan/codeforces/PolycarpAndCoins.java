package com.ihsan.codeforces;

import java.util.Scanner;

public class PolycarpAndCoins {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t > 0){
            int n = in.nextInt();
            int c1 = 0, c2 = 0;
            c1 = c2 = n / 3;
            if(n % 3 == 1) c1++;
            if(n % 3 == 2) c2++;
            System.out.println(c1 + " " + c2);
            t--;
        }
    }
}
