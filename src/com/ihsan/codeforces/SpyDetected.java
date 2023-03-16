package com.ihsan.codeforces;

import java.util.HashMap;
import java.util.Scanner;

public class SpyDetected {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t > 0){
            int n = in.nextInt();
            int[] arr = new int[n];
            int[] count = new int[100];
            for(int i=0;i<n;i++){
                arr[i] = in.nextInt();
                count[arr[i] - 1]++;
            }
            int ans = 0;
            for(int i=0;i<100;i++){
                if(count[i] == 1){
                    ans = i+1;
                }
            }
            for(int i=0;i<n;i++){
                if(arr[i] == ans){
                    System.out.println(i+1);
                }
            }
            t--;
        }
    }
}
