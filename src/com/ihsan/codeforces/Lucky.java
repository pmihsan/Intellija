package com.ihsan.codeforces;

import java.util.Scanner;

public class Lucky {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t > 0){
            String s = in.next();
            int a = 0, b = 0;
            for(int i=0;i<6;i++){
                if(i < 3){
                    a += s.charAt(i) - '0';
                }
                else{
                    b += s.charAt(i) - '0';
                }
            }
            if(a == b){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            t--;
        }
    }
}
