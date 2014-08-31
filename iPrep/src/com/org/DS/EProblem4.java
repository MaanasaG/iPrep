package com.org.DS;

public class EProblem4 {

	    public static boolean isPalin(int num)
	    {
	        char[] val = (""+num).toCharArray();
	        for(int i=0;i<val.length;i++)
	        {
	            if(val[i] != val[val.length - i - 1])
	            {
	                return false;
	            }
	        }
	        return true;
	    }

	    public static void main(String[] args)
	    {
	        for(int i=999;i>100;i--)
	            for(int j=999;j>100;j--)
	            {
	                int mul = j*i;
	                if(isPalin(mul))
	                {
	                    System.out.printf("%d * %d = %d",i,j,mul);
	                    return;
	                }
	            }
	    }
	}