package com.ihsan.codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class CharArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        String t = in.next();
//        String s = "100";
//        String t = "001";
//        System.out.println(n);
        System.out.println(check(s,t));
    }
    static int check(String s, String t){
        int count = 0;
        char[] ch = s.toCharArray();
        char[] th = t.toCharArray();
//        System.out.println(Arrays.toString(ch));
//        System.out.println(Arrays.toString(th));
        for(int i=0;i<s.length();i++){
            if(ch[i] != th[i] && i < s.length() - 1){
                if(ch[i+1] != th[i+1] && ch[i] != ch[i+1]){
                    char c = ch[i+1];
                    ch[i+1] = ch[i];
                    ch[i] = c;
                    count++;
                }
                else{
                    ch[i] = th[i];
                    count++;
                }
            }
            else{
                if(ch[i] != th[i]){
                    ch[i] = th[i];
                    count++;
                }
            }
        }
        System.out.println(Arrays.toString(ch));
        System.out.println(Arrays.toString(th));
        return count;
    }
}
