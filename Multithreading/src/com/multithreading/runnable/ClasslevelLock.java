package com.multithreading.runnable;

class ClasslevelLock implements Runnable
{
	
		   @Override
		   public void run()
		   {
		      classLock();
		   }
		   // used static synchronized for class level lock
		   
		   public  void classLock() 
		   {
		      System.out.println(Thread.currentThread().getName());
		      //Or
		     synchronized(ClasslevelLock.class) 
		     {
		      System.out.println("Synchronized block " +Thread.currentThread().getName());
		      System.out.println("Synchronized block " +Thread.currentThread().getName() + " end");
		      }
		   }
		   

		   public static void main(String[] args)
		   {
		      ClasslevelLock test1 = new ClasslevelLock();
		      Thread t1 = new Thread(test1);
		      Thread t2 = new Thread(test1);
		      ClasslevelLock test2 = new ClasslevelLock();
		      Thread t3 = new Thread(test2);
		      
		      t1.setName("t1");
		      t2.setName("t2");
		      t3.setName("t3");
		      t1.start();
		      t2.start();
		      t3.start();
		   }
}


