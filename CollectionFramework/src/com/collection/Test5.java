package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//public class Test5 
//{
//	public static void main(String[] args) 
//	{
//	Student s1 = new Student();
//	s1.setRollno(12);
//	s1.setName("Shubham");
//	
//	Student s2 = new Student();
//	s2.setRollno(13);
//	s2.setName("Gaju");
//	
//	List l = new ArrayList();
//	l.add(s1);
//	l.add(s2);
//	
//	Iterator itr = l.iterator();
//	
//	while(itr.hasNext())
//	{
//		Student s=(Student) itr.next();
//		System.out.println("Roll no =" +s.getRollno());
//		System.out.println("Name is =" +s.getName());
//	}
//	
//	}
//}
/*
 Roll no =12
Name is =Shubham
Roll no =13
Name is =Gaju

 */
//============================================================================

public class Test5 {
	public static void main(String[] args) {
		List l = new ArrayList();
		Student s1 = new Student();
		s1.setRollno(12);
		s1.setName("Shubham");
		l.add(s1);

		s1 = new Student();
		s1.setRollno(13);
		s1.setName("Gaju");
		l.add(s1);

		Iterator itr = l.iterator();

		while (itr.hasNext()) {
			Student s = (Student) itr.next();
			System.out.println("Roll no =" + s.getRollno());
			System.out.println("Name is =" + s.getName());
		}

	}
}

/*
 * Roll no =12 
 * Name is =Shubham 
 * Roll no =13 
 * Name is =Gaju
 * 
 */
