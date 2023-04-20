package com.ihsan.practice;

import java.util.HashMap;
import java.util.Scanner;

public class CountUnique {

    public static HashMap<String, Integer> hm = new HashMap<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter how many strings you want to provide?");
        int n = in.nextInt();
        while (n > 0) {
            System.out.println("\nEnter a string");
            String s = in.next();
            System.out.println("Unique Characters in " + s + " is " + countUnique(s));
            n--;
        }
    }

    public static int countUnique(String str){
        int unique = 0;
        if(hm.containsKey(str)) {
            System.out.println("String Already Found");
            return hm.get(str);
        }
        int[] arr = new int[26];
        for(int i=0;i<str.length();i++){
            int ind = str.charAt(i) - 'a';
            arr[ind]++;
            if(arr[ind] == 1) unique++;
        }
        hm.put(str, unique);
        return unique;
    }

}
