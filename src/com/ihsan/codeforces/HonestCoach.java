package com.ihsan.codeforces;

import java.util.Scanner;

public class HonestCoach {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t > 0){
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = in.nextInt();
            }
            int min = Integer.MAX_VALUE;
            for(int i=0;i<n-1;i++){
                for(int j=i+1;j<n;j++){
                    if(i != j && arr[i] == arr[j]) {
                        min = 0;
                        break;
                    }
                    min = Math.min(min, Math.abs(arr[i] - arr[j]));
                }
                if(min == 0) break;
            }
            System.out.println(min);
            t--;
        }
    }
}
