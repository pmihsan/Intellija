package com.ihsan.codeforces;

import java.util.HashMap;
import java.util.Scanner;

public class DoNotBeDistracted {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=0;i<t;i++){
            int n = in.nextInt();
            String s = in.next();
            int flag = 0;
            HashMap<Character, Integer> hm = new HashMap<>();

            for(int j=0;j<s.length();j++){
                if(!hm.containsKey(s.charAt(j))) {
                    hm.put(s.charAt(j), j);
                }
                else if(j - hm.get(s.charAt(j)) != 1){
                    flag = 1;
                    break;
                }
                else{
                    hm.put(s.charAt(j), j);
                }
            }
            if(flag == 1){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
    }
}
