package com.ihsan.codeforces;

import java.util.ArrayList;
import java.util.Scanner;

public class RestoreThePermutationByMerger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t > 0){
            int n = in.nextInt();
            ArrayList<Integer> l = new ArrayList<>();
            for(int i=0;i<2*n;i++){
                int a = in.nextInt();
                if(!l.contains(a)) l.add(a);
            }
            for(int e: l){
                System.out.print(e + " ");
            }
            System.out.println();
            t--;
        }
    }
}
