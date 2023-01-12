package com.ihsan.leetcode.questions;

public class SymmetricTree {

    //Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        // Create a Tree
    }

    public static boolean isSymmetric(TreeNode root) {
        return root == null || checkMirror(root.left, root.right) ;
    }

    public static boolean checkMirror(TreeNode r1, TreeNode r2){
        if(r1 == null || r2 == null){
            return r1==r2;
        }
        if(r1.val != r2.val) return false;
        return checkMirror(r1.left, r2.right) && checkMirror(r1.right, r2.left);
    }
}
