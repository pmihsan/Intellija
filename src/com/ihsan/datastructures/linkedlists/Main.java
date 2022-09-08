package com.ihsan.datastructures.linkedlists;

import com.ihsan.datastructures.linkedlist1.LinkedListSample;

public class Main {
    public static void main(String[] args) {
        LinkedListSample ll = new LinkedListSample();

        ll.insert(ll, 23);
        ll.insert(ll, 45);
        for (int i = 0; i < 10; i++) {
            ll.insert(ll, i*5);
        }

        ll.display(ll);
    }
}
