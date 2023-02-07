package com.ihsan.codeforces;

import java.util.Scanner;

public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int c = 0;
        int[] arr = new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i) - 'a']++;
        }
        for(int i=0;i<26;i++){
            if(arr[i] >= 1){
                c++;
            }
        }
        if(c % 2 != 0)
            System.out.println("IGNORE HIM!");
        else
            System.out.println("CHAT WITH HER!");
        in.close();
    }
}
