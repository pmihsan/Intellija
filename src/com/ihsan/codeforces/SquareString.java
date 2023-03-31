package com.ihsan.codeforces;

import java.util.Scanner;

public class SquareString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t > 0){
            String s = in.next();
            if(s.length() % 2 == 0 && s.substring(0, s.length()/2).equals(s.substring(s.length()/2))){
                    System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            t--;
        }
    }
}
