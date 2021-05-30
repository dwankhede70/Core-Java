package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test 
{
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
	
	try {
		 //step1: Load the Driver class 
		Class.forName("com.mysql.cj.jdbc.Driver");
		
//		step2 : Establish the connecetion
		
	Connection con	= DriverManager.getConnection("jdbc:mysql://localhost/Shubham","root","root");

		
		//step 3: Construct sql querry (To create table Student ) 
		// synatx: create table table_name(column1_name datatype, Column_name datatype)
		
		
		
		String sql="create table Student2 (rollno int , name varchar(25), address varchar(25))";
		System.out.println("table create successfully");
		// step 4: Create Statement 
		
		Statement stm=con.createStatement();
		
		
		// step 5: execute querry 
		
		boolean i=stm.execute(sql);
		
		//System.out.println(i);
		
//		if(i)
//		{
//			System.out.println("Table created Successfully");
//
//		}
		
		// To close the resourses
		
		con.close();
		
		stm.close();
		
		
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
	}
	}

}
