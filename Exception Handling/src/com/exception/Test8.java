package com.exception;
//////

//////import java.util.Scanner;
//////
//////public class Test8
//////{
//////	public static void main(String[] args) 
//////	{
//////		Scanner s = new Scanner(System.in);
//////		System.out.println("provide the division value");
//////		int n=s.nextInt();
//////		try
//////		{
//////		System.out.println(10/n);
//////		System.out.println("shubham".charAt(7));
//////		}
//////		catch(ArithmeticException e)
//////		{
//////			System.out.println("Arithmatic catch block");
//////		}
//////		catch(StringIndexOutOfBoundsException e)
//////		{
//////			System.out.println("String catch block");
//////		}
//////		System.out.println("Rest of the code");
//////		
//////	}
//////
//////}
////
////
////From Dnyaneshwar Jaybhay to Everyone:  11:33 AM
////Q1. What is the purpose of throws keyword?
////Q2. Explain difference between try-catch and throws keyword with example.
////Q3. Check the code for throws keyword.
////
////}
////Q1. What is the purpose of throws keyword?
////Q2. Explain difference between try-catch and throws keyword with example.
////Q3. Check the code for throws keyword.
////public class A {
////	public void m1(){
////		m2();
////	}
////	public void m2(){
////		m3();	
////	}
////	public void m3() throws FileNotFoundException {
////		FileReader f=new FileReader("abc.txt");
////	}
////	public static void main(String[] args) {
////		A a=new A();
////		a.m1();
////	}
////}
////
////Q4. Complete the code without handling exception and write the output of the program.
////public class A3 {
////	public void m1() {
////		System.out.println("m1________A3_____Start");
////		B3 b=new B3();
////		b.m2();
////		System.out.println("m1
//
//
//
//
//
//
//
//public class A3 {
//	public void m1() {
//		System.out.println("m1___A3__Start");
//		B3 b=new B3();
//		b.m2();
//		System.out.println("m1____A3___End");
//	}
//	public static void main(String[] args){
//		System.out.println("main _____start");
//		A3 a=new A3();			
//		a.m1();
//		System.out.println("main ____End");
//	}
//}
//public class B3 {
//	public void m2() {
//		System.out.println("B3_____m2 Start");
//		Class.forName("Demmo.java");
//		System.out.println("B3_____m2 End");
//	}
//}
//
//Q5. Complete the code with handling exception and write the output of the program 
//public class A3 {
//	public void m1() {
//		System.out.println("m1___A3__Start");
//		B3 b=new B3();
//		b.m2();
//		System.out.println("m1____A3___End");
//	}
//	public static void main(String[] args){
//		System.out.println("main _____start");
//		A3 a=new A3();
//		//handle Exception here.
//			a.m1();
//		System.out.println("main ____End");
//	}
//}
//public class B3 {
//	public void m2() {
//		System.out.println("B3_____m2 Start");
//		Class.forName("A");
//		System.out.println("B3_____m2 End");
//	}
//}
//
//Q6. Complete the code with and without handling exception, what will be the output of the program?
//public class A4 {
//		public void m1() {
//			System.out.println("m1___A4__Start");
//			B4 b=new B4();
//			b.m2();
//			System.out.println("m1____A4___End");
//		}
//		public static void main(String[] args){
//			System.out.println("main _____start");
//			A4 a=new A4();
//			//handle exception here
//				a.m1();
//			System.out.println("main ____End");
//		}
//	}
//public class B4 {
//		public void m2() {
//			System.out.println("B4____m2__ Start");
//			String s=null;
//			System.out.println(s.length());
//			System.out.println("B4____m2__ End");
//		}
//}
//
//Q7. Complete the code with handling exception and write the output of the program 
//public class A1 {
//	public void m1(){
//		System.out.println("m1____A1");
//		B1 b=new B1();
//		//Handle Exception Here
//		b.m2();
//		System.out.println("m1____A1___End");
//	}
//	public static void main(String[] args){
//		System.out.println("main _____start");
//		A1 a=new A1();
//		a.m1();
//		System.out.println("main ____End");
//	}
//}
//public class B1 {
//	public void m2(){
//		System.out.println("B1_____m2 Start");
//		int a=10/0;
//		System.out.println(a);
//		System.out.println("B1_____m2 End");
//	}
//}
//
//Q8. Complete the code with handling exception and write the output of the program .
//public class A2 {
//	public void m1(){
//		System.out.println("m1____A1");
//		B2 b=new B2();
//		b.m2();
//		System.out.println("m1____A1___End");
//	}
//	
//	public static void main(String[] args){
//		System.out.println("main _____start");
//		A2 a=new A2();
//		//Handle Exception Here
//			a.m1();
//		System.out.println("main ____End");
//	}
//}
//public class B2 {
//	public void m2(){
//		System.out.println("B2_____m2 Start");
//		int i=10/0;
//		System.out.println(i);
//		System.out.println("B2_____m2 End");
//	}
//

//package com.exception;
//
//class A3 {
//	public void m1()  {
//		System.out.println("m1___A3__Start");
//		B3 b = new B3();
//		b.m2();
//		System.out.println("m1____A3___End");
//	}
//
//	public static void main(String[] args) {
//		System.out.println("main _____start");
//		A3 a = new A3();
//		a.m1();
//		System.out.println("main ____End");
//	}
//}
//
//class B3 {
//	public void m2() throws ClassNotFoundException  {
//		System.out.println("B3_____m2 Start");
//		Class.forName("Demmo.java");
//		System.out.println("B3_____m2 End");
//	}
//}


//=============================================================


//public class Test8
//{
//	public static void main(String[] args) 
//	{
//		int a=1,b=10,c=1;
//		 if(( a & b || 0 ) || ( a && c && 0 ))
//		{
//			a=a+c;
//			b=b%3;
//		}
//		a=a<<1;
//		System.out.println(a+b-c);
//	}
//}
//

//==============================================================

//public class Test8
//{
//	public static void main(String[] args) 
//	{
//		int a=1;
//		int b=4;
//		 for(int c=6;c<=7;c++)
//		 {
//			 if(b-4)
//				 a=a+1;
//			 else
//			 {
//				 continue;
//				 a=a-2;
//			 }
//		 a=a+2;
//	}
//		System.out.println(a+b);
//	}
//}
//
//
//



















