package com.ihsan.codeforces;

import java.util.Scanner;

public class AgainTwentyFive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long a = 5;
        while(n > 0){
            if(n % 2 == 0){
                a = (a * a) % 100;
            }
            else{
                a = (a * 5) % 100;
            }
            n /= 2;
        }
        System.out.println(a);
    }
}
