package com.ihsan.codeforces;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t > 0){
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            if(a + b == c || b + c == a || c + a == b){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            t--;
        }
    }
}
