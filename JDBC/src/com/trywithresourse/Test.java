package com.trywithresourse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test 
{
	public static void main(String[] args) 
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","root");
					Statement smt = con.createStatement();
					ResultSet rs= smt.executeQuery("Select * from student");
					)
			{
				while(rs.next())
				{
					System.out.println(rs.getInt(1));
					System.out.println(rs.getString(2));
					System.out.println(rs.getString(3));
					System.out.println("+++++++++++++++++");
				}
			}
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		catch (ClassNotFoundException e)
		{
			
		}
	}
}
