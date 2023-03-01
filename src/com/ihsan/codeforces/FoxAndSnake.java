package com.ihsan.codeforces;

import java.util.Scanner;

public class FoxAndSnake {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int f = 0;
        for(int i=0;i<n;i++){
            int c = 0;
            for(int j=0;j<m;j++){
                if(i % 2 == 0){
                    System.out.print("#");
                }
                else if (j == m - 1 && f == 0 && c == 0) {
                        System.out.print("#");
                        f = 1; c = 1;
                }
                else if(j == 0 && f == 1 && c == 0) {
                    System.out.print("#");
                    f = 0; c = 1;
                }
                else{
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}
