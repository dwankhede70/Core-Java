package com.exception;

public class Test18 
{
			public void m1()
			{
				System.out.println("m1____A1");
				Test19 b=new Test19();
				b.m2();
				System.out.println("m1____A1___End");
			}
			
			public static void main(String[] args)
			{
				System.out.println("main _____start");
				Test18 a=new Test18();
				//handle exceptoin here
				try
				{
					a.m1();
				}
				catch(ArithmeticException e)
				{
					System.out.println("main catch");
					System.out.println("main ____End");
				}
				
			}
		}
		