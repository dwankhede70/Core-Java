package pack;

public class Test {
	public static void main(String[] args) {
		Student s = new Student(12,"Shubham","ExTC",22);
		Student s1 = new Student(13,"Rahulbhau","ExTC",23);
		Student s2 = new Student(14,"Gajubhau","ExTC",24);

		System.out.println("Data of 1st Student");
		System.out.println("Roll no is :" +s.rollno);
		System.out.println("Name of Studnet:" +s.name);
		System.out.println("Branch name :" +s.branch);
		System.out.println("Age is :" +s.age);
		System.out.println("");
		System.out.println("Data of 2nd Student");
		System.out.println("Roll no is :" +s1.rollno);
		System.out.println("Name of Studnet:" +s1.name);
		System.out.println("Branch name :" +s1.branch);
		System.out.println("Age is :" +s1.age);
		System.out.println("");
		System.out.println("Data of 3rd Student");
		System.out.println("Roll no is :" +s2.rollno);
		System.out.println("Name of Studnet:" +s2.name);
		System.out.println("Branch name :" +s2.branch);
		System.out.println("Age is :" +s2.age);
	}

}
