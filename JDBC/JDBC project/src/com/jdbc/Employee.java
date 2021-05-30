package com.jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Employee 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","root");
		Scanner sc=new Scanner(System.in);
//==================================================================================================		
//                             For creating a table
//==================================================================================================		
		
//		String  sql="create table Employee(eid int(5),ename varchar(20),edesg varchar(15),eaddress varchar(20))";
//		
//		System.out.println(sql);
//		
//		Statement smt=con.createStatement();
//		
//		smt.execute(sql);
//		
//		System.out.println("Table created Successfully");
//		
		
//==================================================================================================		
//						 For entering values in Employee table 
//==================================================================================================		
		
//		for (int i = 1; i <= 4; i++) {
//		System.out.println("Enter the Employee id "+i);
//		int eid=sc.nextInt();
//		
//		System.out.println("Enter a Employee name"+i);
//		String ename=sc.next();
//		
//		System.out.println("Enter a Employee Designation"+i);
//		String edesg=sc.next();
//		
//		System.out.println("Enter Employee Address "+i);
//		String eaddress=sc.next();
//		
//		
//		String sql="insert into Employee values ("+eid+",'"+ename+"','"+edesg+"','"+eaddress+"')";
//		System.out.println(sql);
//		
//		Statement smt=con.createStatement();
//		
//		smt.execute(sql);
//		}
//		
//		System.out.println("Values Added Successfully");
//		
	
//==================================================================================================		
//							 for delete Employee id where id is 1
//==================================================================================================		
		
//		String sql=" Delete from Employee where eid= '11' ";
//		System.out.println(sql);
//		Statement smt=con.createStatement();
//		smt.execute(sql);
//		System.out.println("delete column Employee id is 11 is successfully");
//		

//==================================================================================================
// 								Update Address is karve
//==================================================================================================		
		
		
//		String sql="update Employee set ename='Ajay' where eaddress ='karanja'";
//		System.out.println(sql);
//		Statement smt=con.createStatement();
//		
//		smt.execute(sql);
//		
//		System.out.println("Update table Successfully where eaddress is karve");
//	

//==================================================================================================		
//						 To display the Data in Employee Table
//==================================================================================================		
	
		String sql="select * from Employee";
		
		Statement smt=con.createStatement();
		
		ResultSet rs=smt.executeQuery(sql);
		
		System.out.println("Data in Employee Tbale");
		while(rs.next())
		{
			
			System.out.println("Employee Id         :" +rs.getInt(1));
			System.out.println("Employee Name       :" +rs.getString(2));
			System.out.println("Employee Designation       :" +rs.getString(3));
			System.out.println("Employee Address    :" +rs.getString(4));
			System.out.println("=======================================");		

		}
		
}
	
}


