package com.cjc.db;

import java.util.*;

import com.cjc.models.Batch;
import com.cjc.models.Course;
import com.cjc.models.Faculty;
import com.cjc.models.Student;

public class OperationDbImpl implements OperationDb 
{
	Scanner  sc   = new Scanner(System.in);
	Course   c    = new Course();
	Faculty  f    = new Faculty();
	Batch    b    = new Batch();
	Student  s    = new Student();
	
	List<Course>   clist = new ArrayList<>();
	List<Faculty>  flist = new ArrayList<>();
	List<Batch>    blist = new ArrayList<>();
	List<Student>  slist = new ArrayList<>();

	@Override
	public void addCourse() 
	{
		Scanner sc1  = new Scanner(System.in);
		System.out.println("Enter how many course you want");
		int csize = sc1.nextInt();

		for (int i = 0; i < csize; i++) 
		{
			Course c = new Course();
			Scanner sc2  = new Scanner(System.in);
			Scanner sc3  = new Scanner(System.in);
			System.out.println("Enter the course Id");
			c.setCid(sc2.nextInt());
			System.out.println("Enter the course Name");
			c.setCname(sc3.next());
			clist.add(c);
		}
	}

	@Override
	public void viewCourse()
	{
		Iterator <Course> itr = clist.iterator();
		while(itr.hasNext())
		{
			Course crs=itr.next();
			System.out.println("Course Id    :"   +crs.getCid());
			System.out.println("Course Name  :"   +crs.getCname());
			System.out.println("=====================================");
		    	
		}
	}

	@Override
	public void addFaculty() 
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter how much faculty you want");
		int fsize = sc1.nextInt();
		for (int i = 0; i < fsize; i++)
		{
			Faculty f = new Faculty();
			Scanner sc2  = new Scanner(System.in);
			Scanner sc3  = new Scanner(System.in);
			System.out.println("Enter the Faculty Id");
			f.setFid(sc2.nextInt());
			System.out.println("Enter the Faculty Name");
			f.setFname(sc3.next());
			viewCourse();
			System.out.println("Assign Course Id");
			int cid = sc.nextInt();
			Iterator<Course> itr = clist.iterator();
			while (itr.hasNext()) 
			{
				Course crs = itr.next();
				if (cid == crs.getCid()) 
				{
					f.setCourse(crs);
				}
			}
			flist.add(f);
			
		}

	}

	@Override
	public void viewFaculty() {
		    System.out.println("******Faculty details******");
		     System.out.println();
		     Iterator<Faculty> itr = flist.iterator();
		     while(itr.hasNext())
		     {
		    	 Faculty flt=itr.next();
		    	 System.out.println(" Faculty ID       :" + flt.getFid());
		    	 System.out.println(" Faculty Name     :" + flt.getFname());
		    	 System.out.println(" Course ID        :" + flt.getCourse().getCid());
		    	 System.out.println(" Course Name      :" + flt.getCourse().getCname());
		    	 System.out.println("=====================================");
		    		
		     }
	
//		for (Faculty f1 : l1) {
//			System.out.println(" Faculty ID      :" + f1.getFid());
//			System.out.println(" Faculty Name    :" + f1.getFname());
//			System.out.println(" Course ID       :" + f1.getCourse().getCid());
//			System.out.println(" Course Name     :" + f1.getCourse().getCname());
//			
//		}
	} 

	@Override
	public void addBatch()
	{
		
		System.out.println("Enter the Batches you want");
		int bsize = sc.nextInt();
		for (int i = 0; i < bsize; i++)
		{
			Batch b = new Batch();
			System.out.println("Enter the Batch Id");
			b.setBid(sc.nextInt());
			System.out.println("Enter the Batch  Name");
			b.setBname(sc.next());
			viewFaculty();
			System.out.println("Assign Faculty Id To Batch");
			int fid = sc.nextInt();
			Iterator<Faculty> itr =flist.iterator();
			while (itr.hasNext()) 
			{
				Faculty flt = itr.next();
				if (fid ==flt.getFid())
				{ 
					b.setFac(flt);
					System.out.println("Faculty Id assigned");
				}
			}
			blist.add(b);

		}

	}

	@Override
	public void viewBatch() 
	{
		System.out.println("******Batch details***");
		System.out.println();
		for (Batch b2 : blist) 
				{
				System.out.println(" Batch ID       :" + b2.getBid());
				System.out.println(" Batch Name     :" + b2.getBname());
				System.out.println(" Faculty ID     :" + b2.getFac().getFid());
				System.out.println(" Faculty Name   :" + b2.getFac().getFname());
				System.out.println(" Course Id      :" + b2.getFac().getCourse().getCid());
				System.out.println(" Course Id      :" + b2.getFac().getCourse().getCname());
				System.out.println("=====================================");
			    	
			}
		}

	@Override
	public void addStudent()
	{
		System.out.println("Enter the Student no. you wat to add");
		int ssize=sc.nextInt();
		for (int i = 0; i < ssize; i++) 
		{
			Student s =new Student();
			System.out.println("Enter the Student Id");
			s.setSid(sc.nextInt());
			System.out.println("Enter the Student Name");
			s.setSname(sc.next());
			viewBatch();
			System.out.println("Assign Batch Id");
			int bid = sc.nextInt();
			Iterator<Batch> itr =blist.iterator();
			while(itr.hasNext())
			{
				Batch btch=itr.next();
				if (bid ==btch.getBid())
				{
					s.setBatch(btch);
				}
			}
			slist.add(s);
			
		}
		

	}

	@Override
	public void viewStudent() 
	{
		System.out.println("******Student  details*******");
		System.out.println();
		for(Student s2:slist)
		{
		System.out.println(" Student ID       :" + s2.getSid());
		System.out.println(" Student Name     :" + s2.getSname());
		System.out.println(" Batch ID         :" + s2.getBatch().getBid());
		System.out.println(" Batch Name       :" + s2.getBatch().getBname());
		System.out.println(" Faculty Id       :" + s2.getBatch().getFac().getFid());
		System.out.println(" Faculty Id       :" + s2.getBatch().getFac().getFname());
		System.out.println(" Course Id        :" + s2.getBatch().getFac().getCourse().getCid());
		System.out.println(" Course Id        :" + s2.getBatch().getFac().getCourse().getCname());
		System.out.println("=====================================");
	    } 
	}

}
