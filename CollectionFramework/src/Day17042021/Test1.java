package Day17042021;

import java.util.*;

public class Test1 
{
	public static void main(String[] args)
	{
	Emp e= new Emp(111,"Shubham");
	Emp e1= new Emp(112,"Gaju");
	Emp e2= new Emp(113,"Dhanya");

	List l = new ArrayList();
	l.add(e);
	l.add(e1);
	
	List l1 = new ArrayList();
	l1.addAll(l);
	l1.add(e2);
	
	
// 1st approach to retrive the dada by using iterator
	
	Iterator itr = l1.iterator();
	while(itr.hasNext())
	{
	Emp e3 = (Emp) itr.next();
	System.out.println("Employee Id    = "+e3.eid);
	System.out.println("Employee Name  = "+e3.ename);
	System.out.println("============================");
	}
//==========================================================

//      2nd approach to retrive the dada by using for-each loop and instanceOf() method
	
//		for(Object o : l1)
//		{
//			if(o instanceof Emp)
//			{
//				Emp ee=(Emp) o;
//				System.out.println("Employee Id      = "+ee.eid);
//				System.out.println("Employee Name    = "+ee.ename);
//				System.out.println("============================");
//			}
//		
//		}
//==========================================================


	}
}
