package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
//Q7. Write the program to add String into the list and retrieve element at 4th index.

//public class Test4 
//{
//	public static void main(String[] args) 
//	{
//		List l= new ArrayList();
//		l.add("abc");
//		l.add("pqr");
//		l.add("xyz");
//		l.add("abc");
//		l.add("lmn");
//		l.add("str");
//		System.out.println(l.get(4));//lmn
//	}
//}
//=========================================================================
//Q8. Write the program to add String into the list and retrieve all elements without using 
//loop and with using loop of iterator.

//public class Test4 
//{
//	public static void main(String[] args) 
//	{
//		List l = new ArrayList();
//		l.add("abc");
//		l.add("pqr");
//		l.add("xyz");
//		l.add("abc");
//		l.add("lmn");						
//		l.add("str");
//		System.out.println(l.get(0));
//		System.out.println(l.get(1));
//		System.out.println(l.get(2));
//		System.out.println(l.get(3));
//		System.out.println(l.get(4));
//========================================================================		
/*		abc
		pqr
		xyz
		abc
		lmn
*/
//======================================================================== 
//		Iterator itr = l.iterator();
//		
//		while(itr.hasNext())
//		{
//			String s=(String) itr.next();
//			System.out.print(s+ " ");// abc pqr xyz abc lmn str
//		}
//		
//	}
	
//}
//=========================================================================

//Q9. Write the program to add 11f, 12.34f, 13.34f, 14.11f, 15.8f, 16f all this element
//into the list and retrieve this element by using iterator.

//public class Test4 
//{
//	public static void main(String[] args) 
//	{
//		List l = new ArrayList();
//		l.add(11f);
//		l.add(12.34f);
//		l.add(13.34f);
//		l.add(14.11f);
//		l.add(15.8f);
//		l.add(16f);
//		
//		Iterator itr = l.iterator();
//		
//		while(itr.hasNext())
//		{
//		float s=(float) itr.next();
//			System.out.print(s+ " ");// 11.0 12.34 13.34 14.11 15.8 16.0
//		}
//		
//	}
//	
//}
//=========================================================================
//Q10. Write the program to add 33.3, 22.39d, 19.03, 97.23d, 78.1, 16d 
//all this element into the list and retrieve this element by using iterator.

//public class Test4 
//{
//	public static void main(String[] args) 
//	{
//		List l = new ArrayList();
//		l.add(33.3);
//		l.add(22.39d);
//		l.add(19.03);
//		l.add(97.23d);
//		l.add(78.1);
//		l.add(16d);
//		
//		Iterator itr = l.iterator();
//		
//		while(itr.hasNext())
//		{
//		double s= (double) itr.next();
//			System.out.print(s+ " ");// 33.3 22.39 19.03 97.23 78.1 16.0
//		}
//		
//	}
//	
//}
//
//==========================================================================

//Q11. Write the program to add Character into the list and 
//retrieve all elements using iterator.

//public class Test4 
//{
//	public static void main(String[] args) 
//	{
//		List l = new ArrayList();
//		l.add('a');
//		l.add('b');
//		l.add('c');
//		l.add('d');
//		l.add('e');
//		l.add('f');
//		
//		Iterator itr = l.iterator();
//		
//		while(itr.hasNext())
//		{
//		char s= (char) itr.next();
//			System.out.print(s+ " ");// a b c d e f
//		}
//		
//	}
//	
//}
//
//===========================================================================

//Q12. Write the program to give the integer input from keyboard and 
//add into the list, retrieve using iterator.

//public class Test4 
//{
//	public static void main(String[] args) 
//	{
//		Scanner s= new Scanner(System.in);
//		System.out.println("Enter the size of ArrayList ");
//		int n = s.nextInt();
//		System.out.println("Enter the integer values");
//		List l = new ArrayList();
//		for( int i=0;i<n;i++)
//		{
//			int x=s.nextInt();
//			l.add(x);
//		}
//		Iterator itr = l.iterator();
//		
//		while(itr.hasNext())
//		{
//		int s1=(int) itr.next();
//			System.out.print(s1+ " ");
//		}
//		
//	}
//	
//}
//===========================================================================
/*
 Enter the size of ArrayList 
5
Enter the integer values
12
45
78
78
45
12 45 78 78 45 
 */

//====================================================================

//Q13. Write the program to give the String input from keyboard and 
//add into the list, retrieve using iterator.

//public class Test4 
//{
//	public static void main(String[] args) 
//	{
//		Scanner s= new Scanner(System.in);
//		System.out.println("Enter the size of ArrayList ");
//		int n = s.nextInt();
//		System.out.println("Enter the string data");
//		List l = new ArrayList();
//		for( int i=0;i<n;i++)
//		{
//			String x=s.next();
//			l.add(x);
//		}
//		Iterator itr = l.iterator();
//		
//		while(itr.hasNext())
//		{
//			String s1=(String) itr.next();
//			System.out.print(s1+ " ");
//		}
//		
//	}
//	
//}
//========================================================================
/*
 Enter the size of ArrayList 
5
Enter the string data
abc
pqr
xyz
mno
rst
abc pqr xyz mno rst 
 */

//========================================================================



























































