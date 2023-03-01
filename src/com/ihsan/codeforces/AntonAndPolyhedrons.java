package com.ihsan.codeforces;

import java.util.Scanner;

public class AntonAndPolyhedrons {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int faces = 0;
        for(int i=0;i<n;i++){
            char c = in.next().charAt(0);
            if(c == 'T') faces += 4;
            else if(c == 'C') faces += 6;
            else if(c == 'O') faces += 8;
            else if(c == 'D') faces += 12;
            else if(c == 'I') faces += 20;
        }
        System.out.println(faces);
    }
}
