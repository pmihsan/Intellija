package com.ihsan.codeforces;

import java.util.Scanner;

public class DivisibilityProblem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t > 0){
            int a,b;
            a = in.nextInt();
            b = in.nextInt();
            if(a % b == 0) System.out.println("0");
            else System.out.println((a/b + 1) * b - a);
            t--;
        }
    }
}
