package com.exceptionthrow;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test2 {
	public void m2() throws FileNotFoundException, ArithmeticException {
		FileInputStream f = new FileInputStream("abc.txt");

	}

	public void m1() throws ArithmeticException {
		try {
			m2();

		} catch (FileNotFoundException e) {
			System.out.println("file--catch--block ");
			int a = 10 / 0;

		}
	}

	public static void main(String[] args) {
		Test2 t = new Test2();
		try {
			t.m1();
		} catch (ArithmeticException e) {
			System.out.println("Arithmatic--catch--block");
		}
	}

}
