package com.test1;

public class Test11 {
	public static void main(String args[]) 
	{
	outer: 	   
	for(int i = 0; i < 3; i++) 
	{
		for(int j = 3; j >= 0; j--) 
		{
			 if(i == j) continue outer;
			 System.out.println(i + " " + j);
		}
	}
	}

}
