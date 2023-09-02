package com.ihsan.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Subsequences {
    public static void main(String[] args) {
        // Bit Manipulation
        System.out.println(generateSubsequences("abc"));
        System.out.println(generateSubsequences("wzg"));

        System.out.println();

        // Recursive
        System.out.println(subsequences("abc"));
        System.out.println(subsequences("wzg"));
    }

    public static List<String> subsequences(String s){
        List<String> list = new ArrayList<>();
        solve(0, s, "", list);
        Collections.sort(list);
        return list;
    }

    public static void solve(int i, String p, String up, List<String> list){
        if(i == p.length()){
            list.add(up);
            return;
        }

        solve(i+1, p, up + p.charAt(i), list);
        solve(i+1, p, up, list);
    }

    public static List<String> generateSubsequences(String s) {
        // Write your code here
        int n = s.length();
        int pow = (1 << n);

        List<String> ans = new ArrayList<>();

        for(int num = 0;num < pow;num++){
            StringBuilder res = new StringBuilder();
            for(int i=0;i<n;i++){
                if((num & (1 << i)) != 0){
                    res.append(s.charAt(i));
                }
            }
            if(res.length() > 0){
                ans.add(res.toString());
            }
        }
        ans.add("");
        Collections.sort(ans);
        return ans;
    }
}
