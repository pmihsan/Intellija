package com.ihsan.codeforces;

import java.util.Scanner;

public class YesOrYes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=0;i<t;i++) {
            String s = in.next();
            if(s.equalsIgnoreCase("YES")){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
