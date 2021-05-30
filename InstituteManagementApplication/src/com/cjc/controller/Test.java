package com.cjc.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.cjc.service.OperationService;
import com.cjc.service.OperationServiceImpl;

public class Test 
{
	public static void main(String[] args)
	{
		
		OperationService osi = new OperationServiceImpl();
		System.out.println();
		System.out.println("====================================================");
	    System.out.println("**********Institute Management Application**********");
		System.out.println("====================================================");
	    System.out.println();
		int ch=0;
		
		while(true) 
		{
		System.out.println("1.Add Course");
		System.out.println("2.View Course");
		System.out.println("3.Add Faculty");
		System.out.println("4.View Faculty");
		System.out.println("5.Add Batch");
		System.out.println("6.view Batch");
		System.out.println("7.Add Student");
		System.out.println("8.View Student");
		System.out.println("9.Exit");
		System.out.println();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter UR choice");
		try 
		{
			ch=sc.nextInt();
		}catch (InputMismatchException e)
		{
		System.out.println("Please enter valid choice");	
		}
		
		
			switch (ch) {
			case 1:
				osi.addCourse();
				break;
			case 2:
				osi.viewCourse();
				break;
			case 3:
				osi.addFaculty();
				break;
			case 4:
				osi.viewFaculty();
				break;
			case 5:
				osi.addBatch();
				break;
			case 6:
				osi.viewBatch();
				break;
			case 7:
				osi.addStudent();
				break;
			case 8:
				osi.viewStudent();
				break;
			case 9:
				System.exit(0);
				
				break;

			default:
				break;
			}
		
		
		
		}
		
	}
	
}
