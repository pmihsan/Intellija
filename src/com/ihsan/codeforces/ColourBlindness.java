package com.ihsan.codeforces;

import java.util.Scanner;

public class ColourBlindness {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t > 0){
            int n = in.nextInt();
            String p = in.next();
            String q = in.next();
            int c = 0;
            for(int i=0;i<n;i++){
                if(p.charAt(i) == 'R' && q.charAt(i) != 'R'){
                    break;
                }
                else if(p.charAt(i) == 'G' && q.charAt(i) == 'R'){
                    break;
                }
                else if(p.charAt(i) == 'B' && q.charAt(i) == 'R'){
                    break;
                }
                else {
                    c++;
                }
            }
            if(c == n){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            t--;
        }
    }
}
