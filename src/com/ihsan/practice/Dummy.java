package com.ihsan.practice;

public class Dummy {
    public static void main(String[] args) {
        int a = 5;
        int b = 11;
        dummy(a,b);
    }
    public static void dummy(int a, int b){

//        Given Integers and its binary representation
        String s = Integer.toBinaryString(a);
        int len_a = s.length();
        System.out.println("a = " + a + " => Binary Representation is " + s);

        s = Integer.toBinaryString(b);
        int len_b = s.length();
        System.out.println("b = " + b + " => Binary Representation is " + s);

//        Complement of the binary Representation
        s = Integer.toBinaryString((~a));
        String res = getComplement(s, len_a);
//        System.out.println("~a = " + (~a) + " => Binary Representation is " + res);
        System.out.println("The complement of a would be " + Integer.parseInt(res,2) + " => Binary Representation is " + res);

        s = Integer.toBinaryString((~b));
        res = getComplement(s, len_b);
//        System.out.println("~b = " + (~b) + " => Binary Representation is " + res);
        System.out.println("The complement of b would be " + Integer.parseInt(res,2) + " => Binary Representation is " + res);

    }

    public static String getComplement(String s, int len) {
        String ans = "";
        for(int i=s.length() - len; i < s.length(); i++){
            ans += s.charAt(i);
        }
        return ans;
    }

}
