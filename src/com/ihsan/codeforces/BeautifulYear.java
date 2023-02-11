package com.ihsan.codeforces;

import java.util.Scanner;

public class BeautifulYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int y = in.nextInt();
        while(true){
            y++;
            int[] a = new int[10];
            int t = y;
            while(t > 0){
                a[t%10]++;
                t /= 10;
            }
            int flag = 1;
            for(int i=0;i<10;i++){
                if(a[i] > 1){
                    flag = 0;
                    continue;
                }
            }
            if(flag == 0) continue;
            break;
        }
        System.out.println(y);
    }
}
