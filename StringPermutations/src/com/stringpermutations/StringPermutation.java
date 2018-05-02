package com.stringpermutations;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class StringPermutation {

	public static void main(String args[]) {
		String input = "cats";
		Set<String> returnSet = getPermutations(input);
		for (String s : returnSet) {
			System.out.println(s);
		}
	}
	
	public static Set<String> getPermutations(String inputString) {

	    // base case
	    if (inputString.length() <= 1) {
	        return new HashSet<>(Arrays.asList(inputString));
	    }

	    String allCharsExceptLast = inputString.substring(0, inputString.length() - 1);
	    char lastChar = inputString.charAt(inputString.length() - 1);

	    // recursive call: get all possible permutations for all chars except last
	    Set<String> permutationsOfAllCharsExceptLast = getPermutations(allCharsExceptLast);

	    // put the last char in all possible positions for each of the above permutations
	    Set<String> permutations = new HashSet<>();
	    for (String permutationOfAllCharsExceptLast : permutationsOfAllCharsExceptLast) {
	        for (int position = 0; position <= allCharsExceptLast.length(); position++) {
	            String permutation = permutationOfAllCharsExceptLast.substring(0, position) + lastChar 
	                + permutationOfAllCharsExceptLast.substring(position);
	            permutations.add(permutation);
	        }
	    }

	    return permutations;
	}
}
