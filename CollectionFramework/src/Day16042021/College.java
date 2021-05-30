package Day16042021;
import java.util.*;

public class College
{
	List l = new ArrayList();
	
	public List m1()
	{
		
		Scanner sc = new Scanner(System.in);
		Student1 s= new Student1();
		
		System.out.println("Enter the rollno of 1st std");
		s.setRollno(sc.nextInt());
		
		System.out.println("Enter the Name of 1st std");
		s.setName(sc.next());
		l.add(s);
		
		s= new Student1();
		
		System.out.println("Enter the rollno of 2st std");
		s.setRollno(sc.nextInt());
		
		System.out.println("Enter the Name of 2st std");
		s.setName(sc.next());
		
		l.add(s);
		
		return l;
		

	}
}
