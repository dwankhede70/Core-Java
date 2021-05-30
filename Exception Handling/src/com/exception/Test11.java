package com.exception;

public class Test11

	{
		public void m2() throws ClassNotFoundException 
		{
			System.out.println("B3_____m2 Start");
			Class.forName("Demmo.java");
			System.out.println("B3_____m2 End");
		}
	}


