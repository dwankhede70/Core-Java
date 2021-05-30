package com.exception;
//
//public class Test {
//
//}
////From gajanan gadekar to Everyone:  06:06 PM
////nhi sir
////program nhi dile
////From Dnyaneshwar Jaybhay to Everyone:  06:09 PM
////Q1. What is Exception in java? Drow the hierarchy of it.
////Q2. What is Exception handling?
////Q3. Diffrence between exception and error in java.
////Q4. What is checked exception and unchecked exception.
////Q5. Diiference between checked exception and unchecked exception.
////Q6. How to resolve the abnormal termination of the program? Explain       	with example and rules.
//
//
//From gajanan gadekar to Everyone:  06:06 PM
//nhi sir
//program nhi dile
//From Dnyaneshwar Jaybhay to Everyone:  06:10 PM
//Q1. What is Exception in java? Drow the hierarchy of it.
//Q2. What is Exception handling?
//Q3. Diffrence between exception and error in java.
//Q4. What is checked exception and unchecked exception.
//Q5. Diiference between checked exception and unchecked exception.
//Q6. How to resolve the abnormal termination of the program? Explain       	with example and rules.
//Q7. What will be the output of the program. 




//public class A{
//	public static void main(String[] args) {
//		System.out.println("main__________start");
//			A a=null;
//			System.out.println(a.toString());		    				System.out.println("main___________end");
//	}
//}
//
//Q8. What will be the output of the program.
//public class A {
//public static void main(String[] args) {
//	A a=null;
//	System.out.println("main__________start");
//	try{
//		System.out.println("Try------------start");
//		System.out.println(a.toString());
//		System.out.println("Try--------------End");
//	}
//	catch(NullPointerException e){
//		System.out.println("catch block");
//	}
//	System.out.println("main___________end");
//	}
//}
//
//Q9. What will be the output of the program.
//public class A {
//public static void main(String[] args) {
//	A a=null;
//	System.out.println("main__________start");
//	try{
//		System.out.println("Try------------start");
//		System.out.println(a.toString());
//		System.out.println("Try--------------End");
//	}
//	catch(ArithmeticException e){
//		System.out.println("catch b



//===========================================================//

//public class Test
//{
//	public static void main(String[] args)
//	{
//		System.out.println("main__________start");
//			Test a=null; //java.lang.NullPointerException: Cannot invoke "Object.toString()" because "a" is null
//			System.out.println(a.toString());
//			System.out.println("main___________end");
//	}
//}
//===========================================================//
//public class Test {
//public static void main(String[] args) {
//	Test a=null;
//	System.out.println("main__________start");
//	try{
//		System.out.println("Try------------start");
//		System.out.println(a.toString());
//		System.out.println("Try--------------End");
//	}
//	catch(NullPointerException e){
//		System.out.println("catch block");
//	}
//	System.out.println("main___________end");
//	}
//}
//

//==========================================================//

//public class Test {
//public static void main(String[] args) {
//	Test a=null;
//	System.out.println("main__________start");
//	try{
//		System.out.println("Try------------start");
//		System.out.println(a.toString());
//		System.out.println("Try--------------End");
//	}
//	catch(NullPointerException e){
//		System.out.println("catch block");
//	}
//	System.out.println("main___________end");
//	}
//}

//main__________start
//Try------------start
//Exception in thread "main" java.lang.NullPointerException:

//=========================================================//

//Q10. What will be the output of the program.
//public class Test {
//public static void main(String[] args) {
//	Test a=null;
//	System.out.println("main__________start");
//	try{
//		System.out.println("Try------------start");
//		System.out.println(a.toString());
//		System.out.println("Try--------------End");
//	}
//	catch(Exception e){
//		System.out.println("catch block");
//	}
//	System.out.println("main___________end");
//	}
//}
//


//public class Test
//{
//	public static void main(String[] args) 
//	{
//		try 
//		{
//		String s=null;
//		System.out.println(s.length());
//		}
//		catch(NullPointerException e)
//		{
//			System.out.println("Catch block");
//		}
//	}
//}


//public class Test
//{
//	public static void main(String[] args) 
//	{
//		try 
//		{
//		String s="abc";
//		int i=Integer.parseInt(s);
//		}
//		catch(NumberFormatException e)
//		{
//			System.out.println("catch block");
//		}
//	}
//}

























































