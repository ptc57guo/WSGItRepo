package com.fibonacci;

import java.math.BigInteger;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution {

	public static String fibonacciIterativeSuite(int number) {
		  return IntStream.rangeClosed(1, number)
		      .boxed()
		      .map(i -> fibonacciIterative(i))
		      .map(BigInteger::toString)
		      .collect(Collectors.joining(", "));
	}
	
//	public static String fibonacciTailRecursiveSuite(int number) {
//		  return IntStream.rangeClosed(1, number)
//		      .boxed()
//		      .map(i -> fibonacciTailRecursive(i))
//		      .map(BigInteger::toString)
//		      .collect(Collectors.joining(", "));
//	}
	
	public static BigInteger fibonacciIterative(int number) {
		  if (number == 1 || number == 2) {
		    return BigInteger.ONE;
		  }
		  BigInteger fibo1 = BigInteger.ONE;
		  BigInteger fibo2 = BigInteger.ONE;
		  BigInteger fibonacci = BigInteger.ZERO;
		  for (int i = 3; i <= number; i++) {
		    fibonacci = fibo1.add(fibo2);
		    fibo1 = fibo2;
		    fibo2 = fibonacci;
		  }
		  return fibonacci;
	}
	
	public static BigInteger fibTail(int x) {
		  return fibTailHelper(BigInteger.ONE, BigInteger.ZERO, BigInteger.valueOf(x));
		}
		public static BigInteger fibTailHelper(BigInteger acc1, BigInteger acc2, BigInteger x) {
		  if (x.equals(BigInteger.ZERO)) {
		    return BigInteger.ONE; 
		  } else if (x.equals(BigInteger.ONE)) {
		    return acc1.add(acc2);
		  } else {
		    return fibTailHelper(acc2, acc1.add(acc2), x.subtract(BigInteger.ONE));
		  }
	}
		
	public static long fib(int index) {
		if ( index == 0 ) return 0;
		if ( index <= 2 ) return 1;
		
		long fibTerm = fib(index -1) + fib(index - 2);
		return fibTerm;
	}
	private static long number = 1000; 
	public static void main(String[] args) { 
	  Tuple<BigInteger, BigInteger> seed = new Tuple<>(BigInteger.ONE, BigInteger.ONE);
	  UnaryOperator<Tuple<BigInteger, BigInteger>> f = x -> new Tuple<>(x._2, x._1.add(x._2));
	  Stream<BigInteger> fiboStream = Stream.iterate(seed, f)
	       .map(x -> x._1)
	       .limit(number);
	  
	  String result = fiboStream.map(BigInteger::toString).collect(Collectors.joining(", ")); 
	  System.out.println(result);
	  System.out.println(fibTail((int)number));
	  System.out.println("___________________");
	  System.out.println(fib(10));
	  System.out.println("------------------");
	  System.out.println(fibonacciIterative(10));
	}	
}
