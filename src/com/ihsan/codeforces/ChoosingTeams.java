package com.ihsan.codeforces;

import java.util.Scanner;

public class ChoosingTeams {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        int[] arr = new int[n];
        int c = 0;
        int max = 0;
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
            if(arr[i] + k <= 5){
                c++;
            }
            if(c == 3){
                max++;
                c = 0;
            }
        }
        System.out.println(max);
    }
}
