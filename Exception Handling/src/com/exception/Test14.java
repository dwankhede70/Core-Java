package com.exception;

public class Test14
{
	public void m1() 
	{
		System.out.println("m1___A4__Start");
		Test15 b=new Test15();
		b.m2();
		System.out.println("m1____A4___End");
	}
	public static void main(String[] args)
	{
		System.out.println("main _____start");
		Test14 a=new Test14();
		//handle exception here
		try
		{
			a.m1();
		}
		catch(NullPointerException e)
		{
			System.out.println("main--catch--block");
			System.out.println("main ____End");
		}
		
	}
}
