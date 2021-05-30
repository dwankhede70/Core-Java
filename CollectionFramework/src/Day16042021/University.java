package Day16042021;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class University 
{
public static void main(String[] args)
	{
	
	College c = new College();
	List l=c.m1();
	
	 Iterator itr = l.iterator();
	 while(itr.hasNext())
	 {
		 Student1 s1 =(Student1) itr.next();
		 System.out.println("Roll no of stu       =" +s1.getRollno());
		 System.out.println("Name of stu          =" +s1.getName());
	 }
	
	}
}
