package com.ihsan.codeforces;

import java.util.Scanner;

public class NewYearAndHurry {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int hrs = 240 - k;
        int c = 0;
        for(int i=1;i<=n;i++){
            if(5*i <= hrs){
                c++;
                hrs -= 5*i;
            }
        }
        System.out.println(c);
    }
}
