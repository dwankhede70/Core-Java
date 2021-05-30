package com.exceptionthrow;

import java.util.Scanner;

public class Test 
{

	static void validate(int age)
	{
		if(age>18)
		{
		System.out.println("you are eligible for voting");	
		}
		else
		{
			throw new ArithmeticException("Sorry,you are not eligible");
		}
	}
	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter your age");
		int age=s.nextInt();
		try {
		Test.validate(age);
		}
		catch (Exception e) {
			System.out.println("Exception handle here");
		}
		System.out.println("Rest of the code");
	}
	
}
