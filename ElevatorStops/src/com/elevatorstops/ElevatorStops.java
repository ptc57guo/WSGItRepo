package com.elevatorstops;

import java.util.ArrayList;
import java.util.List;

public class ElevatorStops {
	public static void main(String args[]) {
		int[] A = {40, 40, 100, 80, 20};
		int[] B = {3, 3, 2, 2, 3};
		int M = 3;
		int X = 5;
		int Y = 200;
		
		System.out.println(solution(A, B, M, X, Y));
	}

	public static int solution(int[] A, int[] B, int M, int X, int Y)
	{
	   
	    int totalStops = 0;
	    long weightPerTrip = 0;
	    int maximumNumberPeople = 0;
	    List<Integer> listOfFloors = new ArrayList<Integer>();
	    int currentPerson = 0;
	    boolean startElevator = false;
	    while ( currentPerson < A.length )
	    {
	        
	        if (( weightPerTrip + A[currentPerson] ) <= Y && ( maximumNumberPeople + 1 ) <= X )
	        {
	        		weightPerTrip += A[currentPerson];
	        		maximumNumberPeople++;
	            listOfFloors.add( B[currentPerson] );
	            
	            if ( currentPerson == A.length - 1 )
	                startElevator = true;
	
	            currentPerson++;
	        }
	        else
	        {
	            startElevator = true;
	        }
	
	        if ( startElevator )
	        {
	            totalStops += listOfFloors.stream().distinct().count() + 1;
	            //reset variable
	            listOfFloors.clear();
	            maximumNumberPeople = 0;
	            weightPerTrip = 0;
	            startElevator = false;
	        }
	    }
	
	    return totalStops;
	}
}