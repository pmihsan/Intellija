package com.ihsan.codeforces;

import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = 0;
        while(n > 0){
            int count = 0;
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            if(a == 1){
                count++;
            }
            if(b == 1){
                count++;
            }
            if(c == 1){
                count++;
            }
            if(count >= 2) {
                ans++;
            }
            n--;
        }
        System.out.println(ans);
    }
}
