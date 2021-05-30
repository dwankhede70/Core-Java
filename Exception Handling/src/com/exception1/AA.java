package com.exception1;

public class AA 
{
	public void m1(int age) throws AgeInvalideException
	{
		System.out.println("m1--start");
		if(age<18)
		{
			AgeInvalideException e = new AgeInvalideException("Age problem");
			throw e;
		}
		else
		{
			System.out.println("welcome to vote");
		}
		System.out.println("m1--end");
	}
	public static void main(String[] args) {
		System.out.println("main--start");
		AA a= new AA();
		try
		{
			a.m1(-5);
		}
		catch(AgeInvalideException e)
		{
			System.out.println("catch--block--" +e.getMessage());
		}
		System.out.println("main--end");
	}

}
