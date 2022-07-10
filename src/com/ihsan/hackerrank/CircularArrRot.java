package com.ihsan.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class CircularArrRot {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        List<Integer> query = new ArrayList<>();
        int k = 2;
        for(int i=0;i<4;i++){
            arr.add(i+1);
//            query.add(i);
        }
        query.add(1);
        query.add(3);
        System.out.println(arr);
        System.out.println("Method 1: Result " + circularArrayRotation(arr, k, query));
//        System.out.println("Method 2: Result " + circularArr(arr, k, query));
    }
    public static List<Integer> circularArr(List<Integer> a, int k, List<Integer> que){
        List<Integer> ans = new ArrayList<>();
        k = k % a.size();
        reverse(a, 0, a.size()-1);
        reverse(a, 0, k-1);
        reverse(a, k, a.size()-1);
        System.out.println(a);
        for(int i=0;i<que.size();i++){
            ans.add(a.get(que.get(i)));
        }
        return ans;
    }
    public static void reverse(List<Integer> a, int s, int e){
        while(s < e){
            int t = a.get(s);
            int b = a.get(e);
            a.set(s, b);
            a.set(e, t);
            s++;
            e--;
        }
    }
    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
            List<Integer> ans = new ArrayList<>();
            k = k % a.size();
            for(int i=0;i<k;i++){
                rotate(a);
            }
            for(int i=0;i<queries.size();i++){
                ans.add(a.get(queries.get(i)));
            }
            System.out.println(a);
            return ans;
    }
    public static void rotate(List<Integer> a){
        int len = a.size();
        int last = a.get(len-1);
        for(int i=len-1;i>0;i--){
            a.set(i, a.get(i-1));
        }
        a.set(0, last);

    }
}
