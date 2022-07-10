package com.ihsan.leetcode.questions;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
//        int[] arr = {2, 4, 5, 6, 7, 7, 7, 7, 7, 8, 9, 11};
        int[] arr = {5, 7, 7, 8, 8, 10};
        int[] res1 = fnl(arr,10);
        System.out.println(Arrays.toString(res1));
    }
    public static int[] fnl(int[] arr, int t){ // Accepted by leetcode
        int[] ans = {-1, -1};
        for(int i=0;i<arr.length;i++){
            if(arr[i] == t){
                for(int j=arr.length-1;j>=i;j--){
                    if(arr[j] == t){
                        ans[0] = i;
                        ans[1] = j;
                        break;
                    }
                }
                break;
            }
        }
        return ans;
    }

    public static int[] firstAndLast(int[] arr, int target){ // Not So Valid
        int[] ans = {-1, -1};
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                ans[0] = i;
                break;
            }
        }
        if(ans[0] == -1) return ans;
        for(int i=ans[0];i<arr.length;i++){
            if(arr[i] != target){
                ans[1] = i-1;
                break;
            }
        }
        return ans;
    }
    public static int[] findfnl(int[] arr, int target) { // Complete Error
        int[] ans = {-1, -1};
        int s = 0;
        int e = arr.length - 1;
        int c, d;
        c = d = 0;
        while (s < e) {
            if (arr[s] == target && c == 0) {
                ans[0] = s;
                c = 1;
                s++;
            }
            if (arr[e] == target && d == 0) {
                ans[1] = e;
                d = 1;
                e--;
            }
            else{
                s++;
                e--;
            }
        }
        if (ans[0] != -1 || ans[1] != -1){
            ans[0] = ans[0] == -1 ? ans[1] : ans[0];
            ans[1] = ans[1] == -1 ? ans[0] : ans[1];
        }
        return ans;
    }
}
