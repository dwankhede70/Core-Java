//module Exception {
//}
//package com.braindata.bankmanagement.ServiceImplement;
//import java.util.Scanner;
//import com.braindata.bankmanagement.Service.RBI;
//import com.braindata.bankmanagement.model.Account;
//		
//		public class SBI implements RBI
//		{
//			Account a = new Account();
//			Scanner s = new Scanner(System.in);
//			//Account[][] acc=new Account[8][3];
//			
//			
//			public void createAccount()
//			{
//				
//				System.out.println("Enter accNo ");
//	            String s1=s.nextLine(); 
//				if((s1.matches("[0-9]{11}")))
//				{
//					a.setAccNo(s1);
//				}
//				
//				System.out.println("Enter Name ");
//				String s2=s.nextLine();
//				if((s2.matches("[a-zA-Z]*")))
//				{
//					a.setName(s2);
//				}
//				
//				System.out.println("Enter mobNo ");
//				String s3=s.nextLine();
//				if((s3.matches("[0-9]{10}")))
//				{
//					a.setMobNo(s3);
//				}
//				
//				
//				System.out.println("Enter adharNo ");
//				String s4=s.nextLine();
//				if((s4.matches("[0-9]{12}")))
//				{
//					a.setAdharNo(s4);
//				}
//				
//				System.out.println("Enter gender");
//				String s5=s.nextLine();
//				if((s5.matches("[A-Za-z]*")))
//				{
//					a.setGender(s5);
//				}
//				
//				System.out.println("Enter age");
//				String s6=s.nextLine();
//				if((s6.matches("[0-9]*")))
//				{
//					a.setAge(s6);
//				}
//				
//				System.out.println("Enter minbal");
//				String s7=s.nextLine();
//				if((s7.matches("[0-9]*")))
//		
//				{
//					a.setMinBal(s7);
//				}		
//			}
//		
//			
//			public void displayAllDetails() 
//			{
//				
//				System.out.println("SN=========Type===========================Details================================//");
//				System.out.println("");
//				System.out.println("1. Account No of Person is           :" +a.getAccNo());
//				System.out.println("2. Name of Person is 	             :" +a.getName());
//				System.out.println("3. Mobile No of Person is            :" +a.getMobNo());
//				System.out.println("4. AdhaarCard No of Person is        :" +a.getAdharNo());
//				System.out.println("5. Gender of Person is               :" +a.getGender());
//				System.out.println("6. Age of Person  is                 :" +a.getAge());
//				System.out.println("7. Min Bal of Person  is             :" +a.getMinBal());
//				System.out.println("");
//			    System.out.println("//===============================================================================//");
//				
//			}
//		
//			public void dipositeMoney()
//			
//			{	
//				double d = Double.parseDouble(a.getMinBal());
//				System.out.println("Please,Deposit money that you want ?");
//				double Amt=s.nextDouble();
//				Amt = Amt+d;
//				System.out.println("New Balance is :" +Amt);
//				String s = Double.toString(Amt);
//				a.setMinBal(s);
//				System.out.println("Congratulations,your money is sucessfully Deposited");
//				System.out.println("Thank You,Have a Good Day !!");
//				System.out.println("");
//			}
//		
//			public void withdrawn()
//			{
//				double d = Double.parseDouble(a.getMinBal());
//				System.out.println("Please,withdrawl money that you want ?");
//				double Amt=s.nextDouble();
//				if(d>=Amt)
//					{
//						Amt = d-Amt;
//						System.out.println("Current Balance after Withdrawal is :" +Amt);
//						String s = Double.toString(Amt);
//						a.setMinBal(s);
//						System.out.println("Congratulation,Your Withdrawal is completed sucessfully..");
//						System.out.println("");
//					}
//				else 
//					{
//						System.out.println("Sorry,Your account has insufficient balance");
//						System.out.println("");
//					}
//				
//			}
//		
//			public void accountBalance()
//			{
//				
//						double d = Double.parseDouble(a.getMinBal());
//						System.out.println("Current Balance is :" +d);
//						System.out.println("Thank You,Have a Good Day !!");
//						System.out.println("");
//				
//			}
//		
//		}
