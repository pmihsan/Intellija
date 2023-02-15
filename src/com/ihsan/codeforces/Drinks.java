package com.ihsan.codeforces;

import java.util.Scanner;

public class Drinks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double sum = 0;
        for(int i=0;i<n;i++){
            double s = in.nextDouble();
            sum += s;
        }
        System.out.printf("%.12f",sum/n);
    }
}
