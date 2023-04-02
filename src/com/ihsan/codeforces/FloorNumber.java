package com.ihsan.codeforces;

import java.util.Scanner;

public class FloorNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t > 0){
            int n = in.nextInt();
            int x = in.nextInt();
            if(n == 1 || n == 2){
                System.out.println(1);
            }
            else{
                int v = 3;
                int f = 2;
                while(!(n >= v && n < v+x)){
                    v = v + x;
                    f++;
                }
                System.out.println(f);
            }
            t--;
        }
    }
}
