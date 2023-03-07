package com.ihsan.codeforces;

import java.util.Scanner;

public class VasyaTheHipster {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        int min = Math.min(a, b);
        int res = (a+b) - 2 * min;
        System.out.println(min + " " + (res/2));
    }
}
