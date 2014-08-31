package com.org.DS;

import java.io.IOException;
import java.io.StringWriter;
import java.lang.Object;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFromConsole {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) {
		
		Scanner input;
		String accept;
		int i=0;
		List<String> data = new ArrayList<String>();			
		do{
		input = new Scanner(System.in);
		System.out.println("Write what you want to write, leave blank to exit");
		accept = input.nextLine();
		int c=0;
		
		for(int l=0;l<accept.length();l++){
			if(accept.charAt(l)==','){
				c++;
			}	
			  System.out.println(c); 
		 }
		    if (accept.length() > 0) { 
		    	   if(c==3){
		            data.add(accept);
		            System.out.println("Added to list"); 
		            data.add("\n");
		            i++;
		    	    }
		    	  else{
		    		  System.out.println("Please enter valid input"); 
		    	     }
		           } else { 
		   			System.out.println("break");
		            break;
		                }
		
	}while(true);
		java.util.Iterator<String> itr = data.iterator();
		System.out.println("Iterating through ArrayList elements...");
		while(itr.hasNext())
		System.out.println(itr.next());
		
		StringWriter writer = new StringWriter();
		//IOUtils.copy(inputStream, writer, encoding);
		String theString = writer.toString();

        
    }

	
}

