package com.ihsan.codeforces;

import java.util.Scanner;

public class MahmoudAndEhabAndTheEvenOddGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        if(n % 2 == 0){
            System.out.println("Mahmoud");
        }
        else{
            System.out.println("Ehab");
        }
    }
}
