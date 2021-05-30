package com.exception;

public class Test10 
 {
		public void m1() 
		{
			System.out.println("m1___A3__Start");
			Test11 b=new Test11();
			//handle exception here
			try
			{
				b.m2();
			} 
			catch (ClassNotFoundException e)
			{
				System.out.println("m2--catch--block");
				//e.printStackTrace();
			}
			System.out.println("m1____A3___End");
		}
		public static void main(String[] args)
		{
			System.out.println("main _____start");
			Test10 a=new Test10();			
			a.m1();
			System.out.println("main ____End");
		}
	}
	


