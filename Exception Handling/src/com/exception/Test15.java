package com.exception;

public class Test15 
{
		public void m2() throws NullPointerException 
		{
			System.out.println("B4____m2__ Start");
			String s=null;
			System.out.println(s.length());
			System.out.println("B4____m2__ End");
		}
	}
	
