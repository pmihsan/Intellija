package com.ihsan.codeforces;

import java.util.Scanner;

public class SoldierAndBananas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int n = in.nextInt();
        int w = in.nextInt();
        int sum = 0;
        for(int i=1;i<=w;i++){
            sum += (i * k);
        }
        if(sum <= n){
            System.out.println("0");
        }
        else {
            System.out.println(Math.abs(sum-n));
        }

        in.close();
    }
}
