package com.ihsan.practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {

//    Definition for a binary tree node.
      public static class TreeNode {
          int val;
          TreeNode left, right;
          TreeNode(int val) { this.val = val; }
      }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);

        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        inorder(root);
        System.out.println();

        System.out.println(levelOrder(root));

        // [1,2,3,4,null,null,5]
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);

        root1.left.left = new TreeNode(4);
        root1.right.right = new TreeNode(5);
        inorder(root1);
        System.out.println();

        System.out.println(levelOrder(root1));
    }


    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int n = q.size();
            List<Integer> l = new ArrayList<>();
            for(int i=0;i<n;i++) {
                TreeNode temp =  q.poll();
                if (temp.left != null) {
                    q.add(temp.left);
                }
                if (temp.right != null) {
                    q.add(temp.right);
                }
                l.add(temp.val);
            }
            ans.add(l);
        }
        return ans;
    }

    public static void inorder(TreeNode root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }
}
