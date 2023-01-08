package com.ihsan.leetcode.questions;

public class AddBinary {
    public static void main(String[] args) {
        String a = "1010", b = "1011";
        System.out.println(addBinary(a, b));
    }

    public static String addBinary(String a, String b) {
        int l1 = a.length() - 1;
        int l2 = b.length() - 1;
        int sum = 0;

        StringBuilder sb = new StringBuilder();

        while(l1 >= 0 || l2 >=0){

            sum /= 2;
            if(l1 >= 0) sum += a.charAt(l1) - '0';
            if(l2 >= 0) sum += b.charAt(l2) - '0';

            sb.append(sum % 2);
            l1--;
            l2--;
        }
        if(sum / 2 != 0) sb.append(1);
        return sb.reverse().toString();
    }
}
