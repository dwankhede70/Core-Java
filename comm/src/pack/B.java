package pack;

	public class B {
	public void m4() {
		A a=new A();
		a.m3();
		System.out.println("m4--B");
	}
	public void m5() {
		m4();
		System.out.println("m5--B");
		
	}
}
