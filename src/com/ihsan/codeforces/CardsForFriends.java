package com.ihsan.codeforces;

import java.util.Scanner;

public class CardsForFriends {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t > 0){
            long w = in.nextLong();
            long h = in.nextLong();
            long n = in.nextLong();
            long c = 1;
            while(w % 2 == 0){
                w /= 2;
                c *= 2;
            }
            while(h % 2 == 0){
                h /= 2;
                c *= 2;
            }
            if(c >= n){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            t--;
        }
    }
}
