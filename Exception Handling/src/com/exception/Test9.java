package com.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test9 
{
	public void m1()
	{
		m2();
	}
	public void m2()
	{
		try
		{
			m3();
		} catch (FileNotFoundException e)
		{
			System.out.println("Catch block");
			//e.printStackTrace();
		}	
	}
	public void m3() throws FileNotFoundException 
	{
		FileReader f=new FileReader("abc.txt");
	}
	public static void main(String[] args) 
	{
		Test9 a=new Test9();
		a.m1();
	}

}
