package com.ihsan.codeforces;

import java.util.ArrayList;
import java.util.Scanner;

public class BachgoldProblem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> l = new ArrayList<>();
        int n = in.nextInt();
        if((n & 1) == 1){
            l.add(3);
            n -= 3;
        }
        while(n > 0){
            l.add(2);
            n -= 2;
        }
        System.out.println(l.size());
        for(int i=0;i<l.size();i++){
            System.out.print(l.get(i) + " ");
        }
        System.out.println();
    }
}
