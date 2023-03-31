package com.ihsan.codeforces;

import java.util.Scanner;

public class GiftsFixing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t > 0){
            int n = in.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i] = in.nextInt();
            }
            int[] b = new int[n];
            for(int i=0;i<n;i++){
                b[i] = in.nextInt();
            }
            int min_candy = a[0];
            int min_org = b[0];
            for(int i=1;i<n;i++){
                if(a[i] < min_candy) min_candy = a[i];
                if(b[i] < min_org) min_org = b[i];
            }
            long moves = 0;
            for(int i=0;i<n;i++){
                if(a[i] > min_candy && b[i] == min_org){
                    moves += a[i] - min_candy;
                }
                else if(a[i] == min_candy && b[i] > min_org){
                    moves += b[i] - min_org;
                }
                else{
                    moves += Math.max(Math.abs(a[i]-min_candy), Math.abs(b[i]-min_org));
                }
            }
            System.out.println(moves);
            t--;
        }
    }
}
