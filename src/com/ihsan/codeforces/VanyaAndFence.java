package com.ihsan.codeforces;

import java.util.Scanner;

public class VanyaAndFence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int h = in.nextInt();
        int width = n;
        for(int i=0;i<n;i++){
            int a = in.nextInt();
            if(a > h){
                width += (a % h == 0) ? (a / h) - 1 : (a / h);
            }
        }
        System.out.println(width);
    }
}
