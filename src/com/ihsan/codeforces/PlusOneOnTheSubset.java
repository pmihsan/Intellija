package com.ihsan.codeforces;

import java.util.Scanner;

public class PlusOneOnTheSubset {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t > 0){
            int n = in.nextInt();
            int max = in.nextInt();
            int min = max;
            for(int i=1;i<n;i++){
                int a = in.nextInt();
                if(a > max) max = a;
                if(a < min) min = a;
            }
            System.out.println(max - min);
            t--;
        }
    }
}
