package com.ihsan.codeforces;

import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r = 0, c = 0;
        int res = 0;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                int n = in.nextInt();
                if(n == 1){
                    r = i;
                    c = j;
                }
            }
        }
        res = Math.abs(r - 3) + Math.abs(c - 3);
        System.out.println(res);
    }
}
