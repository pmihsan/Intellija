package com.ihsan.codeforces;

import java.util.Scanner;

public class RequiredRemainder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t  = in.nextInt();
        for(int i=0;i<t;i++){
            int x = in.nextInt();
            int y = in.nextInt();
            int n = in.nextInt();

            int q = n / x;
            while(true){
                int k = ((q * x) + y);
                if(k <= n && k % x == y){
                    System.out.println(k);
                    break;
                }
                q--;
            }
        }
    }
}
