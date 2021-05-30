package com.exceptionthrow;

public class A1 
{
	public void votingValide(int age) throws AgeInvalidException1 
	{
		
	
		System.out.println("person is valid or invalid for voting when age = " +age);
		if(age<18) {
		
		//AgeInvalidException1 e = new AgeInvalidException1();
		//throw e;
			//or
			throw new AgeInvalidException1();
		}
		else 
		{
			System.out.println("person is valide for voting");
			System.out.println("voting successfully completed");
		}
		
	}
	public static void main(String[] args) {
		A1 a=new A1();
		try {
			a.votingValide(20);
		} catch (AgeInvalidException1 e) 
		{
			System.out.println(e.getMessage());
			System.out.println("voting unsuccess");

		}
	}
}
