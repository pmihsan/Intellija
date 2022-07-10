package com.ihsan.datastructures.linkedlist1;

public class LinkedListSample {

    Node head;

    static class Node {
        int data;
        Node next;

        Node(int val){
            data = val;
            next = null;
        }
    }

    public void insert(LinkedListSample list, int data){
        Node newNode = new Node(data);

        if(list.head == null){
            list.head = newNode;
        }
        else{
            Node last = list.head;
            while(last.next != null){
                last = last.next;
            }
            last.next = newNode;
        }
    }

    public void display(LinkedListSample list){
        Node temp = list.head;
        System.out.println("Linked List");
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }


}
