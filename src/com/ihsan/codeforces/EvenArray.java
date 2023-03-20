package com.ihsan.codeforces;

import java.util.Scanner;

public class EvenArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t > 0){
            int n = in.nextInt();
            int even_count = 0, odd_count = 0;
            for(int i=0;i<n;i++){
                int a = in.nextInt();
                if(i % 2 == 0 && a % 2 != 0) odd_count++;
                else if(i % 2 != 0 && a % 2 == 0) even_count++;
            }
            if(odd_count == even_count){
                System.out.println(even_count);
            }
            else{
                System.out.println(-1);
            }
            t--;
        }
    }
}
