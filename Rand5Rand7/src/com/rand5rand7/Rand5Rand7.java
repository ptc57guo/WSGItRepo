package com.rand5rand7;

import java.util.Random;

public class Rand5Rand7 {
	

	public static int rand5() {
	    int result = 7; // arbitrarily large
	    while (result > 5) {
	        result = rand7();
	    }
	    return result;
	}
	
	public static int rand7() {
		Random random = new Random();
		return random.nextInt(7 - 1 + 1) + 1;
	}
	
	public static void main(String args[]) {
		for (int i=1; i<10; i++) {
			System.out.println(rand5());
		}
	}
}
