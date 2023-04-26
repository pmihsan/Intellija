package com.ihsan.codeforces;

import java.util.Scanner;

public class ArrayWithOddSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t > 0){
            int n = in.nextInt();
            int sum = 0;
            int odd = 0,even = 0;
            for(int i=0;i<n;i++){
                int a = in.nextInt();
                if(a % 2 == 0) even++;
                else odd++;
                sum += a;
            }
            if(sum % 2 != 0){
                System.out.println("YES");
            }
            else if(odd > 0 && even > 0){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
            t--;
        }
    }
}
