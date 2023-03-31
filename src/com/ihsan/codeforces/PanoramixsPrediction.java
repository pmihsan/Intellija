package com.ihsan.codeforces;

import java.util.Scanner;

public class PanoramixsPrediction {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        for (int i = n + 1; i < m; i++) {
            if (isPrime(i)) {
                System.out.println("NO");
                return;
            }
        }
        if(isPrime(m)){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
    public static boolean isPrime(int n){
        int c = 2;
        while(c * c <= n){
            if(n % c == 0) return false;
            c++;
        }
        return true;
    }
}
