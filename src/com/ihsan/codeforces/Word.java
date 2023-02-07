package com.ihsan.codeforces;

import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int up_c = 0, lo_c = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) >= 65 && s.charAt(i) <= 90) up_c++;
            if(s.charAt(i) >= 97 && s.charAt(i) <= 122) lo_c++;
        }
        if(up_c > lo_c){
            System.out.println(s.toUpperCase());
        }
        else{
            System.out.println(s.toLowerCase());
        }
    }
}
