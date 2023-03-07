package com.ihsan.codeforces;

import java.util.Scanner;

public class BuyAShovel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int r = in.nextInt();
        int min = 1;
        while(true){
            if((k * min) % 10 == 0 || (k * min) % 10 == r){
                break;
            }
            min++;
        }
        System.out.println(min);
    }
}
