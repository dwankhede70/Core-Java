package com.exception;

public class C1
{
	public static void main(String[] args) 
	{
		//A1 a=new A1();
		
		try {
			System.out.println(10.5f/0);
		//a.m1();
		}
		catch (Exception e) {
			System.out.println("catch block");
			 System.out.println("shubham".charAt(9));
			System.exit( 0);
	}
		finally
		{
			System.out.println("finally block ");
			int[] a= {10,20,30,40,50};
			System.out.println(a[4]);
			
		}


}
}

