package com.ihsan.codeforces;

import java.util.Scanner;

public class EhabAndGcd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t > 0){
            long x = in.nextLong();
            long a = 0, b = 0;
            if(x % 2 == 0){
                a = b = x / 2;
            }
            else {
                a = x - 1;
                b = 1;
            }
            System.out.println(a + " " + b);
            t--;
        }
    }
}
