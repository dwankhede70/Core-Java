package com.exceptionthrow;

import java.util.Scanner;

public class Test1 
{
	static void validate(int age) throws InvalidAgeException
	{
		
		if(age<18)
		{
			throw new InvalidAgeException("Sorry,you are not eligible");
		
		}
		else
		{
			System.out.println("Welcome,you are eligible for voting");	
		}
		
	}
	public static void main(String[] args)
	{
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter your age");
		int age=s.nextInt();
		try {
			Test1.validate(age);
		
		}
		catch (InvalidAgeException e) 
		{
			System.out.println("catch block--" +e.getMessage());
		}
		
		
	}
	
}
