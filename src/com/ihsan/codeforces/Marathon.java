package com.ihsan.codeforces;

import java.util.Scanner;

public class Marathon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int d = in.nextInt();
            int max = 0;
            if(a < b) max++;
            if(a < c) max++;
            if(a < d) max++;
            System.out.println(max);
        }
    }
}
