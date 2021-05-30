package Day20042021;

import java.util.Set;
import java.util.TreeSet;

public class Test5
{
	public static void main(String[] args) 
	{
		Set<Employee> e = new TreeSet<>();
	
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
		
		e.add(e1);
		e.add(e2);
		e.add(e3);
		e.add(e4);
		e.add(e5);
		
		for(Employee emp : e)
		{
			System.out.println(emp.getEid());
			System.out.println(emp.getEname());
		}
	}
}
