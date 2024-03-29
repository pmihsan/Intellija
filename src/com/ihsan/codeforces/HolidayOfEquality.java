package com.ihsan.codeforces;

import java.util.Scanner;

public class HolidayOfEquality {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        int max = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i] > max) max = arr[i];
        }
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += (max - arr[i]);
        }
        System.out.println(sum);
    }
}
