package com.org.numbers;

public class Euclids {

	public static void main(String[] args) {
		System.out.println(euclidsalgo(8,38));
	}

	public static int euclidsalgo(int i, int j) {
		
		if(j==0)return i;	
		return euclidsalgo(j,i%j);	
	}
}
