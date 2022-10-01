package com.ihsan.practice;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 34},
                {4, 5, 6, 35},
                {7, 8, 9, 36},
                {10, 11, 12, 13}
        };
        printSpirally(arr);
    }
    public static void printSpirally(int[][] arr){
        int l = 0;
        int r = arr.length - 1;
        int t = 0;
        int b = arr.length - 1;
        int dir = 0;

        while(l <= r && t <= b){
            if(dir == 0){
                for(int i=l;i<=r;i++){
                    System.out.print(arr[t][i] + " ");
                }
                t++;
            }
            else if(dir == 1){
                for(int i=t;i<=b;i++){
                    System.out.print(arr[i][r] + " ");
                }
                r--;
            }
            else if(dir == 2){
                for(int i=r;i>=l;i--){
                    System.out.print(arr[b][i] + " ");
                }
                b--;
            }
            else if(dir == 3){
                for(int i=b;i>=t;i--){
                    System.out.print(arr[i][l] + " ");
                }
                l++;
            }
            dir = (dir + 1) % 4;
        }
        System.out.println();
    }
}
