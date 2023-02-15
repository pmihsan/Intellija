package com.ihsan.codeforces;

import java.util.Scanner;

public class IWannaBeTheGuy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int level, f = 0;
        int[] a = new int[n];
        int p = in.nextInt();
        for(int i=0;i<p;i++){
            level = in.nextInt();
            a[level-1]++;
        }
        int q = in.nextInt();
        for(int i=0;i<q;i++){
            level = in.nextInt();
            a[level-1]++;
        }
        for(int i=0;i<n;i++){
            if(a[i] == 0) {
                f = 1;
                break;
            }
        }
        if(f == 0) System.out.println("I become the guy.");
        else System.out.println("Oh, my keyboard!");
    }
}
