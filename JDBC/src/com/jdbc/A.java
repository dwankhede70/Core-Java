package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class A 
{
	public static void main(String[] args) 
	{
		ResultSet rs=null;
		Connection con=null;
		Statement smt = null;
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","root");
		String sql= "Select * from student";
		
		smt=con.createStatement();
		//String sql="delete from student where rollno=11";
		rs=smt.executeQuery(sql);
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println("==================");
		}
	}
		catch(ClassNotFoundException | SQLException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			if(rs!=null)
			{
				try
				{
					rs.close();
				}
				catch (SQLException e) 
				{
					System.out.println(e.getMessage());
				}
			}
			if(smt!=null)
			{
				try
				{
					smt.close();
				}
				catch (SQLException e) 
				{
					System.out.println(e.getMessage());
				}
			}
			if(con!=null)
			{
				try
				{
					con.close();
				}
				catch (SQLException e) 
				{
					System.out.println(e.getMessage());
				}
			}
			
		}
	}
}
