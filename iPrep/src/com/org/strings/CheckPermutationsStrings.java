package com.org.strings;

public class CheckPermutationsStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str1="god";
		String str2="dog3";
		System.out.println(checkPermutations( str1, str2));

	}

	private static boolean checkPermutations(String str1, String str2) {
		if(str1.length()!=str2.length()){
			return false;
		}
		return sort(str1).equals(sort(str2));
	}

	private static String sort(String str1) {
		char[] input=str1.toCharArray();
		java.util.Arrays.sort(input);
		return new String(input);
		
	}

}
