package com.ihsan.codeforces;

import java.util.Scanner;

public class CasimirStringSolitaire {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t > 0){
            String s = in.next();
            int a = 0, b = 0, c = 0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i) == 'A') a++;
                else if(s.charAt(i) == 'B') b++;
                else c++;
            }
            int m1 = Math.min(a, b);
            a -= m1;
            b -= m1;
            int m2 = Math.min(b, c);
            b -= m2;
            c -= m2;
            if(a == 0 && b == 0 && c == 0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            t--;
        }
    }
}
