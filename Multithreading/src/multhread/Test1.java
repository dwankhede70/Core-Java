package multhread;

public class Test1
{
	public static void main(String[] args)
	{
		NumberG1 odd = new NumberG1();
		odd.m1(1,100);
		
		NumberG1 even = new NumberG1();
		even.m1(2,100);
		
		System.out.println("odd no start");
		odd.start();
		
		System.out.println("even no start");
		even.start();
	}
}
