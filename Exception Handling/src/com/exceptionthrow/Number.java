package com.exceptionthrow;

public class Number
{
			public void getNumber(int i) throws ZeroInputException 
			{
				//Write the custom exception here.
				ZeroInputException e = new ZeroInputException();
				throw e;
			}
		
			public static void main(String[] args)
			{
				Number num = new Number();
				//Handle exception and print exception msg here
			     	 try {
			     		
						num.getNumber(0);
					} catch (ZeroInputException e) {
						System.out.println(e.getMessage());
						
					}
			}
}
			  
		
	

