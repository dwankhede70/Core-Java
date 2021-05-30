package multhread;

public class Test 
{
	public static void main(String[] args)
	{
		NumberG odd = new NumberG(1, 100);
		odd.setName("Thread name = odd");
		NumberG even = new NumberG(2, 100);
		even.setName("Thread name = even");
		odd.start();
		even.start();
	}
}
