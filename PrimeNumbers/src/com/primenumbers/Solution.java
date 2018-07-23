package com.primenumbers;

import java.util.stream.IntStream;

public class Solution {
	
	public static void main(String[] args) {

        int low = 2, high = 101;
        //changed low and high values
        while (low < high) {
            boolean flag = false;

            for(int i = 2; i <= low/2; ++i) {
                // condition for non prime number
                if(low % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag)
                System.out.print(low + " ");

            ++low;
        }
        System.out.println("");
        System.out.println("-------------------------");
        IntStream.rangeClosed(2, 100)
        .filter(i -> IntStream.rangeClosed(2, (int)Math.sqrt(i))
                .allMatch(j -> i%j != 0))
        .forEach(n -> {
            System.out.print(n + " ");
        });
    }
}
