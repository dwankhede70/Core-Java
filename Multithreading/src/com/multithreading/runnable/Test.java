package com.multithreading.runnable;

import multhread.NumberG;

public class Test 
{
	public static void main(String[] args) throws InterruptedException
	{
		NumberG odd = new NumberG(1, 100);
		
		NumberG even = new NumberG(2, 100);
		
		 Thread t1 = new Thread(odd);
		 Thread t2 = new Thread(even);
		 
		 t1.setName("odd");
		 t2.setName("even");
		 
		 t1.start();
		 
		 t1.join();
		 
		 t2.start();
	}
}
