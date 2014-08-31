package com.org.strings;

public class Palendrome {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String input=null;
	//if(palendrome(input)){
	//	System.out.println("Yes, your input is palendrome");
	//}
	//else{
	//	System.out.println("No, your input is not palendrome");
	//}	
	palendromeNum(2345);
	}
	
	public static boolean palendrome(String input){
			
		boolean b=false;
		if(input!=null&&input.length()>0){
			char[] c=input.toCharArray();
		for (int i=0;i<input.length();i++){
			//System.out.println("c[i]"+c[i]);
			//System.out.println("c[input.length()-i-1]"+c[input.length()-i-1]);
			if(c[i]==c[input.length()-i-1]){
				b=true;				
			}
			else {
				b=false;
				
				  }
		     }		
		}
		return b;		
	}
	public static boolean palendromeNum(int num){
	     //use modulus operator to strip off the last digit
       
       int reversedNumber=0;
       while(num>0){
    	   System.out.println("--->num"+num);

    	   int temp = num%10;
    	   System.out.println("--->temp"+temp);
           System.out.println("--->reversedNumber"+reversedNumber);

        //create the reversed number
        reversedNumber = reversedNumber * 10 + temp;
        num = num/10;
        System.out.println(reversedNumber);
       }
		return true;
	}
	
}
