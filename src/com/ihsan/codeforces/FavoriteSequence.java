package com.ihsan.codeforces;

import java.util.ArrayList;
import java.util.Scanner;

public class FavoriteSequence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        ArrayList<Long> arr = new ArrayList<>();
        while(t > 0){
            int n = in.nextInt();
            long[] a = new long[n];
            for(int i=0;i<n;i++){
                a[i] = in.nextLong();
            }
            int j = 0, k = n - 1;
            for(int i=0;i<n;i++){
                if(i % 2 == 0) arr.add(a[j++]);
                else arr.add(a[k--]);
            }
            for(int i=0;i<n;i++){
                System.out.print(arr.get(i) + " ");
            }
            System.out.println();
            arr.clear();
            t--;
        }
    }
}
