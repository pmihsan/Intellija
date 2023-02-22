package com.ihsan.codeforces;

import java.util.Scanner;

public class AntonAndLetters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();
        int[] arr = new int[26];
        for(int i=0;i<s.length();i++) {
            if (s.charAt(i) - '0' >= 49 && s.charAt(i) - '0' <= 74)
                arr[s.charAt(i) - 'a']++;
        }
        int c = 0;
        for (int i = 0; i < 26; i++) {
            if(arr[i] > 0) c++;
        }
        System.out.println(c);
    }
}
