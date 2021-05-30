package Day20042021;

import java.util.*;

public class Test 
{
	public static void main(String[] args) 
	{
		Set<Student> s = new TreeSet<>();
	
		Student s1 = new Student();
		s1.setRollno(2);
		s1.setName("Gajubhau");
		
		Student s2 = new Student();
		s2.setRollno(1);
		s2.setName("Shubhambhau");
		
		Student s3 = new Student();
		s3.setRollno(3);
		s3.setName("Dhyanabhau");
		
		s.add(s1);
		s.add(s2);
		s.add(s3);
		
		for(Student stu : s)
		{
			System.out.println(stu.getRollno());
			System.out.println(stu.getName());
		}
}
}