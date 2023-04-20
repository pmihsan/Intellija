package com.ihsan.practice;

import java.util.*;

public class CollectionPractice {
    public static void main(String[] args) {

        // Vector
        Vector<Integer> v = new Vector<>();
        for (int i = 0; i < 10; i++) {
            v.add(i);
        }
        System.out.println("Vectors:");
        System.out.println("Display");
        System.out.println(v);
        System.out.println();

        System.out.println("Capacity");
        System.out.println(v.capacity());
        System.out.println();

        System.out.println("Get Elements at index 5");
        System.out.println(v.elementAt(5));
        System.out.println();

        System.out.println("Remove index 7");
        v.remove(7);
        System.out.println(v);
        System.out.println();

        System.out.println("To Array");
        System.out.println(Arrays.toString(v.toArray()));
        System.out.println();

        System.out.println("Clear");
        v.clear();
        System.out.println(v);
        System.out.println();

        // List
        List<Character> l = new ArrayList<>();

        for(int i=65;i<=75;i++){
            l.add((char)i);
        }
        System.out.println("List:");
        System.out.println("Display");
        System.out.println(l);
        System.out.println();

        System.out.println("Size");
        System.out.println(l.size());
        System.out.println();

        System.out.println("Get Element at index 10");
        System.out.println(l.get(10));
        System.out.println();

        System.out.println("Set 'A' to 'a'");
        l.set(0, 'a');
        System.out.println(l);
        System.out.println();

        System.out.println("Check if contains 'Z'");
        System.out.println(l.contains('Z'));
        System.out.println();

        System.out.println("Remove 'D' & 'E'");
        l.remove(3); // char 'D'
        l.remove((Character) 'E'); // 4 th index
        System.out.println(l);
        System.out.println();

        System.out.println("Size");
        System.out.println(l.size());
        System.out.println();

        System.out.println("Clear");
        l.clear();
        System.out.println(l);
        System.out.println();

        // Stack
        Stack<String> s = new Stack<>();

        s.push("OS");
        s.push("DBMS");
        s.push("CA");
        s.push("LA");

        System.out.println("Stack:");
        System.out.println("Display");
        System.out.println(s);
        System.out.println();

        System.out.println("Pop an element");
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println();

        System.out.println("Peek element");
        System.out.println(s.peek());
        System.out.println();

        System.out.println("Again Pop an element");
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println();

        System.out.println("Size");
        System.out.println(s.size());
        System.out.println();

        System.out.println("Search For");
        System.out.println("OS - " + s.search("OS"));
        System.out.println("JAVA - " + s.search("JAVA"));
        System.out.println();

        System.out.println("Clear");
        s.clear();
        System.out.println(s);
        System.out.println();

    }
}
