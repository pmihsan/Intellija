package com.ihsan.codeforces;

import java.util.Scanner;

public class CalculatingFunction {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long d = in.nextLong();
        if(d % 2 == 0) System.out.println(d/2);
        else System.out.println(-1 * (d/2 + 1));
    }
}
