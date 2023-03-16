package com.ihsan.codeforces;

import java.util.Scanner;

public class SerejaAndDima {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        int s = 0;
        int d = 0;
        int i = 0, j = n - 1;
        int flag = 0;
        while(i < j){
            int max = Math.max(arr[i] , arr[j]);
            if(max == arr[i]) i++;
            else j--;
            if(flag == 0){
                s += max;
                flag = 1;
            }
            else{
                d += max;
                flag = 0;
            }
        }
        if(i == j && flag == 0){
            s += arr[i];
        }
        else{
            d += arr[i];
        }
        System.out.println(s + " " + d);
    }
}
