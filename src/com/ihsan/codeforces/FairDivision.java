package com.ihsan.codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class FairDivision {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t > 0){
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = in.nextInt();
            }
            Arrays.sort(arr);
            int a = 0, b = 0;
            int i = n - 1;
            while(i > 0){
                a += arr[i--];
                b += arr[i--];
            }
            if(i == 0){
                if(a < b) a += arr[0];
                else b += arr[0];
            }
            if(a == b){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            t--;
        }
    }
}
