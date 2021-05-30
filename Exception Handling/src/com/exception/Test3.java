package com.exception;
//
//public class Test3 
//{
//		public static void main(String[] args)
//		{
//			System.out.println("Main --------------Start");
//			try
//			{
//				System.out.println("try___________start");
//				int i=Integer.parseInt("123");
//				System.out.println(i);
//				System.out.println("try___________end");
//			}
//			catch(NumberFormatException e)
//			{
//				System.out.println("catch block");
//			}
//			finally
//			{
//				System.out.println("finally block");
//			}
//			System.out.println("Main --------------End");
//		}
//	}
//
//
//From Dnyaneshwar Jaybhay to Everyone:  10:37 AM
//Q1. What is the purpose of finally block?
//Q2. What will be the output of the program.
//     public class A {
//	public static void main(String[] args) {
//		System.out.println("Main --------------Start");
//		try{
//			System.out.println("try___________start");
//			int i=Integer.parseInt("123");
//			System.out.println(i);
//			System.out.println("try___________end");
//		}
//		catch(NumberFormatException e){
//			System.out.println("catch block");
//		}
//		finally{
//			System.out.println("finally block");
//		}
//		System.out.println("Main --------------End");
//	}
//}
//Q1. What is the purpose of finally block?
//Q2. What will be the output of the program.
//     public class A {
//	public static void main(String[] args) {
//		System.out.println("Main --------------Start");
//		try{
//			System.out.println("try___________start");
//			int i=Integer.parseInt("123");
//			System.out.println(i);
//			System.out.println("try___________end");
//		}
//		catch(NumberFormatException e){
//			System.out.println("catch block");
//		}
//		finally{
//			System.out.println("finally block");
//		}
//		System.out.println("Main --------------End");
//	}
//}

//==============================================================
//public class Test3
//{
//	public static void main(String[] args) 
//	{
//		System.out.println("Main --------------Start");
//		try{
//			System.out.println("try___________start");
//			int i=Integer.parseInt("12,3");
//			System.out.println(i);
//			System.out.println("try___________end");
//		}
//		catch(NumberFormatException e){
//			System.out.println("catch block");
//		}
//		finally{
//			System.out.println("finally block");
//		}
//		System.out.println("Main --------------End");
//	}
//}

//==============================================================
//Q4. Check the program correct or not, then complete the program.
//public class Test3
//{
//	public static void main(String[] args){
//		try{
//			String s=null;
//			System.out.println(s.length());
//		}
//		catch(NullPointerException e)
//		{
//			System.out.println("catck block");
//		}
//	}
//}
//==============================================================

//public class Test3
//{
//public static void main(String[] args) {
//    try{
//	int i=10/0;
//	System.out.println(i);
//    }
//    catch(ArithmeticException e){
//    		System.out.println("catch block");
//    }
//    finally
//    {
//    		System.out.println("finally block");
//    }
//}
//}
//=========================================================
//Q6. What will be the output.
//public class Test3
//{
//public static void main(String args[])
//{
// System.out.println("Main------------Start");
// try{
//    	System.out.println("Try____Start");
//    	int i=45/0;
//    	System.out.println(i);
// }
// catch(ArrayIndexOutOfBoundsException e)
// {
//    	System.out.println("Catch _________Block");
// }
// finally
// {
//    	System.out.println("finally block");
// }
// System.out.println("Main------------End");
//}
//}

//Q7. Check the program correct or not. If yes what will be the output.
public class Test3
{
	public static void main(String[] args)
	{
      try
      {
		int i=10/0;
		String s=null;
		System.out.println(i);
		
        }
      catch(ArithmeticException e)
      		{
      		System.out.println("arithmatic catch block");
			}
      try
      {
    	  String s=null;
  		System.out.println(s.length());
      }
	  catch(NullPointerException e)
      		{
			System.out.println("null catch block");
      		}
      finally
      		{
          		System.out.println("finally block");
          	}
       }
   }






















































