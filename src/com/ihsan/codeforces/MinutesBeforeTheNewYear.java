package com.ihsan.codeforces;

import java.util.Scanner;

public class MinutesBeforeTheNewYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t > 0){
            int h = in.nextInt();
            int m = in.nextInt();
            int min = (60 - m);
            min += ((23 - h) * 60);
            System.out.println(min);
            t--;
        }
    }
}
