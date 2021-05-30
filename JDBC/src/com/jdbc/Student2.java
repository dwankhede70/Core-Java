package com.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@SuppressWarnings("unused")
public class Student2 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","root");
		String sql = "insert into student values(?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		
		ps.setInt(1, 5);
		ps.setString(2, "Shubahm");
		ps.setString(3, "Karve");
		ps.execute();
	}
}
