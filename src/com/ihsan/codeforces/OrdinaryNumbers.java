package com.ihsan.codeforces;

import java.util.Scanner;

public class OrdinaryNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t > 0) {
            long n = in.nextLong();
            int c = 0;
            if(n % 10 == n){
                c = (int)n;
            }
            else if(n >= 10){
                c = 9;
            }
            long s = 11;
            for(long i=11;i<=n;i+=s){
                if(i % 10 == 9){
                    i += s + 1;
                    s = i;
                    if(s <= n) c++;
                }
                c++;
            }
            System.out.println(c);
            t--;
        }
    }
}
