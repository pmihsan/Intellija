package com.ihsan.codeforces;

import java.util.Scanner;

public class MediumNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t > 0){
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            if(a > b && a > c){
                a = 0;
            }
            else if(b > a && b > c){
                b = 0;
            }
            else{
                c = 0;
            }
            System.out.println(Math.max(a, Math.max(b, c)));
            t--;
        }
    }
}
