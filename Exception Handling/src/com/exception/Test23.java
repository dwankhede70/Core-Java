package com.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Test23 extends Test22{
		//First Scenario for checked
		@Override
		public void m2()throws IOException{
			System.out.println("m2--override--method");
		}

		//Second scenario for checked
		@Override
		public void m4()throws IOException{
			System.out.println("m4--override--method");
		}

		//Third scenario for checked
		@Override
		public void m6()throws FileNotFoundException{
			System.out.println("m6--override--method");
		}

		//Fourth scenario for checked
		@Override
		public void m8()throws FileNotFoundException{
			System.out.println("m8--override--method");
		}

		//fifth scenario for checked
		 @Override
		public void m10()throws IOException{
			 System.out.println("m10--override--method");
		}
		 public static void main(String[] args) throws IOException {
			Test22 t=new Test23();
			t.m2();
			t.m4();
			t.m6();
			t.m8();
			t.m10();
		}
	}



