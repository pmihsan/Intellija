package com.ihsan.geeksforgeeks;

public class HelpAThief {
    public static void main(String[] args) {
        int T = 4;
        int N = 3;
        int[] A = {1, 2, 2};
        int[] B = {3, 2, 4};
        System.out.println(thiefSteals(T,N,A,B));
    }

    public static int thiefSteals(int t, int n, int[] a, int[] b) {
        if(t <= 0 || n <= 0) return 0;
        int coins = 0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j>0;j--){
                if(b[j] > b[j-1]){
                    swap(b, j);
                    swap(a, j);
                }
            }
        }
        int i = 0;
        while(t > 0){
            if(i == n){
                break;
            }
            if(a[i] > t){
                i++;
                continue;
            }
            coins += (a[i] * b[i]);
            t -= a[i];
            i++;
        }
        return coins;
    }

    public static void swap(int[] arr, int p){
        int t = arr[p];
        arr[p] = arr[p-1];
        arr[p-1] = t;
    }

}
