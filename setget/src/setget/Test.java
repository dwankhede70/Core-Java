package setget;

public class Test {

	public static void main(String [] args)
	{
	Student s1 = new Student();
		s1.setRollno(1);
		s1.setName("Shubham");

	Student s2 = new Student();
		s2.setRollno(2);
		s2.setName("Gaju");

	System.out.println(s1.getRollno());
	System.out.println(s1.getName());
	System.out.println(s2.getRollno());
	System.out.println(s2.getName());
	}
	}



