package multhread;

public class Testt 
{
	public static void main(String[] args)
	{
		B  b = new B();
		b.setName("first");
		b.start();
		
		B  b1 = new B();
		b1.setName("second");
		b1.start();
	}
}
