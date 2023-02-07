package com.ihsan.codeforces;

import java.util.Scanner;

public class WrongSubtraction {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int k = in.nextInt();
        while(k > 0){
            int temp = num % 10;
            if(temp == 0){
                num /= 10;
                k--;
                continue;
            }
            num--;
            k--;
        }
        System.out.println(num);
    }
}
