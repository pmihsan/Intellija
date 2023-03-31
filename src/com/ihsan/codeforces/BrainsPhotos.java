package com.ihsan.codeforces;

import java.util.Scanner;

public class BrainsPhotos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int c = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                char ch = in.next().charAt(0);
                if(ch == 'C' || ch == 'M' || ch == 'Y') c++;
            }
        }
        if(c > 0){
            System.out.println("#Color");
        }
        else{
            System.out.println("#Black&White");
        }
    }
}
