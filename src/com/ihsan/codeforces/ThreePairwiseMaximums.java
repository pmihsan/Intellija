package com.ihsan.codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class ThreePairwiseMaximums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t > 0){
            long[] arr = new long[3];
            arr[0] = in.nextLong();
            arr[1] = in.nextLong();
            arr[2] = in.nextLong();
            Arrays.sort(arr);
            if(arr[1] == arr[2]){
                System.out.println("YES");
                System.out.println(arr[0] + " " + arr[0] + " " + arr[2]);
            }
            else{
                System.out.println("NO");
            }
            t--;
        }
    }
}
