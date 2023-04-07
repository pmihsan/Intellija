package com.ihsan.codeforces;

import java.util.Scanner;

public class AddOddOrSubtractEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t > 0){
            long a = in.nextLong();
            long b = in.nextLong();
            long diff = Math.abs(a-b);
            long min = 0;
            if(a > b){
                if(diff % 2 == 0) min++;
                else min += 2;
            }
            else if(b > a){
                if(diff % 2 != 0) min++;
                else min += 2;
            }
            System.out.println(min);
            t--;
        }
    }
}
