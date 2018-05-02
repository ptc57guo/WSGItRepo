package com.secretdecoder;

import java.text.NumberFormat;
import java.text.ParsePosition;

public class SecretDecoder {

	
	public static void main(String args[]) {
		StringBuilder answer = new StringBuilder();
		String[] input = {"4","5","3","15","4","5","_","10","1","22","1","#","21"};
		System.out.println(input.length);
		for (int i=0; i < input.length -1; i++) {
			if (isNumeric(input[i])) {
				answer.append(getCharForNumber(Integer.parseInt(input[i])));
			}
			else if (input[i] == "_") {
				answer.append(" ");
			}
			else if (input[i] == "#") {
				i++;
				answer.append(" ");
				while ((i < input.length) && isNumeric(input[i]) ) {
					answer.append(input[i]);
					i++;
				}
			}
			else {
				answer.append(input[i]);
			}
		}
		System.out.println(answer.toString());

	}
	
	private static String getCharForNumber(int i) {
	    return i > 0 && i < 27 ? String.valueOf((char)(i + 'A' - 1)) : null;
	}
	
	public static boolean isNumeric(String str)
	{
		NumberFormat formatter = NumberFormat.getInstance();
		ParsePosition pos = new ParsePosition(0);
		formatter.parse(str, pos);
		return str.length() == pos.getIndex();
	}
}
