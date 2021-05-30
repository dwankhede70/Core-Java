package com.exception;


	 class A3 
	 {
		public void m1() throws ClassNotFoundException 
		{
			System.out.println("m1___A3__Start");
			B3 b=new B3();
			b.m2();
			System.out.println("m1____A3___End");
		}
		public static void main(String[] args) throws ClassNotFoundException
		{
			System.out.println("main _____start");
			A3 a=new A3();			
			a.m1();
			System.out.println("main ____End");
		}
	}
	 class B3 {
		public void m2() throws ClassNotFoundException 
		{
			System.out.println("B3_____m2 Start");
			Class.forName("Demmo.java");
			System.out.println("B3_____m2 End");
		}
	}



