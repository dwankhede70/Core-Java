package com.braindatawire.collegemanagement.client;
import com.braindatawire.collegemanagement.Service.Operation;
import com.braindatawire.collegemanagement.ServiceImpl.NameInvalidException;
import com.braindatawire.collegemanagement.ServiceImpl.OperationImpl;
import java.util.*;

public class Test 
{
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		Operation op = new OperationImpl();
		int ch=0;
		String s;
		System.out.println("*=====================================================*");
		System.out.println("*               College Management System             *");
		System.out.println("*=====================================================*");
		
		do
		{
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		System.out.println("1.Add Course");
		System.out.println("2.View Course");
		System.out.println("3.Add Faculty");
		System.out.println("4.View Faculty");
		System.out.println("5.Add Batch");
		System.out.println("6.view Batch");
		System.out.println("7.Add Student");
		System.out.println("8.View Student");
		System.out.println("9.Exit");
		System.out.println("Enter UR choice");
		try {
			 ch=sc.nextInt();
			}
		catch (Exception e) 
		{
			System.out.println("Please,Must Enter Valid Number Choice");
		}
		
		switch (ch) 
		{
			case 1:
			try {
				op.addCourse();
			} catch (NameInvalidException e) {
				
			}
				break;
			case 2:
				op.viewCourse();
				break;
			case 3:
			try {
				op.addFaculty();
			} catch (NameInvalidException e) {
				
			}
				break;
			case 4:
				op.viewFaculty();
				break;
			case 5:
			try {
				op.addBatch();
			} catch (NameInvalidException e) {
							}
				break;
			case 6:
				op.viewBatch();
				break;
			case 7:
			try {
				op.addStudent();
			} catch (NameInvalidException e) {
				
			}
				break;
			case 8:
				op.viewStudent();
				break;
			case 9:
				System.exit(0);
				break;

			default:
				break;
			}
		    System.out.println("");
		    System.out.println("Do you want to continue Press Y for Yes and N for No");
		    s=sc1.next();
		}
		  while (s.equals("Y") || s.equals("y"));
		  System.out.println("Thank you for your Visit,Have a Good Day !!");

	}
}
