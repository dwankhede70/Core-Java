package multhread;

public class Test2
{
	public static void main(String[] args) 
	{
//=================================================================
//		when we create Thread by implementing Runnable interface 
//=================================================================
		
		oddNumber od1=new oddNumber(1,50);
		oddNumber od2=new oddNumber(101,150);
	
		evenNumber evn1=new evenNumber(2,50);
		evenNumber evn2=new evenNumber(100,150);
		
		Thread t1 = new Thread(od1);
		Thread t2 = new Thread(od2);
		Thread t3 = new Thread(evn1);
		Thread t4 = new Thread(evn1);
		
		t1.setName("odd1");
		t2.setName("odd2");
		
		t3.setName("even1");
		t4.setName("even2");
		
		t1.start();
		t2.start();
		
		t3.start();
		t4.start();
		
//=================================================================
//		when we extends our own class By Thread
//=================================================================			
//		oddNumber od1=new oddNumber(1,50);
//		oddNumber od2=new oddNumber(101,150);
//	
//		evenNumber evn1=new evenNumber(2,50);
//		evenNumber evn2=new evenNumber(100,150);
	
//		od1.start();
//		od2.start();
//		evn1.start();
//		evn2.start();
//		
		
	}
}
