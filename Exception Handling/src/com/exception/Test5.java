package com.exception;

public class Test5 
{
	public int m1()
	{
		System.out.println("m1---start");
		if(true)
		{
			return 10;
		}
		System.out.println("Hello----");
		return 20;
	}
	
	public static void main(String[] args)
	{
		System.out.println("Main---start");
		Test5 t= new Test5();
		int x=t.m1();
		System.out.println(x);
		
	}
}
