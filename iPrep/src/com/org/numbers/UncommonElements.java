package com.org.numbers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class UncommonElements {

	/**
	 * Given two sorted linked list, create a third list which contains only those elements of first list, 
	 * which are not common with second list....can anyone suggest me hw to do this?
	 */
	public static void main(String[] args) {
		int[] a1= {1,3,5,7,8,10};
		int[] a2= {1,0,5,7,6,2};
	//output shud be 3,8 ,10
		findUncommonFirstSet(a1, a2);
		

	}

	public static void findUncommonFirstSet(int[] a1, int[] a2) {
		HashSet<Integer> hs= new HashSet<Integer>();
		for(int i=0;i<a2.length;i++){
			hs.add(a2[i]);//add elements of array 2 into hashset
		}
		for(int j=0;j<a1.length;j++){		
			if(hs.add(a1[j])){//now if u try to add second array and if it passes those are the unique values
				System.out.println("Uncommon: "+a1[j]);
				
			}
		}
		
		}


}
