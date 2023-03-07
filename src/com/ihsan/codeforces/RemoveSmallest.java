package com.ihsan.codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveSmallest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t > 0){
            int n = in.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i] = in.nextInt();
            }
            Arrays.sort(a);
            for(int i=1;i<n;i++){
                    if (Math.abs(a[i] - a[i-1]) <= 1) {
                        if (a[i] < a[i-1]) {
                            a[i] = -1;
                        } else {
                            a[i-1] = -1;
                        }
                   }
            }
            int c = 0;
            for(int i=0;i<n;i++){
                if(a[i] > -1){
                    c++;
                }
            }
            if(c == 1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            t--;
        }
    }
}
