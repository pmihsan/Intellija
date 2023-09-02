package com.ihsan.codeforces;

import java.util.Scanner;

public class LoveStory {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while(t > 0){
            String s = "codeforces";
            String p = in.next();

            int c = 0;
            for(int i=0;i<10;i++){
                if(s.charAt(i) != p.charAt(i)) c++;
            }
            System.out.println(c);
            t--;
        }
    }
}
