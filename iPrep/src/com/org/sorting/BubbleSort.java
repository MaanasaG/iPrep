package com.org.sorting;

public class BubbleSort {

	/**
	 * for i is 0 to array.len-1
	 * for j is i+1 to array.len-1-i
	 * 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		int[] A={3,9,1,6,28,5};	
		for (int i=0;i<A.length-1;i++){
			for (int j=0;j<A.length-1-i;j++){
				if( A[j]>A[j+1]){		
				int	temp=A[j+1];
					A[j+1]=A[j];
					A[j]=temp;		
				}
				
			}
		}
		for (int k=0;k<A.length;k++){
			System.out.print(A[k]+",");
		}
	}
	
}
