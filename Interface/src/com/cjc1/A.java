package com.cjc1;

import java.util.Scanner;

public class A 
{
	public static void main(String[] args) 
	{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter choice");
	int a= s.nextInt();
	
	switch(a)
	{
	case 1 :
		System.out.println("Today is Sunday");
		break;
	case 2 :
		System.out.println("Today is monday");
		break;
	case 3 : 
		System.out.println("Today is thursday");
		break;
	case 4 : 
		System.out.println("Today is wednesday");
		break;
	case 5 : 
		System.out.println("Today is Tuesday");
		break;
	case 6 :
		System.out.println("Today is Friday");
		break;
	case 7 :
		System.out.println("Today is Saturday");
	}
	}
	
}

