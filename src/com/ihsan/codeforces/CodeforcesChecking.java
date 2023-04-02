package com.ihsan.codeforces;

import java.util.Scanner;

public class CodeforcesChecking {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        char[] arr = {'c', 'o', 'd', 'e', 'f', 'r', 's'};
        while(t > 0){
            char ch = in.next().charAt(0);
            int f = 0;
            for(int i=0;i<arr.length;i++){
                if(arr[i] == ch){
                    f = 1;
                    break;
                }
            }
            if(f == 1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            t--;
        }
    }
}
