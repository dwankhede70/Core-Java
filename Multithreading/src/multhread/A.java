package multhread;

//import java.awt.desktop.ScreenSleepEvent;

public class A 
{
	public void m1()
	{
		for(int i=0;i<=20;i++)
		{
			System.out.println("m1===A");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void m2()
	{
		for(int i=0;i<=20;i++)
		{
			System.out.println("m2===A");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
