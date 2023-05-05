package com.ihsan.codeforces;

import java.util.Scanner;

public class PerfectPermutation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n % 2 != 0){
            System.out.println("-1");
        }
        else{
            int e = 2;
            int o = 1;
            for(int i=0;i<n;i+=2){
                System.out.print(e + " " + o + " ");
                e += 2;
                o += 2;
            }
            System.out.println();
        }
    }
}
