package com.findnumbers;

public class FindNumbersWithDigit {
	
	public static String findNumbersWithDigit(int digit, int startArray, int endArray) {
		StringBuilder sb = new StringBuilder();
		int arrayValue = 0;
		for ( int valueCounter = startArray; valueCounter <= endArray; valueCounter++) {
			arrayValue = valueCounter;
			while ( arrayValue > 0) {
				int d = arrayValue % 10; 
				if ( d == digit ) {
					sb.append(arrayValue + " ");
					break;
				}
				arrayValue = arrayValue / 10;
			}
		}
		return sb.toString();
	}
	
	public static void main(String agrs[]) {
		String s = findNumbersWithDigit(3, 5, 23);
		System.out.println(s);
	}
}
