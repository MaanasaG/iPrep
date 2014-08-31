package com.org.numbers;

public class Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int input = 7;
		System.out.println(factorial(input));

	}

	private static int factorial(int input) {
		int output=1;
		for(int i=input;i>=1;i--){
			output= output*i;	
		}
		return output;
	}

}
