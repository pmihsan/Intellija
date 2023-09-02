package com.ihsan.codeforces;

import java.util.Scanner;

public class FollowingDirections {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t > 0){
            int n = in.nextInt();
            String s = in.next();
            boolean f = false;
            int sx = 0, sy = 0;
            for(int i=0;i<n;i++){
                if(s.charAt(i) == 'U') sy++;
                else if(s.charAt(i) == 'D') sy--;
                else if(s.charAt(i) == 'R') sx++;
                else if(s.charAt(i) == 'L') sx--;

                if(sx == 1 && sy == 1) f = true;
            }
            if(f) System.out.println("YES");
            else System.out.println("NO");
            t--;
        }
    }
}
