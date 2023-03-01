package com.ihsan.codeforces;

import java.util.Scanner;

public class ILoveUsername {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = in.nextInt();
        int min = a, max = a, c = 0;
        n--;
        while(n > 0){
            a = in.nextInt();
            if(a < min){
                min = a;
                c++;
            }
            if(a > max){
                max = a;
                c++;
            }
            n--;
        }
        System.out.println(c);
    }
}
