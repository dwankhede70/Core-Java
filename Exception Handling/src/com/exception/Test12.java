package com.exception;

public class Test12
 {
		public void m1() throws ClassNotFoundException
		{
			System.out.println("m1___A3__Start");
			Test13 b=new Test13();
			b.m2();
			System.out.println("m1____A3___End");
		}
		public static void main(String[] args)
		{
			System.out.println("main _____start");
			Test12 a=new Test12();
			//handle Exception here.
				try 
				{
					a.m1();
				} catch (ClassNotFoundException e) 
				{
					System.out.println("m1--catch--block");
					//e.printStackTrace();
				}
			System.out.println("main ____End");
		}
	}
	

