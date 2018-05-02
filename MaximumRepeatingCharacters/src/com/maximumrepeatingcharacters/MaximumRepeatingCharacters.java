package com.maximumrepeatingcharacters;



public class MaximumRepeatingCharacters {

	public static void main(String[] args) {
		int n = 32767;
        String str = Integer.toBinaryString(n);
        int max = maxCount(str);
        System.out.println(max);
    }
	
	public static int maxCount(String str) {
        char[] array = str.toCharArray();
        int count = 1;
        int max = 0;
        char maxChar = 0;
        for(int i=1; i<array.length; i++){ // Start from 1 since we want to compare it with the char in index 0
            if(array[i]==array[i-1]){
                count++;
            } else {
                if(count>max){  // Record current run length, is it the maximum?
                    max=count;
                    maxChar=array[i-1];
                }
                count = 1; // Reset the count
            }
        }
        if(count>max){
            max=count; // This is to account for the last run
            maxChar=array[array.length-1];
        }
        return max;
	}
}
