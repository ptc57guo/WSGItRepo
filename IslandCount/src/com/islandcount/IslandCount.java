package com.islandcount;

public class IslandCount {

	public static void main(String[] args) {

		int[][] sea = new int[][] { 
				new int[] {1,  1,  0,  0},
				new int[] {0,  1,  1,  0},
				new int[] {0,  0,  1,  0},
				new int[] {1,  0,  0,  0} };
		
		int numOfIslands = IslandCount.countIslands(sea);
		System.out.println("Number of islands is "+numOfIslands);
	}
	
	public static int countIslands(int[][] sea) {
		boolean[][] checked = new boolean[sea.length][sea.length];
		for (int i = 0; i < sea.length; i++) {
			for (int j = 0; j < sea.length; j++) {
				checked[i][j] = false;
			}
		}
		return countIslands(sea, checked);
	}
	
	public static int countIslands(int[][] sea, boolean[][] checked) {
		int numOfIslands = 0;
		for (int i = 0; i < sea.length; i++) {
			for (int j = 0; j < sea.length; j++) {
				if (checked[i][j]) 
					continue;
				if (sea[i][j] == 0) {
					checked[i][j] = true;
					continue;
				}
				numOfIslands++;
				floodFill(i, j, sea, checked); 
			}
		}
		return numOfIslands;
	}
	
	public static void floodFill(int row, int col, int[][] sea, boolean[][] checked) {
		if (sea[row][col] == 0 || checked[row][col]) return;
		checked[row][col] = true;
		if (col < sea.length - 1) floodFill(row, col+1, sea, checked);
		if (row < sea.length - 1) floodFill(row+1, col, sea, checked);
		if (col > 0) floodFill(row, col-1, sea, checked);
		if (row > 0) floodFill(row-1, col, sea, checked);
	}

}
