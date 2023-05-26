package com.ihsan.zscaler;

import java.util.Arrays;

public class MaxSubArraySumAtLeastK {
    public static void main(String[] args) {
        int[] arr = {3, -1, 5, 7, 8, -4};
        int k = 4;
        System.out.println("Max Sub Array Sum: " + subarraySum(arr, k));
    }

    public static int subarraySum(int[] arr, int k) {
        int[] maxSum = new int[arr.length];
        maxSum[0] = arr[0];

        for (int i = 1 ; i < arr.length; i++) {
            maxSum[i] = Math.max(arr[i], maxSum[i - 1] + arr[i]);
        }

        int sum = 0 ;
        for (int i = 0 ; i < k; i++) {
            sum += arr[i];
        }

        int ans = sum;;
        for (int i = k;i < arr.length;i++) {
            sum += arr[i] - arr[i - k];
            ans = Math.max(ans, Math.max(sum, sum + maxSum[i - k]));
        }
        return ans;
    }
}
