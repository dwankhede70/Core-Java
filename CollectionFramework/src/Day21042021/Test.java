package Day21042021;

import java.util.*;

public class Test
{
	public static void main(String[] args) 
	{
		
		
		Student s1 = new Student();
		s1.setRollno(2);
		s1.setName("ccc");
		
		Student s2 = new Student();
		s2.setRollno(1);
		s2.setName("bbb");
		
		Student s3 = new Student();
		s3.setRollno(3);
		s3.setName("aaa");
		
		Set<Student> sset=null;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("=======Select your Choice========");
		System.out.println("1.RollnoSort");
		System.out.println("2.NameSort");
		int ch=sc.nextInt();
		if(ch==1)
		{
			sset=new TreeSet<>(new RollnoSort());
		}
		
		else if(ch==2)
		{
			sset=new TreeSet<>(new NameSort());
		}
		
		sset.add(s1);
		sset.add(s2);
		sset.add(s3);
		
		
		for(Student stu:sset)
		{
			System.out.println(stu.getRollno());
			System.out.println(stu.getName());
		}
	}
}
