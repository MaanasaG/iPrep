package com.org.searching;

public class BinarySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int item=10;
	       int index=-1;
	       int[] list={3,4,7,9,10,11,15,18};
	       int low=1;
	       int high=list.length;
	       int mid;
	       while(high>=low){
	    	   mid=(low+high)/2;
	    	   if(item>list[mid]){
	    		   //so its in second half of list
	    		   low=mid;
	    		   }
	    		   else if(item<list[mid]){
	    		   high=mid;
	    		   }
	    		   else{
	    			   //found it!
	    			   index=mid;	   
	    		       }
	    	   }
	       System.out.print("found it! @"+index);
	       }
	      
	}


