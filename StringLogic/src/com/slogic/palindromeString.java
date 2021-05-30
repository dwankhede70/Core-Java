package com.slogic;

import java.util.*;

public class palindromeString
{
	public static void main(String[] args)
	{
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a string:");
     String  str = sc.nextLine();

     int x = str.length();
     String rev="";

     for ( int i =x-1; i>= 0; i-- )
     {
    	 rev = rev + str.charAt(i);
     }
        if (str.equals(rev))
        System.out.println("Enter String is palindrome =" +str);
     else
        System.out.println("Enter String is not a palindrome =" +str);
     
	}
}