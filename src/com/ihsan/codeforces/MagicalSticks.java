package com.ihsan.codeforces;

import java.util.Scanner;

public class MagicalSticks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t > 0){
            int n = in.nextInt();
            if(n % 2 == 0){
                System.out.println(n/2);
            }
            else{
                System.out.println(n/2 + 1);
            }
            t--;
        }
    }
}
