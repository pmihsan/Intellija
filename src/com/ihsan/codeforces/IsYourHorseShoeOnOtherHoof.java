package com.ihsan.codeforces;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IsYourHorseShoeOnOtherHoof {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Set<Integer> st = new HashSet<>();
        for(int i=0;i<4;i++){
            int a = in.nextInt();
            st.add(a);
        }
        System.out.println(4 - st.size());
    }
}
