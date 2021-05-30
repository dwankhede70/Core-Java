package synchronization;

public class Test 
{
	public static void main(String[] args) 
	{
		Hello h = new Hello();
		MyThread t1 = new MyThread(h, "Java");
		MyThread t2 = new MyThread(h, "classes");
		
		t1.start();
		t2.start();
		
		
		Hello h1 = new Hello();
		MyThread t3 = new MyThread(h1, "CJC");
		MyThread t4 = new MyThread(h1, "Pune");
		
		t3.start();
		t4.start();
		
	}
}
