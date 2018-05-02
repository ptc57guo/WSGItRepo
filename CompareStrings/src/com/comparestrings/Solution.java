package com.comparestrings;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	static List<Boolean> compareStrings(String string1, String string2) {
		List<Boolean> response = new ArrayList<Boolean>();
		try {
			if ( string1 != null) {
				if (string1.equals(string2)) {
					response.add(true);
				}
				else {
					response.add(false);
				}
			}
			else {
				if ( string1 == string2 ) {
					response.add(true);
				}
				else {
					response.add(false);
				}
			}
			
		}
		catch (Exception e) {
			
		}
		return response;
	}
	public static void main(String args[]) {
		String string1 = "foo";
		String string2 = "foo";
		System.out.println(compareStrings(string1, string2));
		
		string1 = "foo";
		string2 = "bar";
		System.out.println(compareStrings(string1, string2));
		
		string1 = null;
		string2 = "bar";
		System.out.println(compareStrings(string1, string2));
		
		string1 = "foo";
		string2 = null;
		System.out.println(compareStrings(string1, string2));
		
		//string1 = "foo";
		
	}
}
