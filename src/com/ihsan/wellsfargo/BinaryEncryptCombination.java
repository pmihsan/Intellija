package com.ihsan.wellsfargo;

import java.util.ArrayList;

public class BinaryEncryptCombination {
    public static void main(String[] args) {
        String s = "100 ??? 101 ? 010";
        System.out.println(s+"\n");
        getStringCoded(s);
    }
    static void getStringCoded(String s) {
        int q = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '?'){
                q++;
            }
        }
        ArrayList<String> arr = new ArrayList<>();
        getCombinations(arr, "", q);
        for (String value : arr) {
            char[] ans = s.toCharArray();
            int k = 0;
            for (int j = 0; j < ans.length; j++) {
                if(ans[j] == '?'){
                    ans[j] = value.charAt(k);
                    k++;
                }
            }
            System.out.println(ans);
        }
    }
    static void getCombinations(ArrayList<String> arr, String s, int q){
        if(s.length() == q){
            arr.add(s);
            return;
        }
        getCombinations(arr, s+"0", q);
        getCombinations(arr, s+"1", q);
    }
}
