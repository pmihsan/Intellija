package com.ihsan.codeforces;

import java.util.Scanner;

public class BlackSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[4];
        for(int i=0;i<4;i++){
            a[i] = in.nextInt();
        }
        String s = in.next();
        int cal = 0;
        for(int i=0;i<s.length();i++){
            cal += a[(s.charAt(i) - '0') - 1];
        }
        System.out.println(cal);
    }
}
