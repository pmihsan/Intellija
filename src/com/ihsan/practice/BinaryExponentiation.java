package com.ihsan.practice;

import java.util.Scanner;

public class BinaryExponentiation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double base = in.nextDouble();
        int power = in.nextInt();
        System.out.println(BinExpo(base,power));
    }

    static double BinExpo(double base, int power) {
        if(base == 0 || (power == -2147483648 && base > 1)){
            return 0;
        }
        if(power == 1){
            return base;
        }
        if(power == 0 || base == 1){
            return 1;
        }
        int flag = 0;
        if(power < 0){
            flag = 1;
            power = power * -1;
        }
        double ans = 1;
        while(power >= 1){
            if(power % 2 == 0){
                base = base * base;
                power /= 2;
            }
            else{
                ans *= base;
                power--;
            }
        }
        if(flag == 1) {
            return 1 / ans;
        }
        return ans;
    }
}
