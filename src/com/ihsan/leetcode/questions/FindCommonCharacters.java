package com.ihsan.leetcode.questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindCommonCharacters {
    public static void main(String[] args) {
        String[] words = {"bella","label","roller"};
        System.out.println(commonChars(words));
        String[] words2 = {"cool","lock","cook"};
        System.out.println(commonChars(words2));
    }

    public static List<String> commonChars(String[] words) {
        List<String> l = new ArrayList<>();
        HashMap<Character, Integer> hm = new HashMap<>();
        HashMap<Character, Integer> count = new HashMap<>();
        for(char ch='a';ch <= 'z';ch++){
            hm.put(ch, 1000);
        }
        for(int i=0;i<words.length;i++){
            char[] arr = words[i].toCharArray();
            for(int j=0;j<arr.length;j++){
                count.put(arr[j], count.getOrDefault(arr[j], 0) + 1);
            }
            for(char ch='a';ch <= 'z';ch++){
                hm.put(ch, Math.min(count.getOrDefault(ch, 0), hm.get(ch)));
            }
            count.clear();
        }
        for(char ch='a';ch <= 'z';ch++){
            int t  = hm.get(ch);
            while(t > 0){
                l.add(ch+"");
                t--;
            }
        }
        return l;
    }
}
