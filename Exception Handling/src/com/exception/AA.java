package com.exception;

//class AA {
//	public static void main(String[] args) {
//		try {
//			int a = 0;
//			System.out.println("a = " + a);
//			int b = 20 / a;
//			System.out.println("b = " + b);
//		}
//
//		catch (ArithmeticException e) {
//			System.out.println("Divide by zero error");
//		}
//
//		finally {
//			System.out.println("inside the finally block");
//		}
//	}
//}
//==============================================================


//class AA
//{
//	public static void main(String[] args)
//	{
//		try
//		{
//			int a[]= {1, 2, 3, 4};
//			for (int i = 1; i <= 4; i++)
//			{
//				System.out.println ("a[" + i + "]=" + a[i] + "n");
//			}
//		}
//		
//		catch (ArrayIndexOutOfBoundsException e)
//		{
//			System.out.println ("error = " + e);
//		}
//		
//		catch (Exception e)
//		{
//			System.out.println ("ArrayIndexOutOfBoundsException");
//		}
//	}
//}
//       a[1]=2n
//       a[2]=3n
//       a[3]=4n
//       error = java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4

//=============================================================

//
//class AA
//{
//	String str = "a";
//
//	void A()
//	{
//		try
//		{
//			str +="b";
//			B();
//		}
//		catch (Exception e)
//		{
//			str += "c";
//		}
//	}
//
//	void B() throws Exception
//	{
//		try
//		{
//			str += "d";
//			C();
//		}
//		catch(Exception e)
//		{
//			throw new Exception();
//		}
//		finally
//		{
//			str += "e";
//		}
//
//		str += "f";
//
//	}
//	
//	void C() throws Exception
//	{
//		throw new Exception();
//	}
//
//	void display()
//	{
//		System.out.println(str);
//	}
//
//	public static void main(String[] args)
//	{
//		AA object = new AA();
//		object.A();
//		object.display();
//	}
//
//}






























