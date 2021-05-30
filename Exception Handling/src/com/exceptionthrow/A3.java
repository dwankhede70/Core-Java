package com.exceptionthrow;

import java.util.Scanner;
public class A3 
{
	public void div(int a, int b) throws InputInvalidException 
	{
		if (b == 0) 
		{
			InputInvalidException e = new InputInvalidException("Not use Input value of b is Zero");
			throw e;
		} else 
		{
			int c = a / b;
			System.out.println("Division is :" + c);
		}

	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter values of a & b");
		int a = s.nextInt();
		int b = s.nextInt();
		A3 l = new A3();
		try 
		{
			l.div(a,b);
		} catch (InputInvalidException e) 
		{

			System.out.println(e.getMessage());
		}
	}

}
