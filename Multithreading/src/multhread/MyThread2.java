package multhread;

public class MyThread2 extends Thread
{
	
		Table t;

		public MyThread2(Table t) 
		{
			super();
			this.t = t;
		}
		public void run()
		{
			t.printTable(25);
		}
		
	}

