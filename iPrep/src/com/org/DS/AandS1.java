package com.org.DS;

public class AandS1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str= "Maanasa";
		System.out.println(AlluniqueCheck(str));
		

	}

	public static boolean AlluniqueCheck(String str) {
		boolean[] charset= new boolean[128];
		for(int i=0;i<str.length();i++){
			int val=str.charAt(i);
			System.out.println(str.charAt(i)+"--"+val);
			if(charset[val]){				
				return false;		
			}
			charset[val]=true;
		}
		return true;
	}

}
