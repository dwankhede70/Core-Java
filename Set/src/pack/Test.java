package pack;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee e = new Employee();
	e.setEid(12);
	e.setEname("shubham");
	e.setEaddress("pune");
	
	Employee e1 = new Employee();
	e1.setEid(13);
	e1.setEname("Gaju");
	e1.setEaddress("pune");
	System.out.println(e.getEid());	
	System.out.println(e.getEname());
	System.out.println(e.getEaddress());
	
	System.out.println(e1.getEid());	
	System.out.println(e1.getEname());
	System.out.println(e1.getEaddress());
	}

}
