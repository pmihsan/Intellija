package com.ihsan.morganstanley;

import java.util.LinkedHashMap;
import java.util.Map;

public class MaxFreqSales {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 2, 5, 2, 6, 4, 4, 3, 5, 6};
        int n = arr.length;
        getThreeMaxSales(arr, n);
    }

    static void getThreeMaxSales(int[] arr, int n) {
        LinkedHashMap<Integer, Integer> lhm = new LinkedHashMap<>();
        int i;
        for (i = 0; i < n; i++) {
            if (lhm.containsKey(arr[i])) {
                int a = lhm.get(arr[i]);
                lhm.replace(arr[i], ++a);
            } else {
                lhm.put(arr[i], 1);
            }
        }
        System.out.println(lhm);
        i = 0;
        while (i < 3) {
            int max = 0;
            int key = 0;
            for(Map.Entry<Integer, Integer> entry: lhm.entrySet()){
                if(entry.getValue() > max){
                    max = entry.getValue();
                    key = entry.getKey();
                }
            }
            System.out.println(key);
            lhm.replace(key, 0);
            i++;
        }
    }
}
