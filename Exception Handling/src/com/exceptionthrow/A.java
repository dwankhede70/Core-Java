package com.exceptionthrow;

public class A 
{
	public static void main(String[] args) 
	{
		System.out.println("main--start");
		
		//ArithmeticException e = new ArithmeticException();
		//throw e;
		//or
		throw new ArithmeticException();
	}
}
