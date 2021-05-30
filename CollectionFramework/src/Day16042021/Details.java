package Day16042021;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Details 
{
	List l = new ArrayList();
	public List setData()
	{
		Employee e = new Employee();
		e.setEmpid(111);
		e.setEmpname("Shubham");	
		e.setEmpdesig("Software Engineer");
		e.setEmpsalary(45000.00);
		
		Employee e1 = new Employee();
		e1.setEmpid(122);
		e1.setEmpname("Gaju");	
		e1.setEmpdesig("Full Stack Engineer");
		e1.setEmpsalary(65000.00);
		
		Employee e2 = new Employee();
		e2.setEmpid(133);
		e2.setEmpname("Dhyana");	
		e2.setEmpdesig("Software Engineer");
		e2.setEmpsalary(50000.00);
		
		
		
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
