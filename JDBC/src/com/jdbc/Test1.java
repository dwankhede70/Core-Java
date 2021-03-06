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

@SuppressWarnings("unused")
public class Test1
{
	
	@SuppressWarnings({ "unchecked", "rawtypes", "resource" })
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		List l= new ArrayList();
		Statement smt=null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/db","root","root");
		
//===============================================================================
//      create table student1 here
//===============================================================================
//		String s="create table student1(rollno INT(3),name varchar(100),addr char(200),email varchar(100))";
//		System.out.println(s);
//		System.out.println("Table is created");
//		Statement smt = con.createStatement();

//===============================================================================
//      insert values into table here
//===============================================================================
		for(int i=1;i<=2;i++)
		{
		 Scanner sc=new Scanner(System.in);
	     System.out.println("Enter Rollno here=");
	     int rn=sc.nextInt();
	     System.out.println("Enter Name here=");
	     String nm=sc.next();
	     System.out.println("Enter Addr here=");
	     String addr=sc.next();
	     System.out.println("Enter emailid here =");
	     String em=sc.next();
	     String s1="insert into student2 values("+rn+",'"+nm+"','"+addr+"','"+em+"')";
	     System.out.println(s1);
	     
	     String s = "Select * from student2";
	     smt = con.createStatement();
	     ResultSet rs = smt.executeQuery(s);
		  while(rs.next())
		  {
			  System.out.println(rs.getInt(1));
			  System.out.println(rs.getString(2));
			  System.out.println(rs.getString(3));
		  }
		smt.execute(s1);
////===============================================================================
////     add data into list  here
////===============================================================================
		l.add(rs.getInt(1));
		l.add(rs.getString(2));
		l.add(rs.getString(3));
		l.add(rs.getString(4));
		System.out.println(l);
		}
//		
//===============================================================================
//      iterate data from List here
//===============================================================================
		Iterator itr =l.iterator();
		while(itr.hasNext())
		{
			Object s=itr.next();
			System.out.println(s);
		}
////===============================================================================
////      close all resourses here
////===============================================================================
		smt.close();
		con.close();
	
	}
}
