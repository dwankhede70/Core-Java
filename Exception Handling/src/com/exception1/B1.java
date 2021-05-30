package com.exception1;

import java.io.FileNotFoundException;

public class B1 extends A1 {
	public void m4() throws FileNotFoundException {
		System.out.println("m4--override-method");
	}
public static void main(String[] args) {
		B b = new B();
		b.m4();
		}

}
