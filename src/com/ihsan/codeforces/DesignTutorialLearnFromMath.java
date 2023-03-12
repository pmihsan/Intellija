package com.ihsan.codeforces;

import java.util.Scanner;

public class DesignTutorialLearnFromMath {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int s = 6;
        while(s < n){
            int a = s;
            int b = n - s;
            if(!isPrime(a) && !isPrime(b)){
                System.out.println(a + " " + b);
                break;
            }
            s++;
        }
    }
    
    public static boolean isPrime(int num){
        int c = 2;
        while(c * c <= num){
            if(num % c == 0) return false;
            c++;
        }
        return true;
    }
}
