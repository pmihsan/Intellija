package com.ihsan.codeforces;

import java.util.Scanner;

public class CollectingCoins {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t > 0){
            long a = in.nextLong();
            long b = in.nextLong();
            long c = in.nextLong();
            long n = in.nextLong();
            long temp = 0;
            long max = Math.max(a, Math.max(b, c));
            if(max-a > 0){
                temp = max - a;
                a += temp;
                n -= temp;
            }
            if(max-b > 0){
                temp = max - b;
                b += temp;
                n -= temp;
            }
            if(max-c > 0){
                temp = max - c;
                c += temp;
                n -= temp;
            }
            if(n > 0 && n % 3 == 0 || n == 0 && a == b && a == c){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            t--;
        }
    }
}
