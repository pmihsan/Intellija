package com.ihsan.codeforces;

import java.util.Scanner;

public class MishkaAndGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = 0, c = 0;
        for(int i=0;i<n;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            if(a > b) m++;
            else if(b > a) c++;
        }
        if(m > c){
            System.out.println("Mishka");
        }
        else if(c > m){
            System.out.println("Chris");
        }
        else{
            System.out.println("Friendship is magic!^^");
        }
    }
}
