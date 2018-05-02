package com.maximumdifference;

public class Solution {

	public static void main(String args[]) {
		int[] A = {1, 5, 2};
		Difference difference = new Difference(A);
		difference.computeDifference();
		System.out.println(difference.maximumDifference);
	}
}
