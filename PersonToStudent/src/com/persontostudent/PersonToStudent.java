package com.persontostudent;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class PersonToStudent extends Person{
	
	private int[] testScores;
	
	PersonToStudent(String firstName, String lastName, int identification) {
		super(firstName, lastName, identification);
		// TODO Auto-generated constructor stub
	}

	PersonToStudent(String firstName, String lastName, int identification, int[] inTestScores) {
		super(firstName, lastName, identification);
		this.testScores = inTestScores;
		// TODO Auto-generated constructor stub
	}
	
	public int getAverage() {
		return 0;
	}
	
	private int calculate() { 

		List<Integer> list = Arrays.stream(testScores).boxed().collect(Collectors.toList());
		list.stream() //
	    .mapToInt(i -> i) //
	    .average() //
	    .ifPresent(avg -> System.out.println("Average found is " + avg));

		return 0;
	}
	
	
	public static void main(String args[]) {
		int[] testScores = {31, 32, 34, 35};
		//List<Integer> list = Arrays.stream(testScores).boxed().collect(Collectors.toList());
		PersonToStudent bob = new PersonToStudent("Bob", "Shaklee", 387483, testScores);
		bob.calculate();
		IntSummaryStatistics stats = Arrays.stream(testScores).summaryStatistics();
		System.out.println("********************************");
		System.out.println("Average is " + (int) stats.getAverage());
	}
}
