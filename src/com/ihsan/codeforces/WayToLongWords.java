package com.ihsan.codeforces;

import java.util.ArrayList;
import java.util.Scanner;

public class WayToLongWords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<String> list = new ArrayList<>();
        String ans = "";
        while(n != 0){
            String s = in.next();
            if(s.length() <= 10){
                list.add(s);
                n--;
                continue;
            }
            ans += s.charAt(0);
            ans += "" + (s.length()-2);
            ans += s.charAt(s.length()-1);
//            System.out.println(ans);
            list.add(ans);
            ans = "";
            n--;
        }
        for(String t : list){
            System.out.println(t);
        }
    }
}
