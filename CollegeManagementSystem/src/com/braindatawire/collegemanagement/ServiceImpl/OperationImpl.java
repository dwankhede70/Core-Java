package com.braindatawire.collegemanagement.ServiceImpl;
import com.braindatawire.collegemanagement.Service.Operation;
import com.braindatawire.collegemanagement.model.Batch;
import com.braindatawire.collegemanagement.model.Course;
import com.braindatawire.collegemanagement.model.Faculty;
import com.braindatawire.collegemanagement.model.Student;
import java.util.*;


	public class OperationImpl implements Operation
	{
		List<Course>  clist = new ArrayList<>();
		List<Faculty> flist = new ArrayList<>();
		List<Batch>   blist = new ArrayList<>();
		List<Student> slist = new ArrayList<>();
		Scanner         sc  = new Scanner(System.in);
	    @SuppressWarnings("resource")
		@Override
		public void addCourse()throws NameInvalidException 
		{
	    		Scanner sc1  = new Scanner(System.in);
	    		System.out.println("Enter how many course you want to add");
			try 
			{
				int csize = sc1.nextInt();
				for (int i = 0; i < csize; i++)
			{
				Course c = new Course();
				Scanner sc2  = new Scanner(System.in);
				Scanner sc3  = new Scanner(System.in);
				
			try 
			{
				System.out.println("Enter the course Id");
				c.setCid(sc2.nextInt());
			}  
			catch (InputMismatchException e) 
			{
				System.out.println("Enter Valid Id");
				break;
			}
			try 
			{
				System.out.println("Enter the course Name");
				String s=sc3.next();
				if(s.matches("[a-zA-Z]*"))
				{
					c.setCname(s);
				}
				else
				{
					throw new NameInvalidException();
				}
			}
			finally
			{
				
			}
			clist.add(c);
			}
			
			}
			catch (InputMismatchException e)
			{
				System.out.println("Please,Enter valid no of Courses you want to add");	
			}
		
			
		}
	
		@Override
		public void viewCourse() 
		{
			System.out.println("**********Course details***********");
			Iterator<Course> itr =clist.iterator();
			while(itr.hasNext())
			{
				Course c=itr.next();
				System.out.println(" Course Id         :" +c.getCid());
				System.out.println(" Course Name       :" +c.getCname());
				System.out.println("==========================================");
			}

		}

		@SuppressWarnings("resource")
		@Override
		public void addFaculty() throws NameInvalidException 
		{
				Scanner sc1  = new Scanner(System.in);
				System.out.println("Enter how many Faculty you want to add");
			
			try
			{
				int fsize=sc1.nextInt();	
				for (int i = 0; i < fsize; i++) 
			{
				Faculty f = new Faculty();
				Scanner sc2  = new Scanner(System.in);
				Scanner sc3  = new Scanner(System.in);
			
			try 
			{
				System.out.println("Enter the Faculty Id");
				f.setFid(sc2.nextInt());
			}
			catch (InputMismatchException e)
			{
				System.out.println("Please,Enter valid Faculty Id");
				break;
			}
			
			try
			{
				System.out.println("Enter the Faculty Name");
				String s1=sc3.next();
				if(s1.matches("[a-zA-Z]*"))
				{
					f.setFname(s1);
				}
				else
				{
					throw new NameInvalidException();
				}
			}
			finally
			{
				
			}
//				f.setFname(sc3.next());
//			}
//			catch (InputMismatchException e) 
//			{
//				System.out.println("Please,Enter the valid faculty Name");
//				break;
//			}
			
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
					System.out.println("Course Id Successfully assign to Faculty");
				}
			}
			flist.add(f);
			}
			}
			catch (InputMismatchException e) 
			{
				System.out.println("Please,Enter valid no of Faculties you want to add ");	
			}
	}
		

		@Override
		public void viewFaculty()
		{
			System.out.println("**********Faculty details***********");
		     System.out.println();
		     Iterator<Faculty> itr = flist.iterator();
		     while(itr.hasNext())
		     {
		    	 Faculty f1 = itr.next();
		    	 System.out.println(" Faculty ID                 :" +f1.getFid());
		    	 System.out.println(" Faculty Name               :" +f1.getFname());
		    	 System.out.println(" Faculty Course ID          :" +f1.getCourse().getCid());
		    	 System.out.println(" Faculty Course Name        :" +f1.getCourse().getCname());
		    	 System.out.println("==========================================");
		     }

		}
		     

		@SuppressWarnings("resource")
		@Override
		public void addBatch() throws NameInvalidException
		{
				Scanner sc1  = new Scanner(System.in);
				System.out.println("Enter how many Batch you want to add");
				int bsize;
			try 
			{
				bsize = sc1.nextInt();
				for (int i = 0; i < bsize; i++) 
			{
				Batch b = new Batch();
				Scanner sc2  = new Scanner(System.in);
				Scanner sc3  = new Scanner(System.in);
			
			try 
			{
				System.out.println("Enter the Batch Id");
				b.setBid(sc2.nextInt());
			}
			catch (Exception e) 
			{
				System.out.println("Please,Enter valid Batch Id");
				break;
			}
			
			try
			{
				System.out.println("Enter the Batch  Name");
				String s2=sc3.next();
				if(s2.matches("[a-zA-Z]*"))
				{
					b.setBname(s2);
				}
				else
				{
					throw new NameInvalidException();
				}
			}
			finally
			{
				
			}
//				b.setBname(sc3.next());
//			}
//			catch (Exception e) 
//			{
//				System.out.println("Please,Enter valid Batch Name");
//				break;
//			}
//			
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
					System.out.println("Faculty Id assigned Successfully to Batch");
				}
			}
			blist.add(b);
			}
			}
			catch(InputMismatchException e)
			{
				System.out.println("Please,Enter valid no of Batches you want to add");
			}
	}
		@Override
		public void viewBatch() 
		{
			System.out.println("**********Batch details***********");
			System.out.println();
			Iterator<Batch> itr =blist.iterator();
			while(itr.hasNext())
			{
				Batch b=itr.next();
				System.out.println(" Batch ID                :" + b.getBid());
				System.out.println(" Batch Name              :" + b.getBname());
				System.out.println(" Batch Faculty ID        :" + b.getFac().getFid());
				System.out.println(" Batch Faculty Name      :" + b.getFac().getFname());
				System.out.println(" Batch Course Id         :" + b.getFac().getCourse().getCid());
				System.out.println(" Batch Course Name       :" + b.getFac().getCourse().getCname());
				System.out.println("==========================================");
			}
		
		}

		@SuppressWarnings("resource")
		@Override
		public void addStudent() throws NameInvalidException
		{
				Scanner sc1  = new Scanner(System.in);
				System.out.println("Enter how many Student you want to add");
			try
			{
				int ssize = sc1.nextInt();
				for (int i = 0; i < ssize; i++) 
			{
				Student s= new Student();
				Scanner sc2  = new Scanner(System.in);
				Scanner sc3  = new Scanner(System.in);
			
			try
			{
				System.out.println("Enter the Student Id");
				s.setSid(sc2.nextInt());
			}
			catch (InputMismatchException e) 
			{
				System.out.println("Please,Enter valid Student Id");
				break;
			}
			
			try 
			{
				System.out.println("Enter the Student Name");
				String s3=sc3.next();
				if(s3.matches("[a-zA-Z]*"))
				{
					s.setSname(s3);
				}
				else
				{
					throw new NameInvalidException();
				}
			}
			finally
			{
				
			}
//				s.setSname(sc3.next());
//			}
//			catch (InputMismatchException e)
//			{
//				System.out.println("Please,Enter valid Student Name");
//				break;
//			}
			
				viewBatch();
				System.out.println("Assign Batch Id To Student");
				int bid = sc  .nextInt();
				Iterator<Batch> itr =blist.iterator();
			while(itr.hasNext())
			{
				Batch btch=itr.next();
				if (bid ==btch.getBid())
				{
					s.setBatch(btch);
					System.out.println("Batch Id Successfully assign to Student");
				}
			}

			slist.add(s);
			}
			}
			catch (InputMismatchException e)
			{
				System.out.println("Please,Enter Valid no of Students you want to add");
			}
		}
	

		@Override
		public void viewStudent()
		{
			System.out.println("**********Student details***********");
			System.out.println();
			Iterator<Student> itr =slist.iterator();
			while(itr.hasNext())
			{
				Student s=itr.next();
				
				System.out.println(" Student ID                   :" +s.getSid());
				System.out.println(" Student Name                 :" +s.getSname());
				System.out.println(" Student Batch ID             :" +s.getBatch().getBid());
				System.out.println(" Student Batch Name           :" +s.getBatch().getBname());
				System.out.println(" Student Faculty ID           :" +s.getBatch().getFac().getFid());
				System.out.println(" Student Faculty Name         :" +s.getBatch().getFac().getFname());
				System.out.println(" Student Course ID            :" +s.getBatch().getFac().getCourse().getCid());
				System.out.println(" Student Course Name          :" +s.getBatch().getFac().getCourse().getCname());
				System.out.println("==========================================");
				
			}	
			
		}

	}

