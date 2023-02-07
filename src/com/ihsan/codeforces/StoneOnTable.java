package com.ihsan.codeforces;

import java.util.Scanner;

public class StoneOnTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c = 0;
        int[] arr = new int[n];
        String s = in.next();
        method2(n,s);
        for(int i=0;i<n;i++){
            if(s.charAt(i) == 'R') arr[i] = 1;
            else if(s.charAt(i) == 'B') arr[i] = 2;
            else arr[i] = 3;
        }
        for(int i=0;i<n-1;i++){
            if(arr[i] == arr[i+1]){
                c++;
            }
        }
        System.out.println(c);
        in.close();
    }

    public static void method2(int n, String s){
        int c = 0;
        for(int i=0;i<n-1;i++){
            if(s.charAt(i) == s.charAt(i+1)){
                c++;
            }
        }
        System.out.println(c);
    }
}
