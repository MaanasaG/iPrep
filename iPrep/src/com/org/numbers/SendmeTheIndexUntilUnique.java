package com.org.numbers;

import java.util.Arrays;



public class SendmeTheIndexUntilUnique {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] input={2,5,7,8,1,2,3,4,5,8,9};
		int indexUntilUnique = findIndex(input);
    
	}

	private static int findIndex(int[] input) {
		int temp=0;
		Arrays.sort(input);
		for(int i=0; i<input.length;i++){
			for(int j=i+1; j<input.length;j++){			
			if(input[i]!=input[j]){
				System.out.println("--->i "+input[i]);
				System.out.println("--->j "+input[j]);
				temp= input[i+1];
				input[i+1]=input[j+1];
				input[j+1]=temp;
			}//if
			}//first for
			
		}//second for
		
		for(int k=0; k<input.length;k++){
			System.out.print("--->Final"+input[k]);
					
		}
		return 0;
	}

	

	
	
}
