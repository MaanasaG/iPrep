package com.org.strings;

import java.util.HashSet;
import java.util.Set;

public class DuplicatedString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String input= "abracadabra";
           System.out.println(removeDuplicates(input));
		   firstNonRepeated(input);
	}

	 static char firstNonRepeated(String input) {
		Set<Character> seen = new HashSet<Character>();
		 
		  char output=0;
		  for (int i = 0; i < input.length(); ++i) {		  
		    char c = input.charAt(i);	    
		    System.out.println(c);
		    if (seen.add(c)) {
		    	 System.out.println("inside hashset"+seen);
		         output=c;
		    }
		  }
		  return output;
		}


	static String removeDuplicates(String input) {
		  Set<Character> seen = new HashSet<Character>();
		  StringBuilder result = new StringBuilder();
		  for (int i = 0; i < input.length(); ++i) {		  
		    char c = input.charAt(i);	    
		    System.out.println(c);
		    if (seen.add(c)) {
		    	 System.out.println("inside hashset"+seen);
		         result.append(c);
		    }
		  }
		  return result.toString();
		}

}
