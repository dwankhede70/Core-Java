package com.exception;


public class Test16 
{
	
		public void m1()
		{
			System.out.println("m1____A1");
			Test17 b=new Test17();
			//Handle Exception Here
			try 
			{
			b.m2();
			}
			catch(ArithmeticException e)
			{
			System.out.println("m1____catch___block");
			}
		}
		public static void main(String[] args)
		{
			System.out.println("main _____start");
			Test16 a=new Test16();
			a.m1();
			System.out.println("main ____End");
		}
	}
	