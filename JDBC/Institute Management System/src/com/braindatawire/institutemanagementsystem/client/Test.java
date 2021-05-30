package com.braindatawire.institutemanagementsystem.client;
import com.braindatawire.institutemanagementsystem.ServiceImpl.Operation;
import com.braindatawire.institutemanagementsystem.service.Service;
import java.util.Scanner;
@SuppressWarnings("unused")
public class Test 
{
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		Operation op= new Operation();
		System.out.println();
		System.out.println("====================================================");
	    System.out.println("**********Institute Management Application**********");
		System.out.println("====================================================");
	    System.out.println();
	    Scanner sc=new Scanner(System.in);
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
				System.exit(0);
				
				break;

			default:
				break;
			}
		}
		
	}
}
