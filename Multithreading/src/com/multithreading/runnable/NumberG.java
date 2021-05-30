package com.multithreading.runnable;

public class NumberG implements Runnable
{
	int st;
	int end;
	
	public NumberG(int st,int end)
	{
		this.st=st;
		this.end=end;
	}
	public void run()
	{
		for(int i=st;i<end;i++)
		{
		System.out.println(i+ " " +Thread.currentThread().getName());
		i++;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	}
}
