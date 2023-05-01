package com.ihsan.codeforces;

import java.util.Scanner;

public class MaximumInTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] mat = new int[n][n];
        for(int i=0;i<n;i++){
            mat[i][0] = 1;
            mat[0][i] = 1;
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<n;j++){
                mat[i][j] = mat[i-1][j] + mat[i][j-1];
            }
        }
        System.out.println(mat[n-1][n-1]);
    }
}
