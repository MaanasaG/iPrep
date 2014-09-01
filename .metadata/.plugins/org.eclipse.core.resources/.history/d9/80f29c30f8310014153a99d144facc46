package com.org.numbers;

import java.util.Arrays;
import java.util.HashSet;

public class SumofTwo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] input={6,7,8,9,1,16,2,4,3,14,13,4,5,12,32,44};
		int sum=16;
		findTheOther(input,sum);
		
	}
	static int findTheOther(int[] input,int sum){
		int l=0;
		int r=input.length-1;
        Arrays.sort(input);
        if (input.length>2){
		while(l<r){
			
			if(input[l]+input[r]==sum){
			System.out.println("l"+input[l]);		
			System.out.println("r"+input[r]);
			return l;
			}	
			else if(input[l]+input[r]>sum){
				r--;
			}
			else{
				l++;
			}
			
		}
        }
		
		
		
		return l;
		
	}


public static void secondWay(int[] a,int k)
{
HashSet<Integer> hashSet=new HashSet<Integer>();
for(int i =0 ; i<a.length; i++)
{
if(hashSet.contains(k-a[i])){
	 System.out.println("inside--->hashset"+(k-a[i]));
     System.out.println(a[i]+","+(k-a[i]));
                 }
    hashSet.add(a[i]);
    System.out.println(a[i]+" is added to hashset");
  }
 }
}



