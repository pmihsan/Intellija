package com.ihsan.codeforces;

import java.util.HashMap;
import java.util.Scanner;

public class ICPCBalloons {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i=0;i<t;i++){
            int n = in.nextInt();
            String s = in.next();
            int res = 0;
            for(int j=0;j<s.length();j++){
                if(hm.containsKey(s.charAt(j))) res++;
                else{
                    hm.put(s.charAt(j), 1);
                    res += 2;
                }
            }
            System.out.println(res);
            hm.clear();
        }
    }
}
