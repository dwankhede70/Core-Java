package com.braindatawire.institutemanagementsystem.ServiceImpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.braindatawire.institutemanagementsystem.config.DaoUtil;
import com.braindatawire.institutemanagementsystem.model.Batch;
import com.braindatawire.institutemanagementsystem.model.Course;
import com.braindatawire.institutemanagementsystem.model.Faculty;
import com.braindatawire.institutemanagementsystem.model.Student;
import com.braindatawire.institutemanagementsystem.service.Service;


public class Operation implements Service{
	Course c = new Course();
	Faculty f = new Faculty();
	Batch b = new Batch();
	Student s = new Student();
	Connection con=DaoUtil.getConnection();
	@SuppressWarnings("resource")
	@Override
	public void addCourse() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Course Id");
		 int cid = sc.nextInt();
		 c.setCid(cid);
		 System.out.println("Enter the Course Name");
		 String cname = sc.next();
		 c.setCname(cname);
		 String sql="insert into Course values("+c.getCid()+",'"+c.getCname()+"')";
	     System.out.println(sql);
		try {
			Statement smt = con.createStatement();
			smt.execute(sql);
		 	
		} catch (SQLException e) {
	
		}
		 
	}

	@Override
	public void viewCourse()
	{
		String sql ="select * from Course";
		
		try {
			Statement smt = con.createStatement();
			ResultSet rs = smt.executeQuery(sql);
			//System.out.println("Course id"+ "     "+"Course name");
			while(rs.next())
			{
				//System.out.println(+rs.getInt(1)+"     "+rs.getString(2));
				System.out.println("Course Id    :"  +rs.getInt(1));
				System.out.println("Course Name  :"  +rs.getString(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
		}
		
	}

	@SuppressWarnings("resource")
	@Override
	public void addFaculty()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Faculty Id");
		int fid=sc.nextInt();
		f.setFid(fid);
		System.out.println("Enter Faculty Name");
		String fname=sc.next();
		f.setFname(fname);
		System.out.println("Enter the Course Id");
		 int cid = sc.nextInt();
		 f.setCid(cid);
		 System.out.println("Enter the Course Name");
		 String cname = sc.next();
		 f.setCname(cname);
		 String sql="insert into Faculty values("+f.getFid()+", '"+f.getFname()+"',"+f.getCid()+",'"+f.getCname()+"')";
	     System.out.println(sql);
	     Statement smt;
		try {
			smt = con.createStatement();
			smt.execute(sql);
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
		}
	}
			

	@Override
	public void viewFaculty() 
	{
		String sql="select * from Faculty";
		try {
			Statement smt=con.createStatement();
			ResultSet rs=smt.executeQuery(sql);
			System.out.println("========================================================================================================");
			System.out.println();
			//System.out.println("Faculty id" + "    "+"Faculty name"+ "     "+"Course Id"+ "   " + "Course Name");
			while (rs.next()) {
				
				//System.out.println(+rs.getInt(1)+"        "+rs.getString(2)+"        "+rs.getInt(3)+"        "+rs.getString(4));
				System.out.println("Faculty Id    :"  +rs.getInt(1));
				System.out.println("Faculty Name  :"  +rs.getString(2));
				System.out.println("Course Id     :"  +rs.getInt(3));
				System.out.println("Course Name   :"  +rs.getString(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
		}	
		
	}

	@SuppressWarnings("resource")
	@Override
	public void addBatch() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Batch id :");
		int bid = sc.nextInt();
		b.setBid(bid);
		System.out.println("Enter Batch Name: ");
		String bname = sc.next();
		b.setBname(bname);
		System.out.println("Enter Faculty id :");
		int fid = sc.nextInt();
		b.setFid(fid);
		System.out.println("Enter Faculty Name: ");
		String fname = sc.next();
		b.setFname(fname);
		System.out.println("Enter Course id ");
		int cid = sc.nextInt();
		b.setCid(cid);
		System.out.println("Enter the Course Name :");
		String cname= sc.next();
		b.setCname(cname);
		String sql ="insert into Batch values("+b.getBid()+",'"+b.getBname()+"',"+b.getFid()+" ,'"+b.getFname()+"', "+b.getCid()+",'"+b.getCname()+"')";
		
		System.out.println(sql);
		
		try {
			Statement smt = con.createStatement();
			
			smt.execute(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void viewBatch() {
		String sql="select * from Batch";
		try {
			Statement smt=con.createStatement();
			ResultSet rs=smt.executeQuery(sql);
			System.out.println("========================================================================================================");
			System.out.println();
			//System.out.println("Batch id" + "    "+"Batch name"+"    "+"Faculty id"+"    "+"Faculty name"+"   " +"Course Id" +"  "+"Course Name");
			while (rs.next()) {
				
				//System.out.println(+rs.getInt(1)+"            "+rs.getString(2)+"            "+rs.getInt(3)+"            "+rs.getString(4)+"            "+rs.getInt(5)+"                "+rs.getString(6));
				System.out.println("Batch id       :" +rs.getInt(1));
				System.out.println("Batch Name     :" +rs.getString(2));
				System.out.println("Faculty Id     :" +rs.getInt(3));
				System.out.println("Faculty Name   :" +rs.getString(4));
				System.out.println("Course id      :" +rs.getInt(5));
				System.out.println("Course Name    :" +rs.getString(6));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
		}	
		System.out.println("========================================================================================================");
		
	}

	@SuppressWarnings("resource")
	@Override
	public void addStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student id :");
		int sid = sc.nextInt();
		s.setSid(sid);
		System.out.println("Enter Student Name: ");
		String sname = sc.next();
		s.setSname(sname);
		System.out.println("Enter Batch id :");
		int bid = sc.nextInt();
		s.setBid(bid);
		System.out.println("Enter Batch Name: ");
		String bname = sc.next();
		s.setBname(bname);
		System.out.println("Enter Faculty id :");
		int fid = sc.nextInt();
		s.setFid(fid);
		System.out.println("Enter Faculty Name: ");
		String fname = sc.next();
		s.setFname(fname);
		System.out.println("Enter Course id ");
		int cid = sc.nextInt();
		s.setCid(cid);
		System.out.println("Enter the Course Name :");
		String cname= sc.next();
		s.setCname(cname);
		String sql ="insert into Student values("+s.getSid()+",'"+s.getSname()+"',"+s.getBid()+",'"+s.getBname()+"',"+s.getFid()+" ,'"+s.getFname()+"', "+s.getCid()+",'"+s.getCname()+"')";
		
		System.out.println(sql);
		
		try {
			Statement smt = con.createStatement();
			
			smt.execute(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void viewStudent() {
		String sql="select * from Student";
		try {
			Statement smt=con.createStatement();
			ResultSet rs=smt.executeQuery(sql);
			System.out.println("========================================================================================================");
			System.out.println();
			//System.out.println("Student id" +"  "+"Student name"+"  "+"Batch id"+"    "+"Batch name"+"   "+"Faculty id" + "  "+"Faculty name"+ "   "+"Course Id"+"   "+"Course Name");
			while (rs.next()) {
				
				//System.out.println(+rs.getInt(1)+"            "+rs.getString(2)+"            "+rs.getInt(3)+"            "+rs.getString(4)+"            "+rs.getInt(5)+"            "+rs.getString(6)+"            "+rs.getInt(7)+"            "+rs.getString(8));
				System.out.println("Student id   :" +rs.getInt(1));
				System.out.println("Student Name :" +rs.getString(2));
				System.out.println("Batch id     :" +rs.getInt(3));
				System.out.println("Batch Name   :" +rs.getString(4));
				System.out.println("Faculty id   :" +rs.getInt(5));
				System.out.println("Faculty Name :" +rs.getString(6));
				System.out.println("Course id    :" +rs.getInt(7));
				System.out.println("Course Name  :" +rs.getString(8));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
		}	
		System.out.println("========================================================================================================");
		
		
	}
		
	}

