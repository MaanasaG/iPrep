package com.org.numbers;

import java.util.Scanner;

public class Fibonacci {

	/**
	 * Its just ratio of successive pair of numbers is approx pi
	 * Fn=Fn-1+Fn-2
	 */
	public static void main(String args[]) {
 
       
        int number=10;
      
         fib(number);
   } 
 
    public static void fib(int number) {
    	int a= 0;
    	int b= 1;
    	if(number>=1){
    	for (int i=0;i<number;i++){
    		a=a+b;  		
    		b=a-b;
    		System.out.print(a+",");	
    	}
    	System.out.println("END");
    	}
    	else{
    		System.out.println("Invalid Input");
    	}
	}

 
        private static long fib1(int n) {
            if (n <= 1) return n;
            else return fib1(n-1) + fib1(n-2);
        }

        
           public static void secondFib(int n){
            for (int i = 1; i <= n; i++)
                System.out.println(i + ": " + fib1(i));
        }

    
}