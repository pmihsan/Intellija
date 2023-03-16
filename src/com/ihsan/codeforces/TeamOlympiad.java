package com.ihsan.codeforces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TeamOlympiad {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
            if(!hm.containsKey(arr[i])){
                ArrayList<Integer> al = new ArrayList<>();
                al.add(1);
                al.add(i+1);
                hm.put(arr[i], al);
            }
            else{
                ArrayList<Integer> l = hm.get(arr[i]);
                l.set(0, l.get(0)+ 1);
                l.add(i+1);
                hm.put(arr[i], l);
            }
        }

        if(hm.containsKey(1) && hm.containsKey(2) && hm.containsKey(3)){
            int max = Math.min(hm.get(1).get(0), Math.min(hm.get(2).get(0), hm.get(3).get(0)));
            System.out.println(max);
            for(int i=0;i<max;i++){
                System.out.println(hm.get(1).get(i+1) + " " + hm.get(2).get(i+1) + " " + hm.get(3).get(i+1));
            }
        }
        else{
            System.out.println(0);
        }
    }
}
