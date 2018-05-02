package com.arrayinplace;

import java.util.Random;
import java.util.stream.IntStream;

public class ArrayRandomInplace {
	
	private static Random rand = new Random();

	private static int getRandom(int floor, int ceiling) {
	    return rand.nextInt((ceiling - floor) + 1) + floor;
	}

	public static void shuffle(int[] theArray) {

	    // if it's 1 or 0 items, just return
	    if (theArray.length <= 1) {
	        return;
	    }

	    // walk through from beginning to end
	    for (int indexWeAreChoosingFor = 0;
	        indexWeAreChoosingFor < theArray.length - 1; indexWeAreChoosingFor++) {

	        // choose a random not-yet-placed item to place there
	        // (could also be the item currently in that spot)
	        // must be an item AFTER the current item, because the stuff
	        // before has all already been placed
	        int randomChoiceIndex = getRandom(indexWeAreChoosingFor, theArray.length - 1);

	        // place our random choice in the spot by swapping
	        if (randomChoiceIndex != indexWeAreChoosingFor) {
	            int valueAtIndexWeChoseFor = theArray[indexWeAreChoosingFor];
	            theArray[indexWeAreChoosingFor] = theArray[randomChoiceIndex];
	            theArray[randomChoiceIndex] = valueAtIndexWeChoseFor;
	        }
	    }
	}
	
	public static void main(String args[]) {
		int[] testArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9};
		IntStream.of(testArray)
        .mapToObj(i -> Integer.toUnsignedString(i, 16))
        .forEach(System.out::println);
		shuffle(testArray);
		System.out.println("-----------------------------");
		IntStream.of(testArray)
        .mapToObj(i -> Integer.toUnsignedString(i, 16))
        .forEach(System.out::println);
		shuffle(testArray);
	}


}
