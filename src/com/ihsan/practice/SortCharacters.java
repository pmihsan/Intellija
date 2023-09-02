package com.ihsan.practice;

import java.util.*;

public class SortCharacters {
    public static void main(String[] args) {
        System.out.println(sortFrequency("tree"));
    }
    public static String sortFrequency(String s){
        HashMap<Character, Integer> hm = new HashMap<>();

        for(int i=0;i<s.length();i++){
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
        }

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(hm.entrySet());
//        list.sort((o1, o2) -> (o2.getValue() - o1.getValue()));
        list.sort((o1, o2) -> {
            if(!o1.getValue().equals(o2.getValue())) return o2.getValue() - o1.getValue();
            return o1.getKey() - o2.getKey();
        });

        StringBuilder sb = new StringBuilder();

        for(Map.Entry<Character, Integer> e: list){
            sb.append(e.getKey().toString().repeat(e.getValue()));
        }

        return sb.toString();
    }
}
