package Day19042021;


import java.util.*;

public class College 
{
List<Student> l = new ArrayList<Student>();
	
	public List m1()
	{
		
		Scanner sc = new Scanner(System.in);
		Student s= new Student();
		
		System.out.println("Enter the rollno of 1st std");
		s.setRollno(sc.nextInt());
		
		System.out.println("Enter the Name of 1st std");
		s.setName(sc.next());
		l.add(s);
		
		s= new Student();
		
		System.out.println("Enter the rollno of 2st std");
		s.setRollno(sc.nextInt());
		
		System.out.println("Enter the Name of 2st std");
		s.setName(sc.next());
		
		l.add(s);
		
		return l;
		

}
}
