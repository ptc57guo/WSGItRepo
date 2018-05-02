package com.findduplicates;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {

	public static void main(String args[]) {
		
		int[] unorderedNumbers = {0, 0, 1, 2, 1};

		final int[] distinctOrdered = Arrays.stream(unorderedNumbers)
		        .sorted()
		        .distinct()
		        .toArray();
		
		System.out.println(IntStream.of(distinctOrdered).mapToObj(Integer::toString).collect(Collectors.joining(", ")));
		
		
		int HASH[];

        int[] numbers = {1, 1, 2, 1, 3, 4, 5};
        HASH=new int[100000];
        for(int i=0;i<numbers.length;i++)
        {
            if(HASH[numbers[i]]==0)
            {
                System.out.print(numbers[i]+",");
                HASH[numbers[i]]=1;
            }
        }

        int result = 0;
        for(int i:unorderedNumbers)
        {
            result ^=i;
        }

        System.out.println("Result is "+result);
	}
	
}
