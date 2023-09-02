package com.ihsan.codeforces;

import java.util.Scanner;

public class AtillasFavoriteProblem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t > 0){
            int n = in.nextInt();
            String s = in.next();
            char max = s.charAt(0);
            for(int i=1;i<n;i++){
                if(s.charAt(i) > max) max = s.charAt(i);
            }
            System.out.println(max - 'a' + 1);
            t--;
        }
    }
}
