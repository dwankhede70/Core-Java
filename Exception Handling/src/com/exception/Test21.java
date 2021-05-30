package com.exception;

	public class Test21 extends Test20{
		//First scenario for unchecked
		@Override
		public void m1(){
			System.out.println("m1--override--method");
			
		}
		
		//Second scenario for unchecked
		@Override
		public void m3(){
			System.out.println("m3--override--method");
		}
		
		//Third scenario for unchecked
		@Override
		public void m5() throws NullPointerException{
			System.out.println("m5--override--method");
		}
		
		//Fourth scenario for unchecked
		@Override
		public void m7(){
			System.out.println("m7--override--method");
		}
		
		//fiftth scenario for unchecked
		 @Override
		 public void m9(){
			 System.out.println("m9--override--method");
		}
		 public static void main(String[] args) throws Exception {
			 Test20 t = new Test21();
			 t.m1();
			 t.m3();
			 t.m5();
			 t.m7();
			 t.m9();
			
		}
		}


