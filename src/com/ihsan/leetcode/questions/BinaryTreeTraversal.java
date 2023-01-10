package com.ihsan.leetcode.questions;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeTraversal {
   public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;this.right = right;
        }
    }

    public static void main(String[] args) {
        // Create a Binary Tree
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        getInorder(root, l);
        return l;
    }

    public void getInorder(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }
        getInorder(root.left, list);
        list.add(root.val);
        getInorder(root.right, list);
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        getPreorder(root, list);
        return list;
    }

    public void getPreorder(TreeNode root, List<Integer> l){
        if(root == null) return;
        l.add(root.val);
        getPreorder(root.left,l);
        getPreorder(root.right,l);
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        getPostOrder(root, l);
        return l;
    }
    public void getPostOrder(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }
        getPostOrder(root.left, list);
        getPostOrder(root.right, list);
        list.add(root.val);
    }
}
