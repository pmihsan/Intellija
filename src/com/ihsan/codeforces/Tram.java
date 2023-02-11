package com.ihsan.codeforces;

import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int curr_entry = 0;
        int max = 0;
        while(n > 0){
            int a = in.nextInt();
            int b = in.nextInt();
            curr_entry += b;
            curr_entry -= a;
            if(curr_entry > max) max = curr_entry;
            n--;
        }
        System.out.println(max);
    }
}
