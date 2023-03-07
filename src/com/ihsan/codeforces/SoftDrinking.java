package com.ihsan.codeforces;

import java.util.Scanner;

public class SoftDrinking {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int l = in.nextInt();

        int c = in.nextInt();
        int d = in.nextInt();
        int p = in.nextInt();

        int nl = in.nextInt();
        int np = in.nextInt();

        int drink = (k * l) / n;
        int lime = (c * d) / n;
        int salt = p / n;
        int toast = 0;
        while(drink >= nl && lime >= 1 && salt >= np){
            drink -= nl;
            lime -= 1;
            salt -= np;
            toast++;
        }
        System.out.println(toast);
    }
}
