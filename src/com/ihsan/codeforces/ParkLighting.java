package com.ihsan.codeforces;

import java.util.Scanner;

public class ParkLighting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t > 0){
            int n = in.nextInt();
            int m = in.nextInt();
            int c = 0;
            for(int i=1;i<=m;i++){
                if(m - 2 * i < 0) break;
                c++;
            }
            int res = n * c;
            if(m % 2 != 0){
                res += (n % 2 == 0) ? (n / 2) : (n / 2) + 1;
            }
            System.out.println(res);
            t--;
        }
    }
    public static void printB(int n, int m){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print("| ");
            }
            System.out.println("|");
        }
    }
}
