
package swapping;
import java.util.*;
public class A {
	public void m1()
	{
	int x,y,t ;
	Scanner sc = new Scanner (System.in);
	System.out.println("enter the values of x & y");
	x=sc.nextInt();
	y=sc.nextInt();
	System.out.println("values before swapping" +x+" " +y);
	t=x;
	x=y;
	y=t;
	System.out.println("values after swapping" +x+" " +y);
	}

	public static void main(String[] args) {
		A a=new A();
		a.m1();
	}
}
		
			
			
		// TODO Auto-generated method stub



