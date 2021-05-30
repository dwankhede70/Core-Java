package com.exception;

public class Test7 {

	public static void main(String[] args) 
	{
		int x=Test7.myMethod();
	    System.out.println(x);  
	      }
	   @SuppressWarnings("finally")
	public static int myMethod()
	   {
	      try 
	      {
	        return 112;
	      }
	      finally 
	      {
	        System.out.println("This is Finally block");
	        System.out.println("Finally block run even after return statement");
	        return 188;
	      }
	   }
}
	
