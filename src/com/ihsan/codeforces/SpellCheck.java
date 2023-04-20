package com.ihsan.codeforces;

import java.util.Scanner;

public class SpellCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t > 0){
            int n = in.nextInt();
            String s = in.next();
            if(s.length() == 5 && s.contains("T") && s.contains("i") && s.contains("m") && s.contains("u") && s.contains("r"))
                System.out.println("YES");
            else System.out.println("NO");
            t--;
        }
    }
}
