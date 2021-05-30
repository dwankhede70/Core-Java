package com.braindatawire.collegemanagement.ServiceImpl;

@SuppressWarnings("serial")
public class NameInvalidException extends Exception
{
	public NameInvalidException()
	{
		super();
		System.out.println("Enter valid Name");
		
		
	}
}
