package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class ReplaceElements {
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 6};
        int[][] arr = {
                {1, 3},
                {4, 7},
                {6, 1}
        };
        System.out.println(Arrays.toString(arrayChange(nums, arr)));
    }

    public static int[] arrayChange(int[] nums, int[][] operations) {
        LinkedHashMap<Integer, Integer> lhm = new LinkedHashMap<>();

        for(int i=0;i<nums.length;i++) {
            lhm.put(nums[i], i);
        }
        for (int i = 0; i < operations.length; i++) {
            if(lhm.containsKey(operations[i][0])) {
                nums[lhm.get(operations[i][0])] = operations[i][1];
                lhm.put(operations[i][1], lhm.get(operations[i][0]));
            }
        }
        return nums;
    }

}
