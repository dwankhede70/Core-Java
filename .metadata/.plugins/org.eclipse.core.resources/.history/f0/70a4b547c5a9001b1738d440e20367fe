package com.multithreading.callable;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer>
{
	int st,end,s;

	public MyCallable(int st, int end) {
		super();
		this.st = st;
		this.end = end;
	}

	@Override
	public Integer call() throws Exception 
	{
		for(int i=st;i<end;i++)
		{
			s=s+i;
			System.out.println("Callable===");
			i++;
			Thread.sleep(300);
		}
		return s;
	}

}
