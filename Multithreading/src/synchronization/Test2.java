package synchronization;

class Table22
{
	 	public void m2(int n)
	 	{
	 		for (int i = 1; i <=5; i++) 
	 		{
			System.out.println(n*i);	
			}
	 		synchronized(this) // block level lock
	 		{
	 		for (int i = 0; i < 5; i++)
	 		{
	 			try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println( i+ " "  + Thread.currentThread().getName());
			}
	 		}
	 	}
}
class MyThread13 extends Thread
{
	public void run() 
	{
		Table22 t = new Table22();
		t.m2(5);
	}
}

class MyThread14 extends Thread
{
	public void run() 
	{
		Table22 t = new Table22();
		t.m2(10);
	}
}

public class Test2 
{
	public static void main(String[] args) 
	{
		
		MyThread13 t3 = new MyThread13();
		t3.setName("MyThread13====");
		t3.setPriority(Thread.MIN_PRIORITY);
		t3.start();
		System.out.println(t3.isAlive());
		
		try {
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		MyThread14 t4 = new MyThread14();
		t4.setName("MyThread14====");
		t4.setPriority(Thread.MAX_PRIORITY);
		t4.start();
		System.out.println(t4.isAlive());
		
		
	
	}
}
