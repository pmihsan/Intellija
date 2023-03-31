package com.ihsan.codeforces;

import java.util.Scanner;

public class VanyaAndCubes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int s = 1;
        int cubes = 1;
        int l = 0;
        while(n >= s){
            n -= s;
           cubes++;
            s += cubes;
            l++;
        }
        System.out.println(l);
    }
}
