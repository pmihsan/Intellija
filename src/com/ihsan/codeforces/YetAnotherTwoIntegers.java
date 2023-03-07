package com.ihsan.codeforces;

import java.util.Scanner;

public class YetAnotherTwoIntegers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t > 0){
            int a = in.nextInt();
            int b = in.nextInt();

            System.out.println((int)Math.ceil((double)Math.abs(b - a) / 10));
            t--;
        }
    }
}
