package com.ihsan.leetcode.questions;

public class ReverseLL {
    //Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {
         // Create  A Linked List here
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev, curr, nxt;
        prev = null;
        curr = nxt = head;
        while(curr != null){
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        return prev;
    }
}
