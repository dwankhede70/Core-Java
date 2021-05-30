package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class Test2 
{
	public static void main(String[] args)  
	{
     try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","root");
	     
	     //String s="create table Student(rollno Int(3),name char(100),addr char(200))";
	    // String s="insert into Student Valves(88,Shubh,Sangavi)";
	     String sql = "create table student(rollno int(10),name varchar(25),addr varchar(25))";
	     System.out.println("Table is created successfully");
	     
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Enter Rollno here=");
	     int rn=sc.nextInt();
	     System.out.println("Enter Name here=");
	     String nm=sc.next();
	     System.out.println("Enter Addr here=");
	     String addr=sc.next();
	     String s="insert into Student values("+rn+",'"+nm+"','"+addr+"')";
	     System.out.println(s);
	     
	     String s1 ="Select * from student";
	     
		 Statement smt=con.createStatement();
		  ResultSet rs = smt.executeQuery(s1);
		  while(rs.next())
		  {
			  System.out.println(rs.getInt(1));
			  System.out.println(rs.getString(2));
			  System.out.println(rs.getString(3));
		  }
		 smt.execute(s);
	 	
	 	 smt.close();
	 	 con.close();
	} catch (ClassNotFoundException | SQLException e) {
		System.out.println(e.getMessage());
	}
     
    
	}

}
