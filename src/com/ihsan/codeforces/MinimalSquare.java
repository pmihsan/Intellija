package com.ihsan.codeforces;

import java.util.Scanner;

public class MinimalSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t > 0){
            int a = in.nextInt();
            int b = in.nextInt();
            int max;
            if(a > b){
                max = Math.max(a, b * 2);
            }
            else {
                max = Math.max(a * 2, b);
            }
            System.out.println(max * max);
            t--;
        }
    }
}
