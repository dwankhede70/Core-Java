package synchronization;

public class Hello 
{
//	when we want to execute one thread at a time and keep other thread 
// in wait state then we will used synchronized keyword
//	public synchronized void display(String msg)// Object Level Lock
//	{
//		System.out.println("[");
//		System.out.println(msg);
//		System.out.println("]");
//	}
	
//	public static synchronized void display(String msg)//class Level Lock
//	{
//		System.out.println("[");
//		System.out.println(msg);
//		System.out.println("]");
//	}
	
	public void display(String msg)
	
	{
		//synchronized(this) //Object level Lock
		synchronized(Hello.class) //class Level Lock
		{
		System.out.println("[");
		System.out.println(msg);
		System.out.println("]");
		}
	}
	
}
