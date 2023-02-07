package com.ihsan.codeforces;

import java.util.Scanner;

public class NearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.next();
//        int count = StringUtils.countMatches("engineering", "e");
        int count = n.length() - n.replaceAll("4","").length();
        count += n.length() - n.replaceAll("7","").length();
        if(count == 4 || count == 7){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
    public static void Test(){
    // Can't Process input which is larger (10 ^ 18)
        int n = 7747774;
        int count = 0;
        while(n > 0){
            int last = n % 10;
            System.out.println(last);
            if(last == 4 || last == 7) count++;
            n /= 10;
        }
        System.out.println(count);
        if(count == 4 || count == 7){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
