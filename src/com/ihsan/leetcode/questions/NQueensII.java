package com.ihsan.leetcode.questions;

public class NQueensII {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(totalNQueens(n));
    }
    public static int totalNQueens(int n) {
        int[][] board = new int[n][n];
        int ways = placeNQueens(board, 0);
        return ways;
    }
    public static int placeNQueens(int[][] board, int row) {
        if(row == board.length){
            return 1;
        }
        int count = 0;
        for(int col=0;col<board.length;col++){
            if(isSafe(board, row, col)){
                board[row][col] = 1;
                count += placeNQueens(board, row+1);
                board[row][col] = 0;
            }
        }
        return count;
    }

    public static boolean isSafe(int[][] board, int row, int col) {
        for(int i=0;i<row;i++){
            if(board[i][col] == 1) return false;
        }
        int maxLeft = Math.min(row, col);
        for(int i=1;i<=maxLeft;i++){
            if(board[row-i][col-i] == 1) return false;
        }
        int maxRight = Math.min(row, board.length - col - 1);
        for(int i=1;i<=maxRight;i++){
            if(board[row-i][col+i] == 1) return false;
        }
        return true;
    }
}
