package multhread;

public class NumberG1 extends Thread
{
	int start;
	int end;
	
	public void m1(int start,int end)
	{
		this.start=start;
		this.end=end;
	}
	public void run()
	{
		for(int i=start;i<end;i++)
		{
		System.out.println(i);
		i++;
		}
	}
}
