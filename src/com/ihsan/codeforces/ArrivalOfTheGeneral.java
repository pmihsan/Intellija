package com.ihsan.codeforces;

import java.util.Scanner;

public class ArrivalOfTheGeneral {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        int min,max;
        min = max = arr[0];
        int minIndex, maxIndex;
        minIndex = maxIndex = 0;
        for(int i=1;i<n;i++){
            if(arr[i] > max){
                max = arr[i];
                maxIndex = i;
            }
            if(arr[i] <= min){
                min = arr[i];
                minIndex = i;
            }
        }
        if(minIndex < maxIndex)
            System.out.println(maxIndex + ((n - 1) - (minIndex+1)));
        else if(minIndex > maxIndex)
            System.out.println(maxIndex + ((n - 1) - minIndex));
    }
}
