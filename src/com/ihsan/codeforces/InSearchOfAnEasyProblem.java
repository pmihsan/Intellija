package com.ihsan.codeforces;

import java.util.Scanner;

public class InSearchOfAnEasyProblem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while(n > 0){
            if(in.nextInt() == 1) {
                System.out.println("HARD");
                return;
            }
            n--;
        }
        System.out.println("EASY");
    }
}
