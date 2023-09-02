package com.ihsan.practice;

import java.util.ArrayList;

public class BinaryStrings {

    public static void main(String[] args) {
        System.out.println(generateString(4));
    }

    public static ArrayList<String> generateString(int k) {
        // Write your code here.
        ArrayList<String> l = new ArrayList<>();
        process("", k, l);
        return l;
    }

    public static void process(String up, int N, ArrayList<String> list){
        if(up.length() == N){
            list.add(up);
            return;
        }
        process(up + "0", N, list);

        if(up.isEmpty() || up.charAt(up.length() - 1) != '1')
            process(up + "1", N, list);
    }
}
