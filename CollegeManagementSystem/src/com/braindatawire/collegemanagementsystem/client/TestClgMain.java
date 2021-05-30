package com.braindatawire.collegemanagementsystem.client;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.braindatawire.collegemanagementsystem.serviceImpl.OperationImplMethod;

public class TestClgMain {
	
	public static void main(String[] args) {
		
		System.out.println("=======================================");
		System.out.println("******College Management System********");
		System.out.println("=======================================");
		
		OperationImplMethod op = new OperationImplMethod();
		
		int ch=0;
		String s;
		do{
		System.out.println("1.Add Course");
		System.out.println("2.View Course");
		System.out.println("3.Add Faculty");
		System.out.println("4.View Faculty");
		System.out.println("5.Add Batch");
		System.out.println("6.view Batch");
		System.out.println("7.Add Student");
		System.out.println("8.View Student");
		System.out.println("9.Exit");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter UR choice");
		ch=sc.nextInt();
				
	
		switch (ch) {
		case 1:
			op.addCourse();
			break;
		case 2:
			op.viewCourse();
			break;
		case 3:
			op.addFaculty();
			break;
		case 4:
			op.viewFaculty();
			break;
		case 5:
			op.addBatch();
			break;
		case 6:
			op.viewBatch();
			break;
		case 7:
			op.addStudent();
			break;
		case 8:
			op.viewStudent();
			break;
		case 9:
			System.exit(ch);
			break;

		default:
			break;
		
		}
		System.out.println();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Do you Want to Continue Press Y Or y for Yes");
		s = sc1.next();
		}
		while(s.equals("Y")|| s.equals("y"));
		System.out.println("========================");
		System.out.println("       Thank You!       ");
		System.out.println("       Visit Again      ");
		System.out.println("========================");
	}
}






//
//mysql> select * from Course;
//+-----+-------+
//| cid | cname |
//+-----+-------+
//| 111 | java  |
//+-----+-------+
//1 row in set (0.04 sec)
//
//mysql> select * from Faculty;
//+-----+-------+----------+
//| fid | fname | Curs_cid |
//+-----+-------+----------+
//| 121 | Kunal |      111 |
//+-----+-------+----------+
//1 row in set (0.35 sec)
//
//mysql> select * from batch;
//+-----+-------+----------+
//| bid | bname | fact_fid |
//+-----+-------+----------+
//| 132 | Fdj   |      121 |
//+-----+-------+----------+
//1 row in set (0.00 sec)
//
//mysql> select * from student;
//+-----+---------+----------+
//| sid | sname   | bach_bid |
//+-----+---------+----------+
//|   1 | Shubham |      132 |
//+-----+---------+----------+
//1 row in set (0.00 sec)