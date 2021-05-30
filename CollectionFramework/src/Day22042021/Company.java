package Day22042021;

import java.util.*;

public class Company 
{
	public Map designation()
	{
		Map<Integer, Object> m = new HashMap<>();
		
		Employee e = new Employee();
		e.setEid(11);
		e.setEname("Shubham");
		e.setEsalary(40000.0);
		
		Employee e1 = new Employee();
		e1.setEid(12);
		e1.setEname("Gaju");
		e1.setEsalary(650000.0);
		
		Employee e2 = new Employee();
		e2.setEid(13);
		e2.setEname("Dhayna");
		e2.setEsalary(40000.0);
		
		Employee e3 = new Employee();
		e3.setEid(14);
		e3.setEname("Akshay");
		e3.setEsalary(45000.0);
		
		Employee e4 = new Employee();
		e4.setEid(15);
		e4.setEname("Ajay");
		e4.setEsalary(50000.0);
		
		m.put(1, e);
		m.put(2, e1);
		m.put(3, e2);
		m.put(4, e3);
		m.put(5, e4);
		
		return m;
		
	}
	public static void main(String[] args) 
	{
		
		
		
		Company c = new Company();
		
		Map m1 =c.designation();
		
		Set<Integer> emp = m1.keySet();
		
		System.out.println(emp);
		
		System.out.println("================");
		for (Integer keys : emp) 
		{
			System.out.println(keys);
			Employee emp1 =(Employee) m1.get(keys);
			System.out.println(emp1.getEid());
			System.out.println(emp1.getEname());
			System.out.println(emp1.getEsalary());
			System.out.println("==============");
		}
	}
	
}
