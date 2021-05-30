package multhread;

public class B extends Thread
{
	public void run()
	{
		A a = new A();
		if(currentThread().getName().equals("first"))
		{
			a.m1();
			
		}
		else
			a.m2();
		
	}
}
