package com.ihsan.codeforces;

import java.util.Scanner;

public class Hulk {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = "";
        for(int i=1;i<=n;i++){
            if(i % 2 != 0) s += "I hate ";
            else s += "I love ";
            if(n != 1 && i != n) s += "that ";
        }
        System.out.println(s + "it");
    }
}
