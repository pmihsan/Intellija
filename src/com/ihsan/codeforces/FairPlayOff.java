package com.ihsan.codeforces;

import java.util.Scanner;

public class FairPlayOff {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t > 0){
            int s1 = in.nextInt();
            int s2 = in.nextInt();
            int s3 = in.nextInt();
            int s4 = in.nextInt();
            int max1 = Math.max(s1, s2);
            int min1 = Math.min(s1, s2);
            int max2 = Math.max(s3, s4);
            int min2 = Math.min(s3, s4);
            if(max1 > min2 && max2 > min1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            t--;
        }
    }
}
