package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@SuppressWarnings("unused")
public class DemoList 
{
	//Connection con=null;
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
	Employee1 e=new Employee1();
	e.setEid(15);
	e.setEname("Shubham");
	e.setEaddr("pune");
	
	Employee1 e1=new Employee1();
	e1.setEid(16);
	e1.setEname("Swapnil");
	e1.setEaddr("Akurdi");
	
	List<Employee1> l= new ArrayList();
	
	l.add(e);
	l.add(e1);
	
//	System.out.println(e.getEid());
//	System.out.println(e.getEname());
//	System.out.println(e.getEaddr());
//	
//	System.out.println(e1.getEid());
//	System.out.println(e1.getEname());
//	System.out.println(e1.getEaddr());
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
//	String sql="create table Employee2(eid INT(5),ename varchar(100),eaddr varchar(100),PRIMARY KEY(eid))";
//	System.out.println("table create successfully");
//	Statement smt =con.createStatement();
//	smt.execute(sql);
//	smt.close();
//	con.close();
	
	Iterator<Employee1> itr=l.iterator();
	Statement smt=null;
	while(itr.hasNext())
	{
		//Connection con=null;
		Employee1 e2=itr.next();
		
		int eid=e2.getEid();
		String enm=e2.getEname();
		String eaddr=e2.getEaddr();
		
		String s1="insert into Employee2 values("+eid+",'"+enm+"','"+eaddr+"')";
		System.out.println(s1);
		smt =con.createStatement();
		smt.execute(s1);
		
		
	}
	String s="Select * from Employee2";
	ResultSet rs=smt.executeQuery(s);
	while(rs.next())
	{
		System.out.println(rs.getInt(1));
		System.out.println(rs.getString(2));
		System.out.println(rs.getString(3));
	}
	
	
	}
}
