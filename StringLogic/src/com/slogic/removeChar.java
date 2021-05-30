package com.slogic;

public class removeChar 
{
	public static void main(String[] args) 
	{
		String s ="Shubham";
		System.out.println(charRemoveAt(s,5));
	}

	private static String charRemoveAt(String s, int i)
	{
		
		return s.substring(0,i)+s.substring(i+1);
	}
}
 