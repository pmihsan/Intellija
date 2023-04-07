package com.ihsan.codeforces;

import java.util.Scanner;

public class FafaAndHisCompany {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int res = 0;
        int t = 1;
        while(t <= n/2){
            int sep = (n - t);
            if(sep % t == 0) res++;
            t++;
        }
        System.out.println(res);
    }
}
