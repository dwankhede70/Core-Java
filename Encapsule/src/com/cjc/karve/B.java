package com.cjc.karve;
import com.cjc.pune.*;

public class B {
	public void m1() {
	 A a = new A();
	 a.setA(10);
	 a.setB(20);
	System.out.println(a.getA());
	System.out.println(a.getB());
	
}
	public static void main(String[] args) { 
		 B b = new B();
		 b.m1();
	}
}