package com.slogic;

import java.util.*;

public class countCharacter 
{
public static void main(String[] args) 
{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the String");
	String str =s.nextLine();
	int count = 0;
	
	for(int i=0;i<str.length();i++)
	{
		count++;
	}
	System.out.println(count);
	
	}
}
