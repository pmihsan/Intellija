package com.ihsan.codeforces;

import java.util.Scanner;

public class BoringApartments {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t > 0){
            String s = in.next();
            int n = s.charAt(0) - '0';
            int l = s.length();
            int res = (n - 1) * 10;
            for(int i=1;i<=l;i++){
                res += i;
            }
            System.out.println(res);
            t--;
        }
    }
}
