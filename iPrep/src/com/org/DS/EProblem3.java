package com.org.DS;


import java.util.HashSet;

public class EProblem3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n=13195;
		primeFactors(n);
		System.out.println(6%2);
	}
    public static void primeFactors(int n){
    	System.out.println("---->"+6%4);
    	HashSet<Integer> s= new HashSet<Integer>();
    	for (int i=2;i<n;i++){
    		if(n%i==0){
    			s.add(i);
    			System.out.println(i);
    		}
    		
    	}
    }
}
