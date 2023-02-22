package com.ihsan.codeforces;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int res = 0;
        int[] home = new int[n];
        int[] guest = new int[n];

        for(int i=0;i<n;i++){
            home[i] = in.nextInt();
            guest[i] = in.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i != j && home[i] == guest[j]) res++;
            }
        }
        System.out.println(res);
    }
}
