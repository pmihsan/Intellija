package com.ihsan.codeforces;

import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[26];
        String s = in.next().toLowerCase();
        for(int i=0;i<n;i++){
            arr[s.charAt(i) - 'a']++;
        }
        for(int i=0;i<26;i++){
            if(arr[i] == 0){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
