package Day16042021;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.collection.Student;

public class Test 
{
	public static void main(String[] args) 
	{
		List l = new ArrayList();
		Scanner sc= new Scanner(System.in);
		Student s = new Student();
		
		System.out.println("Enter roll no of 1st = ");
		int x=sc.nextInt();
		s.setRollno(x);
		
		System.out.println("Enter name of 1st student = ");
		String ss=sc.next();
		s.setName(ss);
		
		System.out.println("Enter a Address of Student 1");
		String a=sc.next();
		s.setAddr(a);
		l.add(s);
		

		Student s1 = new Student();
		System.out.println("Enter roll no of 2nd = ");
		int x1=sc.nextInt();
		s1.setRollno(x1);
		
		System.out.println("Enter name of 2nd student = ");
		String ss1=sc.next();
		s1.setName(ss1);
		
		System.out.println("Enter a Address of 2nd Student ");
		String a1=sc.next();
		s1.setAddr(a1);
		l.add(s1);
		
		
		Student s2 = new Student();
		System.out.println("Enter roll no of 3rd = ");
		int x2=sc.nextInt();
		s2.setRollno(x2);
		
		System.out.println("Enter name of 3rd student = ");
		String ss2=sc.next();
		s2.setName(ss2);
		
		System.out.println("Enter a Address of 3rd Student ");
		String a2=sc.next();
		s2.setAddr(a2);
		l.add(s2);
		
		
		Iterator itr = l.iterator();

		while (itr.hasNext()) {
			Student s4 = (Student) itr.next();
			System.out.println("Roll no =" + s4.getRollno());
			System.out.println("Name is =" + s4.getName());
			System.out.println("Name is =" + s4.getAddr());
		}

	}
}
