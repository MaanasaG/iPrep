package com.org.tests;

import static org.junit.Assert.*;

import com.org.numbers.Fibonacci;

import org.junit.Test;

public class FibonacciTest {

	@Test
	public void test() {
		int n=10;
		int n1=0;
		int n2=1;
		int n6=2;
		int n3=100;
		int n4=-1;
		int n5=5000;
		Fibonacci.fib(n);
		Fibonacci.fib(n1);
		Fibonacci.fib(n2);
		Fibonacci.fib(n3);
    	Fibonacci.fib(n4);
		Fibonacci.fib(n5);
		Fibonacci.fib(n6);
		Fibonacci.secondFib(n5);
		Fibonacci.secondFib(n4);
		Fibonacci.secondFib(n3);
		Fibonacci.secondFib(n2);
		Fibonacci.secondFib(n1);
	}

}
