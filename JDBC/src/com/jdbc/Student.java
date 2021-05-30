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

public class Student {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) throws ClassNotFoundException, SQLException  {
		List l= new ArrayList();
		Statement stm=null;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/College", "root", "root");
		
//		String Sql = "create table Student(rollno int(10), name varchar(200), addr varchar(200), email varchar(200))";
//		System.out.println("Table Create Successfully");
//		stm = con.createStatement();
//		stm.execute(Sql);
		
		for(int i=1;i<=2;i++)
		{
		 @SuppressWarnings("resource")
		//Scanner sc=new Scanner(System.in);
		 Scanner sc1=new Scanner(System.in);
	     System.out.println("Enter Rollno here=");
	     int rollno=sc1.nextInt();
	     System.out.println("Enter Name here=");
	     String name=sc1.next();
	     System.out.println("Enter Addr here=");
	     String addr=sc1.next();
	     System.out.println("Enter Email here=");
	     String email=sc1.next();
	     String sql="insert into student values("+rollno+",'"+name+"','"+addr+"','"+email+"')";
	     System.out.println(sql);
		stm = con.createStatement();
		stm.execute(sql);
		
		}
//	====================================================
//				
//	====================================================
		String sql = "select * from student";
		stm = con.createStatement();
		ResultSet rs = stm.executeQuery(sql);
	
		while(rs.next())
		{
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getString(4));
			System.out.println("======================");
			
			l.add(rs.getInt(1));
			l.add(rs.getString(2));
			l.add(rs.getString(3));
			l.add(rs.getString(4));
			System.out.println(l);
			
		}
		Iterator itr =l.iterator();
		while(itr.hasNext())
		{
			Object s=itr.next();
			System.out.println(s);
		}
		stm.close();
		con.close();
	}

}


