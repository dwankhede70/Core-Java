package com.exception1;

public class B extends A
{
	public void m4() 
	{
		System.out.println("m4--override-method");
	}
	public static void main(String[] args) {
		B b= new B();
		b.m4();
	}
}