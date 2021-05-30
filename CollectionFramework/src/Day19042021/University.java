package Day19042021;
import java.util.*;
public class University 
{
	public static void main(String[] args)
	{
	
	College c = new College();
	List<Student>l=c.m1();
//==================================================================	
//	 Iterator<Student> itr = l.iterator();
//	 while(itr.hasNext())
//	 {
//		 Student s1 = itr.next();
//		 System.out.println("Roll no of stu       =" +s1.getRollno());
//		 System.out.println("Name of stu          =" +s1.getName());
//	 }
//==================================================================	
	
	for(Student s :l)
	{
	System.out.println("Roll no of stu       =" +s.getRollno());
	System.out.println("Name of stu          =" +s.getName());
	}

}
}
