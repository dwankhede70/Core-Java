package Day21042021;

import java.util.Scanner;
import java.util.Set;
import java.util.*;


public class Test1 
{
	public static void main(String[] args) 
	{
		
		Employee e1 = new Employee();
		e1.setEid(2);
		e1.setEname("Gaju");
		
		Employee e2 = new Employee();
		e2.setEid(1);
		e2.setEname("Shubham");
		
		Employee e3 = new Employee();
		e3.setEid(3);
		e3.setEname("Dhyana");
		
		Employee e4 = new Employee();
		e4.setEid(5);
		e4.setEname("Rahul");
		
		Employee e5 = new Employee();
		e5.setEid(4);
		e5.setEname("Virat");
		
		Set<Employee> ee = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("=======Select your Choice========");
		System.out.println("1.EidSort");
		System.out.println("2.EnameSort");
		int ch=sc.nextInt();
		
		if(ch==1)
		{
			ee=new TreeSet<>(new EidSort());
		}
		
		else if(ch==2)
		{
			ee=new TreeSet<>(new EnameSort());
		}
		ee.add(e1);
		ee.add(e2);
		ee.add(e3);
		ee.add(e4);
		ee.add(e5);
		
		for(Employee emp : ee)
		{
			System.out.println(emp.getEid());
			System.out.println(emp.getEname());
		}
	}
}
