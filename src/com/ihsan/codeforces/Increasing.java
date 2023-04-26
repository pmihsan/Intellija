package com.ihsan.codeforces;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Increasing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t > 0){
            int n = in.nextInt();
            Set<Long> s = new HashSet<>();
            for(int i=0;i<n;i++){
                s.add(in.nextLong());
            }
            if(s.size() == n){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            t--;
        }
    }
}
