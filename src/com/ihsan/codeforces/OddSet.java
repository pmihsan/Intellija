package com.ihsan.codeforces;

import java.util.Scanner;

public class OddSet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t > 0){
            int n = in.nextInt();
            int odd = 0, even = 0;
            for(int i=0;i<2*n;i++){
                int a = in.nextInt();
                if(a % 2 == 0) even++;
                else odd++;
            }
            if(odd == even){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
            t--;
        }
    }
}
