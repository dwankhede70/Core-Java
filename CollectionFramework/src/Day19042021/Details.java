package Day19042021;

import java.util.*;

public class Details 
{
	List<Employee> l = new ArrayList<Employee>();
	public List setData()
	{
		Employee e = new Employee();
		e.setEmpid(111);
		e.setEmpname("Rahul");	
		e.setEmpdesig("Engineer");
		e.setEmpsalary(25000.00);
		
		Employee e1 = new Employee();
		e1.setEmpid(122);
		e1.setEmpname("Mayuri");	
		e1.setEmpdesig("Fill Stack Engineer");
		e1.setEmpsalary(45000.00);
		
		Employee e2 = new Employee();
		e2.setEmpid(133);
		e2.setEmpname("Akshay");	
		e2.setEmpdesig("Software Engineer");
		e2.setEmpsalary(35000.00);
		
		
		l.add(e);
		l.add(e1);
		l.add(e2);
		
		return l;
	}
	
	public List getData()
	{
		Iterator itr = l.iterator();
		while(itr.hasNext())
		{
			Employee emp1 = (Employee)itr.next();
			System.out.println("Employee Id    ="+emp1.getEmpid());
			System.out.println("Name           ="+emp1.getEmpname());
			System.out.println("Designination  ="+emp1.getEmpdesig());
			System.out.println("Salary         ="+emp1.getEmpsalary());
		}
		return l;
		
	}

}
