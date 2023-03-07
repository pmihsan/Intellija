package com.ihsan.codeforces;

import java.util.Scanner;

public class TheNewYearMeetingFriends {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int r1 = Math.abs(a - b) + Math.abs(a - c);
        int r2 = Math.abs(a - b) + Math.abs(b - c);
        int r3 = Math.abs(a - c) + Math.abs(b - c);

        System.out.println(Math.min(Math.min(r1, r2), r3));
    }
}
