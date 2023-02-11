package com.ihsan.codeforces;

import java.util.Scanner;

public class GeorgeAndAccommodation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c = 0;
        while(n > 0){
            int p = in.nextInt();
            int q = in.nextInt();
            if(q - p >= 2) c++;
            n--;
        }
        System.out.println(c);
    }
}
