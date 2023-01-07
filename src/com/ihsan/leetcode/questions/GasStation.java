package com.ihsan.leetcode.questions;

public class GasStation {
    public static void main(String[] args) {
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};

        System.out.println(canCompleteCircuit1(gas, cost));
        System.out.println(canCompleteCircuit2(gas, cost));
    }

    // Brute Force
    public static int canCompleteCircuit1(int[] gas, int[] cost) {

        // For Every Gas Station as Start Index
        for(int i=0;i<gas.length;i++){

            int bal = 0, j = i, count = 0;
            // Checking For A Full Circular Round
            while(count < gas.length){
                bal += gas[j % gas.length] - cost[j % gas.length];
                if(bal < 0){ // If < 0 not able to complete so break
                    break;
                }
                count++;
                j++;
            }
            if(bal >= 0 && count == gas.length) return i; // If Complete round and balance > 0 then return that index
        }
        return -1; // else -1
    }

    // Optimised
    public static int canCompleteCircuit2(int[] gas, int[] cost) {

        int bal = 0, total = 0, index = 0;
        /*
            index to store the minimum start index
            bal for storing the balance petrol
            total for final answer(just add all the difference if zero or more, then the circular tour would be possible)
         */
        for(int i=0;i<gas.length;i++){
            int consume = gas[i] - cost[i];
            bal += consume;
            if(bal < 0){
                index = i + 1; // Mark the next index as a starting index
                bal = 0; // And Set balance to zero
            }
            total += consume; // For final cost
        }
        return total >= 0 ? index : -1;
    }
}
