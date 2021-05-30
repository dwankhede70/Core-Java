package pack;

public class A {
	public void m1() {
		System.out.println("m1--A");
	}
	public void m2() {
		m1();
		System.out.println("m2--A");
		
	}
	public void m3() {
		m2();
		System.out.println("m3--A");
		
	}
}
