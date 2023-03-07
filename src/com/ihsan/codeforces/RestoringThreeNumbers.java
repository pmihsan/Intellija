package com.ihsan.codeforces;

import java.util.Scanner;

public class RestoringThreeNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int max = Math.max(a, Math.max(b, Math.max(c, d)));
        int[] arr = new int[3];
        int i = 0;
        if(max - a > 0){
            arr[i++] = max - a;
        }
        if(max - b > 0){
            arr[i++] = max - b;
        }
        if(max - c > 0){
            arr[i++] = max - c;
        }
        if(max - d > 0){
            arr[i++] = max - d;
        }
        System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
    }
}
