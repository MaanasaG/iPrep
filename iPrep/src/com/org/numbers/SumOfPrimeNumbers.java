package com.org.numbers;

import java.util.ArrayList;
import java.util.List;

public class SumOfPrimeNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n=10;
	   sumofPrime(n);
	     
	}

	private static void sumofPrime(int n) {
		int sum=0;
		for (int i=1; i<n;i++){
			boolean b = true;
			for (int j=2; j<i;j++){
				if(i%j==0){
					b=false;
				}
			}
			if(b==true){
			System.out.println("prime number "+i);
			sum=sum+i;	
			}
			
		}
		System.out.println(sum);
	}

}
