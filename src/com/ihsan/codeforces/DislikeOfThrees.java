package com.ihsan.codeforces;

import java.util.Scanner;

public class DislikeOfThrees {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=0;i<t;i++){
            int n = in.nextInt();
            int s = 0, ans = 1;
            while(s < n){
                if(ans % 10 != 3 && ans % 3 != 0){
                    s++;
                }
                ans++;
            }
            System.out.println(ans-1);
        }
    }
}
