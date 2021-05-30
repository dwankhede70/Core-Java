package com.exception;

public class Test4
{
	public int m1()
	{
		System.out.println("m1----method");
		 int x=10;
	
	try
		{
		System.out.println("try---start");
		return x;
		}
	finally
		{
		System.out.println("finally---block");
		}
	
	}
	public static void main(String[] args) 
		{
		System.out.println("Main---start");
		Test4 t= new Test4();
		int x=t.m1();
		System.out.println(x);
		}
		
}


