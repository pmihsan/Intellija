package com.ihsan.codeforces;

import java.util.Scanner;

public class Magnets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int c = 1;
        char[] arr = new char[n];
        for(int i=0;i<n;i++){
            arr[i] = in.next().charAt(0);
        }
        for (int i = 0; i < n-1; i++) {
            if(arr[i] != arr[i+1]) c++;
        }
        System.out.println(c);
    }
}
