package com.ihsan.codeforces;

import java.util.Scanner;

public class PlusOrMinus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int k=0;k<t;k++){
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            if(a + b == c){
                System.out.println("+");
            }
            else {
                System.out.println("-");
            }
        }
    }
}
