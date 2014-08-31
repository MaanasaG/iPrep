package com.org.DS;

public class StackDupe {

	/**
	 * @param args
	 */
	int top;
	int[] newstack;
	int maxsize;
	public StackDupe(int max){
		top =-1;
		maxsize=max;
		newstack = new int[max];
	}
	public void push(int i ){
		newstack[++top]=i;
		//System.out.println("pushed--->"+i);
	}
	public int pop(){
		
		//System.out.println("Popeddd--->"+newstack[top--]);
		System.out.println(top);

		return newstack[top--];
	}
	
	
	public static void main(String[] args) {
		StackDupe s = new StackDupe(10);
		
	    s.push(10);
	    s.push(40);
	    s.push(50);
	    s.push(70);
	    s.push(20);
	    s.push(80);
	    
	    System.out.println(s.pop());


	}
	
	

}
