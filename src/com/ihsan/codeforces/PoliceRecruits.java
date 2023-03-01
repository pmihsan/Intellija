package com.ihsan.codeforces;

import java.util.Scanner;

public class PoliceRecruits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = 0;
        int un = 0;
        while(n > 0){
            int crime_det = in.nextInt();
            if(crime_det == -1 && p == 0){
                un++;
            }
            else if(crime_det == -1 && p > 0){
                p--;
            }
            else if(crime_det > 0){
                p += crime_det;
            }
            n--;
        }
        System.out.println(un);
    }
}
