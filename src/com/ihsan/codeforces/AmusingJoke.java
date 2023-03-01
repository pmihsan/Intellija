package com.ihsan.codeforces;

import java.util.HashMap;
import java.util.Scanner;

public class AmusingJoke {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        String p = in.next();
        if(p.length() > s.length() + t.length()){
            System.out.println("NO");
            return;
        }
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
            }
            else{
                hm.put(s.charAt(i), 0);
            }
        }
        for(int i=0;i<t.length();i++){
            if(hm.containsKey(t.charAt(i))){
                hm.put(t.charAt(i),hm.get(t.charAt(i))+1);
            }
            else{
                hm.put(t.charAt(i), 0);
            }
        }
        for(int i=0;i<p.length();i++){
            if(hm.containsKey(p.charAt(i)) && hm.get(p.charAt(i)) == 0){
                hm.remove(p.charAt(i));
            }
            else if(hm.containsKey(p.charAt(i))){
                hm.put(p.charAt(i), hm.get(p.charAt(i))-1);
            }
        }
        if(hm.size() == 0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
