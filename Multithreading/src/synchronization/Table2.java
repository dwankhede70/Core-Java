package synchronization;

public class Table2 
{
	public void m2()
	{
		for (int i = 0; i < 5; i++)
		{
		System.out.println(i);	
		}
	}
}
class Mythread3 extends Thread
{
	public void run()
	{
		Table2 t = new Table2();
		t.m2();
	}
}
class Mythread4 extends Thread
{
	public void run()
	{
		Table2 t = new Table2();
		t.m2();
	}
}