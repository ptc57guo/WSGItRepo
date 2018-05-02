package com.largestregion;

public class Solution {

	public static int getBiggestRegion(int[][] matrix) {
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];
        int bigRegion = 0;
        int size = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                if (!visited[row][col]) {
                    size = findRegion(matrix, visited, row, col);
                    bigRegion = Math.max(bigRegion, size);
                }
            }
        }
        return bigRegion;
    }
    
    private static int findRegion(int[][] matrix, boolean[][] visited, int row, int col) {
        if (row >= matrix.length || col >= matrix[0].length) return 0;
        if (row < 0 || col < 0) return 0;
        int count = 0;
        if (visited[row][col]) return 0;
        visited[row][col] = true;
        if (matrix[row][col] == 0) {
            return 0;
        }
        count = 1;
        count += findRegion(matrix, visited, row + 1, col);
        count += findRegion(matrix, visited, row, col + 1);
        count += findRegion(matrix, visited, row + 1, col + 1);
        count += findRegion(matrix, visited, row - 1, col);
        count += findRegion(matrix, visited, row, col - 1);
        count += findRegion(matrix, visited, row - 1, col - 1);
        count += findRegion(matrix, visited, row - 1, col + 1);
        count += findRegion(matrix, visited, row + 1, col - 1);
        return count;
    }

		 public static void main(String[] args) {
		  int[][] input ={{1, 1 ,0, 0},
		                   {0 ,1, 1 ,0},
		                   {0 ,0 ,1 ,0},
		                   {1 ,0, 0, 0}};
		  System.out.println(getBiggestRegion(input));
		    }
}
