package com.ihsan.codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class TwoArraysAndSwaps {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t > 0){
            int n = in.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            int k = in.nextInt();
            for(int i=0;i<n;i++){
                a[i] = in.nextInt();
            }
            for(int i=0;i<n;i++){
                b[i] = in.nextInt();
            }

            Arrays.sort(a);
            Arrays.sort(b);

            int sum = 0;
            int last = n - 1;
            for(int i=0;i<n;i++){
                if(k > 0 && b[last] > a[i]) {
                    sum += b[last--];
                    k--;
                }
                else{
                    sum += a[i];
                }
            }
            System.out.println(sum);
            t--;
        }
    }
}
