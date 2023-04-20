package com.ihsan.codeforces;

import java.util.Scanner;

public class EqualCandies {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t > 0){
            int n = in.nextInt();
            long[] arr = new long[n];
            arr[0] = in.nextLong();
            long min = arr[0];

            for(int i=1;i<n;i++){
                arr[i] = in.nextLong();
                if(arr[i] < min) min = arr[i];
            }
            long sum = 0;
            for(int i=0;i<n;i++){
                if(arr[i] != min) sum += (arr[i] - min);
            }
            System.out.println(sum);
            t--;
        }
    }
}
