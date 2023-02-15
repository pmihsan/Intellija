package com.ihsan.codeforces;

import java.util.HashMap;
import java.util.Scanner;

public class Presents {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(in.nextInt(), i+1);
        }
        for(int i=0;i<n;i++){
            System.out.print(hm.get(i+1) + " ");
        }
        System.out.println();
    }
}
