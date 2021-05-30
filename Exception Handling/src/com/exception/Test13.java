package com.exception;

public class Test13 
{
		public void m2() throws ClassNotFoundException
		{
			System.out.println("B3_____m2 Start");
			Class.forName("A");
			System.out.println("B3_____m2 End");
		}
	}


