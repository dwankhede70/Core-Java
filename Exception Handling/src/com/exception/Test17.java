package com.exception;

public class Test17 
{
		public void m2() throws ArithmeticException
		{
			System.out.println("B1_____m2 Start");
			int a=10/0;
			System.out.println(a);
			System.out.println("B1_____m2 End");
		}
	}

