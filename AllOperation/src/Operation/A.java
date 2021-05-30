package Operation;

 class A {
	 
	 int x=10;
	 int y=5;
	 public void add(int a,int b)
	 {
		 int c= a+b;
		 System.out.println("Addition is:" +c);
	 }
	A()
	{
		this(10);
		System.out.println("0-args constructor");
	}
	A(int x)
	{
		System.out.println("1-args constructor");
	}
	public void add(float a,double b)
	 {
		 double d= a+b;
		 System.out.println("Addition is:" +d);
	 }
	}
 class B extends A

 {
	 public void disp()
	 {
	 System.out.println(super.x + super.y);
 	}
 	public void add(float a,double b)
 	{
	 double d= a+b+10;
	 System.out.println("Addition is:" +d);
 	}
}
	class C extends B
{
	private int rollno;
	private String name;
	public void setRollno(int rollno)
{
	this.rollno=rollno;
}
	public void setName(String name)
{
	this.name=name;
}
	public int getRollno()
	{
		return rollno;
	}
	public String  getName()
	{
		return name;
		
	}
	class D extends C
	{  
		int p;
		String q;
		public void setData()
		{
			C a= new C();
			a.setRollno(12);
			a.setName("shubham");
			D d= new D();
			d.p=a.getRollno();	
			d.q=a.getName();
		}
	}
	/*class E extends D
	{
		public void m1(Object o)
		{
			System.out.println("m1--E");
		}
		public void m1(String s)
		{
			System.out.println("m1--E");	
		}
		public void m1(D a)
		{
			System.out.println("m1--E");	
		}
	}*/
	
	class E extends D 
	{
		public void m2()
		{
			System.out.println("static method");
		}

	}
}
	