package com.ihsan.codeforces;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t > 0){
            int n = in.nextInt();
            if(n >= 1900){
                System.out.println("Division 1");
            }
            else if(n >= 1600 && n <= 1899){
                System.out.println("Division 2");
            }
            else if(n >= 1400 && n <= 1599){
                System.out.println("Division 3");
            }
            else if(n <= 1399){
                System.out.println("Division 4");
            }
            t--;
        }
    }
}
