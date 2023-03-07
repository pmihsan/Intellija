package com.ihsan.codeforces;

import java.util.Scanner;

public class SumOfRoundNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t > 0){
            int n = in.nextInt();
            int c = 0, temp = n;
            while(temp > 0){
                if(temp % 10 > 0) c++;
                temp /= 10;
            }
            if(c == 1){
                System.out.println(c);
                System.out.println(n);
                t--;
                continue;
            }
            int i = 1;
            System.out.println(c + " ");;
            while(n > 0){
                if(n % 10 > 0){
                    System.out.print((n % 10) * i + " ");
                }
                n /= 10;
                i *= 10;
            }
            System.out.println();
            t--;
        }
    }
}
