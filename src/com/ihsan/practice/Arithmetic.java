package com.ihsan.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        MathClass mc = new MathClass(n);

        for(int i=0;i<mc.n;i++){
            mc.arr[i] = in.nextInt();
        }
        System.out.println("Minimum and Maximum " + Arrays.toString(mc.getMinMax()));
    }

    public static class MathClass{
        int n;
        int[] arr;
        MathClass(){
            n = 5;
            arr = new int[5];
        }
        MathClass(int n){
            this.n = n;
            arr = new int[n];
        }
        public int[] getMinMax(){
            int [] res = new int[2];
            res[0] = res[1] = arr[0];
            for(int i=1;i<n;i++){
                if(arr[i] < res[0]) res[0] = arr[i];
                if(arr[i] > res[1]) res[1] = arr[i];
            }
            return res;
        }

    }
}
