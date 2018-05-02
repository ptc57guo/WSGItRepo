package com.maximumdifference;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Difference {
	private int[] elements;
	public int maximumDifference;
	
	Difference(int[] inputArray){
		elements = Arrays.copyOf(inputArray, inputArray.length);
	}
	
	public void computeDifference() {
		IntSummaryStatistics stats = IntStream.of(elements).summaryStatistics();
		maximumDifference = stats.getMax() - stats.getMin();
	}
}
