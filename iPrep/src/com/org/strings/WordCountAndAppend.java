package com.org.strings;

import java.util.HashMap;
import java.util.Map;

public class WordCountAndAppend {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s ="My name name name  name is Maanasa";
		System.out.println(WordCount(s));

	}

	public static String WordCount(String s) {		
		String[] words = s.toLowerCase().split("\\s+");		
		StringBuffer sb = new StringBuffer();
		Map<String, Integer> wordCounts = new HashMap<String, Integer>();
		for (String word : words) {
		    Integer count = wordCounts.get(word);
		    if (count == null) {
		        count = 0;
		    }
		    wordCounts.put(word, count+1);
		    sb.append(word);
		    sb.append(count+1);
		    sb.append(" ");
		    
		}
		return sb.toString();	
	}

}
