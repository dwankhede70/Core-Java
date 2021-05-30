package com.exception;

public class Test1 
{	
		public static void main(String[] args) 
		{
			System.out.println("main----start");
			
			try
			{
				String s= args[0];
				int x=Integer.parseInt(s);
				int a=10/x;
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Enter the value---");
			}
			catch(NumberFormatException e)
			{
				System.out.println("Enter No");
			}
			catch(ArithmeticException e)
			{
				System.out.println("Enter non zero");
			}
		}

}
 // String s="xyz";
//String s1="10";