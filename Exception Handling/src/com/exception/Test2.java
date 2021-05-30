	package com.exception;
	
	public class Test2
	{
	
		public static void main(String[] args)
		{
			System.out.println("Main---Start");
			try
			{
				System.out.println("try---start");
				int a=10/0;
				System.out.println("Try---end");
			}
			catch(ArithmeticException e)
			{
				System.out.println("catch---block");
			}
			finally
			{
				System.out.println("finally---block");
			}
			System.out.println("Main---end");
	
		}
	
	}
