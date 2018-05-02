package com.findduplicate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindDuplicate {

    public int findDuplicateNumber(List<Integer> numbers){
        
        int highestNumber = numbers.size() - 1;
        int total = getSum(numbers);
        int duplicate = total - (highestNumber*(highestNumber+1)/2);
        return duplicate;
    }
     
    public static int getSum(List<Integer> numbers){
         
        int sum = 0;
        for(int num:numbers){
            sum += num;
        }
        return sum;
    }
    
    public static int getSumOfSquares(List<Integer> numbers) {
    		int sumSquares = 0;
    		for (int num:numbers)
    			sumSquares += num*num;
    		return sumSquares;
    }
    
    public static List<Integer> findRemovedAndReplaced(List<Integer> numbers) {
    		List<Integer> returnValue = new ArrayList<Integer>();
    		int highestNumber = numbers.size() - 1;
    		int sumOfNumbers = getSum(numbers);
    		int sumOfSquares = getSumOfSquares(numbers);
    		int differenceOfSums = (highestNumber*(highestNumber+1))/2 - sumOfNumbers;
    		int differenceOfSquares = (sumOfSquares - (highestNumber * (highestNumber - 1))) * (2 * highestNumber - 1)/6;
    		int numberRemoved = (differenceOfSquares + differenceOfSums)/2;
    		int numberReplaced = (differenceOfSquares + differenceOfSums)/2;
    		returnValue.add(numberRemoved);
    		returnValue.add(numberReplaced);
    		return returnValue;
    }
     
    public static ArrayList<Integer> findDuplicates(List<Integer> numbers){
    		Collections.sort(numbers);
    		ArrayList<Integer> duplicateNumbers = new ArrayList<Integer>(10);
    		Set<Integer> integerSet = new HashSet<Integer>(10);
    		for (int arrayInt : numbers) {
    			if (integerSet.contains(arrayInt)) {
    				duplicateNumbers.add(arrayInt);
    			}
    			else {
				integerSet.add(arrayInt);
    			}
    		}
    		return duplicateNumbers;
    }
     
    public static int findRepeat(int[] theArray) {

        int floor = 1;
        int ceiling = theArray.length - 1;

        while (floor < ceiling) {

            // divide our range 1..n into an upper range and lower range
            // (such that they don't overlap)
            // lower range is floor..midpoint
            // upper range is midpoint+1..ceiling
            int midpoint = floor + ((ceiling - floor) / 2);
            int lowerRangeFloor   = floor;
            int lowerRangeCeiling = midpoint;
            int upperRangeFloor   = midpoint + 1;
            int upperRangeCeiling = ceiling;

            // count number of items in lower range
            int itemsInLowerRange = 0;
            for (int item : theArray) {

                // is it in the lower range?
                if (item >= lowerRangeFloor && item <= lowerRangeCeiling) {
                    itemsInLowerRange += 1;
                }
            }

            int distinctPossibleIntegersInLowerRange = lowerRangeCeiling - lowerRangeFloor + 1;

            if (itemsInLowerRange > distinctPossibleIntegersInLowerRange) {

                // there must be a duplicate in the lower range
                // so use the same approach iteratively on that range
                floor   = lowerRangeFloor;
                ceiling = lowerRangeCeiling;
            } else {

                // there must be a duplicate in the upper range
                // so use the same approach iteratively on that range
                floor   = upperRangeFloor;
                ceiling = upperRangeCeiling;
            }
        }

        // floor and ceiling have converged
        // we found a number that repeats!
        return floor;
    }

    public static void main(String a[]){
        List<Integer> numbers = new ArrayList<Integer>();
        for(int i=1;i<30;i++){
            numbers.add(i);
        }
        //add duplicate number into the list
        numbers.add(22);
        FindDuplicate dn = new FindDuplicate();
        System.out.println("Duplicate Number: "+dn.findDuplicateNumber(numbers));
        System.out.println("-------------------------------------------");
        List<Integer> returnValue = findRemovedAndReplaced(numbers);
        for (Integer i:returnValue) {
        		System.out.println(i);
        }
        System.out.println("*******************************************");
        ArrayList<Integer> duplicates = findDuplicates(numbers);
        Stream.of(duplicates).forEach(System.out::println);
        System.out.println(duplicates.stream().map(Object::toString).collect(Collectors.joining(", "))); 
        System.out.println("********************************************");
        int[] intArray = new int[numbers.size()];
        int counter = 0;
        for(Integer i : numbers){
        	    intArray[counter] = i;
			counter++;
        }

        System.out.println(findRepeat(intArray));
    }
    
}
