package com.ihsan.codeforces;

import java.util.Scanner;

public class QueueAtSchool {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        String s = in.next();
        char[] a = s.toCharArray();
        while(t > 0){
            for(int i=0;i<n-1;i++)
                if(a[i] == 'B' && a[i+1] == 'G') {
                    swap(a,i,i+1);
                    i++;
                }
            t--;
        }
        System.out.println(new String(a));
    }

    public static void swap(char[] a, int i, int j){
        char ch = a[i];
        a[i] = a[j];
        a[j] = ch;
    }
}
