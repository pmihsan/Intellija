package com.ihsan.codeforces;

import java.util.Scanner;

public class Elephant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int res = 0;
        while(n > 0){
            if(n >= 5){
                n -= 5;
            }
            else if(n >= 4){
                n -= 4;
            }
            else if(n >= 3){
                n -= 3;
            }
            else if(n >= 2){
                n -= 2;
            }
            else if(n >= 1){
                n -= 1;
            }
            res++;
        }
        System.out.println(res);
    }
}
