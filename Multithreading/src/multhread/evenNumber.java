package multhread;

public class evenNumber implements Runnable
{
	int start;
	int end;
	
	public evenNumber(int start,int end)
	{
		this.start=start;
		this.end=end;
	}
	public void run()
	{
		for(int i=start;i<end;i++)
		{
		System.out.println(i+ " " +Thread.currentThread().getName());
		i++;
		try 
		{
			Thread.sleep(2000);
		} catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	}
}
