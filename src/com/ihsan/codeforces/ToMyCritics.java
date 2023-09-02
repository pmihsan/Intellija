package com.ihsan.codeforces;

import java.util.Scanner;

public class ToMyCritics {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while(t > 0){
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            if(a + b >= 10 || b + c >= 10 || a + c >= 10)
                System.out.println("YES");
            else
                System.out.println("NO");
            t--;
        }
    }
}
