package com.exception;

public class A 
{
	public int m1()
	{
		System.out.println("m1---start");
		B b= new B();
		try
		{
			b.m2();
		}
		catch(ArithmeticException e)
		{
			System.out.println("catch--block");
			System.out.println("m1---end");
		}
		return 10;
	}
		public static void main(String [] args)
		{
			System.out.println("main---start");
			A a= new A();
			int x=a.m1();
			System.out.println(x);
			System.out.println("main---end");
		}
	}

