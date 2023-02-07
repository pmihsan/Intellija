package com.ihsan.codeforces;

import java.util.Scanner;

public class AntonAndDanik {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int A = s.length() - s.replaceAll("A", "").length();
        int D = s.length() - s.replaceAll("D", "").length();
        if(A > D){
            System.out.println("Anton");
        }
        else if(A < D){
            System.out.println("Danik");
        }
        else{
            System.out.println("Friendship");
        }
    }
}
