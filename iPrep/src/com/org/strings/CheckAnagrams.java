package com.org.strings;

public class CheckAnagrams {

	public static void main(String args[]){
		String first="ianR";
		String second = "Rian ";
		System.out.println("GIven words are: "+checkAnagrams(first,second) +" Anagrams");
	}

	private static boolean checkAnagrams(String first, String second) {
		int sum1 = 0,sum2=0;
		boolean isAnagram=false;
		char[] firstCharArray = first.trim().toLowerCase().toCharArray();
		char[] secondCharArray= second.trim().toLowerCase().toCharArray();
		for (int i=0; i<firstCharArray.length;i++){
		sum1=sum1+firstCharArray[i];	
		}
		for (int j=0; j<secondCharArray.length;j++){
			sum2=sum2+secondCharArray[j];			
		}
		System.out.println("Sum1: "+ sum1);
		System.out.println("Sum2: "+ sum2);
		if(sum1==sum2){
			isAnagram= true;	
		}
		
		return isAnagram;
	}
	
	
}
