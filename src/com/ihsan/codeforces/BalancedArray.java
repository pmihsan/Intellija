package com.ihsan.codeforces;

import java.util.Scanner;

public class BalancedArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t > 0) {
            int n = in.nextInt();
            if((n / 2) % 2 != 0){
                System.out.println("NO");
                t--;
                continue;
            }
            int[] arr = new int[n];
            int s = 0;
            int s1 = 0;
            int odd = 1;
            for (int i = 0; i < n - 1; i++) {
                if(i < n / 2) {
                    arr[i] = (i + 1) * 2;
                    s += arr[i];
                }
                else{
                    arr[i] = odd;
                    odd += 2;
                    s1 += arr[i];
                }
            }
            arr[n-1] = s - s1;
            System.out.println("YES");
            for(int i=0;i<n;i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            t--;
        }
    }
}
