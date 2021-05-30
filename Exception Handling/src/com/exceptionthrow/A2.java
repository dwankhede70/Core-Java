package com.exceptionthrow;

public class A2 
{
	public void evenNo(int n) throws InvalidEvenNoException
	{
		if(n%2!=0) {
		
			InvalidEvenNoException e= new InvalidEvenNoException("Invalid even No");
			throw e;
		}
		else 
		{
			System.out.println("No is even No");
		}
		
	}
	public static void main(String[] args) {
		A2 a=new A2();
		try {
			a.evenNo(5);
		} catch (InvalidEvenNoException e) 
		{
			System.out.println(e.getMessage());
			
		}
	}
}
