package com.org.strings;

public class ReplaceAllOccurences {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String s= "Rian is cranky today so amma is also cranky phew ";
		//s=s.replaceAll(" ", "-");
		ReplaceAllOccurences(s);
		System.out.println(s);
	

	}

	private static String ReplaceAllOccurences(final String s) {
		int count=0;
		char[] charspace = s.toCharArray();
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)== ' '){
				count++;
			}
			
		}
		int newLength = s.length()+count*2;
		charspace[newLength]= '\0';
		for(int j=s.length()-1;j>=0;j--){
			if(charspace[j]== ' '){
				charspace[newLength-1] = '0';
				charspace[newLength-1] = '2';
				charspace[newLength-1] = '%';
				newLength=newLength-1;
			}
			else{
				charspace[newLength-1]=charspace[j];
				newLength=newLength-1;
			}
		}
		
		return s;	
		
	}


}
