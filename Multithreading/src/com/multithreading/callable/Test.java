package com.multithreading.callable;

import java.util.concurrent.*;

public class Test 
{
	public static void main(String[] args) throws InterruptedException, ExecutionException
	{
		MyCallable odd = new MyCallable(1, 20);
		
		MyCallable even = new MyCallable(2, 20);
		
	
		ExecutorService e = Executors.newFixedThreadPool(2);
		
		Future<Integer> fr1 = e.submit(odd);
		Future<Integer> fr2 = e.submit(even);
		
//		
		System.out.println(fr1.get());
		System.out.println(fr2.get());
		
	}
}
