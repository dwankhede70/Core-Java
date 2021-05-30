package synchronization;


 class Table1
{
	 	public synchronized void m1()
	 	{
	 		for (int i = 0; i < 5; i++)
	 		{
				//System.out.println("Table1===");
				System.out.println(i+ " " +Thread.currentThread().getName());
			}
	 	}
}
class MyThread11 extends Thread
{
	public void run() 
	{
		Table1 t = new Table1();
		t.m1();
	}
}

class MyThread12 extends Thread
{
	public void run() 
	{
		Table1 t = new Table1();
		t.m1();
	}
}

public class Test1
{
	public static void main(String[] args) 
	{
		
		MyThread11 t1 = new MyThread11();
		t1.setName("MyThread11===");
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		MyThread12 t2 = new MyThread12();
		t2.setName("MyThread12===");
		t2.start();
		 
	
	}
}