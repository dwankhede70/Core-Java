package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Student1 
{
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
//		List l= new ArrayList();
////		Statement stm=null;
//		Statement smt=null;
////		Class.forName("com.mysql.cj.jdbc.Driver");
////		
////		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/College", "root", "root");
////		
////		String Sql = "create table Student1(rollno int(10), name varchar(200), addr varchar(200), email varchar(200))";
////		System.out.println("Table Create Successfully");
////		stm = con.createStatement();
////		stm.execute(Sql);
//		
//		for(int i=1;i<=2;i++)
//		{
//		 @SuppressWarnings("resource")
//		//Scanner sc=new Scanner(System.in);
//		 Scanner sc1=new Scanner(System.in);
//	     System.out.println("Enter Rollno here=");
//	     //int rollno=sc1.nextInt();
//	     l.add(sc1.nextInt());
//	     System.out.println("Enter Name here=");
//	    // String name=sc1.next();
//	     l.add(sc1.next());
//	     System.out.println("Enter Addr here=");
//	     //String addr=sc1.next();
//	     l.add(sc1.next());
//	     System.out.println("Enter Email here=");
//	    // String email=sc1.next();
//	     l.add(sc1.next());
//	     
//	     System.out.println(l);
//	     
////	     String sql="insert into Student1 values("+l.get(0)+",'"+l.get(1)+"','"+l.get(2)+"','"+l.get(3)+"')";
////	    
////	     System.out.println(sql);
////	     
////	     
////	     
//	     
//	     
//	     
//		}
//		String sql=null;
//		int x=0;
//		Iterator itr=l.iterator();
//		while(itr.hasNext())
//		{
//			Object o=itr.next();
//			if(o instanceof Integer)
//			{
//				x=(int)o;
//				System.out.println(x);
//				
//				//System.out.println("========================");
//			}
//			sql  = "insert into Student1 values("+x+")";
//			System.out.println(sql);
//			smt =con.createStatement();
//			smt.execute(sql);
//			if(o instanceof String)
//			{
//				String s=(String)o;
//				System.out.println(s);
//				 sql  = "insert into Student1 values("+s+")";
//				 System.out.println(sql);
//				 smt =con.createStatement();
//					smt.execute(sql);
//				// System.out.println("========================");
//			}
//				
//		}
//		
//		smt.close();
//	    con.close();
		
//		Scanner sc = new Scanner(System.in);
//		//Scanner sc1 = new Scanner(System.in);
//		List l = new ArrayList();
//		for(int i =1; i<=2 ;i++) {
//			System.out.println("Enter the roll number:=");
//			int rollno = sc.nextInt();
//			System.out.println("Enter the Name :=");
//			String name = sc.next();
//			System.out.println("Enter the Addr :=");
//			String addr = sc.next();
//			System.out.println("Enter the Email :=");
//			String email = sc.next();
//			
//			l.add(rollno);
//			l.add(name);
//			l.add(addr);
//			l.add(email);
//		}
//		System.out.println(l);

		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/College","root","root");
//		
		String str = "create table StudentData( rollno int(10), name varchar(200), addr varchar(200), email varchar(200))";
//		
		Statement smt = con.createStatement();
//		
		smt.execute(str);
		System.out.println("create table successfully");
//		
//				
//		Iterator itr = l.iterator();
////		
//		
//		while(itr.hasNext())
//		{
//		   
//			Object st = itr.next();
////			
//			int rn=0;
//			String nm=null;
//			String adr=null;
//			String em=null;
//			for (Object object : l) {
//				
//				if(st instanceof Integer)
//				{
//					rn = (int) st;
//					System.out.println(rn);
//				}
//				if(st instanceof String)
//				{
//					nm = (String) st;
//					System.out.println(nm);
//				}
//				if(st instanceof String)
//				{
//					adr = (String) st;
//					System.out.println(adr);
//				}
//				if(st instanceof String)
//				{
//					em = (String) st;
//					System.out.println(em);
//				}
//		String sql = "insert into StudentData values("+rn+",'"+nm+"','"+adr+"','"+em+"')";
//			
//		smt.execute(sql);
////			System.out.println(sql);
//			
//				
//			}
//	
//			
//			
//		}
//		smt.close();
//		con.close();	
	}
}
	
