package com.braindata.bankmanagement.ServiceImplement;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.braindata.bankmanagement.Service.RBI;
import com.braindata.bankmanagement.model.Account;

public class SBI implements RBI {
	Account a = new Account();
	Scanner s = new Scanner(System.in);
	String[][] acc = new String[8][3];

	public void createAccount()  {

		System.out.println("Enter acc No ");
		while(true)
		{
		String s1=s.nextLine();
		if(s1.matches("[345]{1}[0-9]{10}"))
		{
			a.setAccNo(s1);
			break;
		}
		else
		{
			System.out.println("Enter valid Acc No");
		}
		}
		
		
		System.out.println("Enter Name ");
		String s2 = s.nextLine();
		while(true)
		{
		if (s2.matches("[a-zA-Z ]*")) 
		{
			a.setName(s2);
			break;
		}
		else 
		{
			System.out.println("Enter valid name");
			
		}
		}
	

		System.out.println("Enter mobNo ");
		while(true)
		{
			String s3 = s.nextLine();
		if ((s3.matches("[789]{1}[0-9]{9}"))) 
		{
			a.setMobNo(s3);
			break;
		}
		else
		{
			System.out.println("Enter valid Mobile Number");
		}
		}

		System.out.println("Enter adharNo ");
		while(true)
		{
		String s4 = s.nextLine();
		if ((s4.matches("[0-9]{12}"))) 
		{
			a.setAdharNo(s4);
			break;
		}
		else
		{
			System.out.println("Enter valid Adhaar Number");
		}
		}
		System.out.println("Enter gender");
		while(true)
		{
		String s5 = s.nextLine();
		//if (s5=="Male"|| s5=="Female"||s5=="TransGender")
		if(s5.matches("[MaleFemale]*"))
		{
			a.setGender(s5);
			break;
		}
		else
		{
			System.out.println("Enter valid Gender");
		}
		}

		System.out.println("Enter age");
		while(true)
		{
		String s6 = s.nextLine();
		int x= Integer.parseInt(s6);
		if (x > 0 && x < 100)
		{
			a.setAge(s6);
			break;
		}
		else 
		{
			System.out.println("Enter valid Age");
		}
		}

		System.out.println("Enter minbal");
		while(true)
		{
			String s7 = s.nextLine();
			//int y = Integer.parseInt(s7);
			//if (y>500)
			if(s7.matches("[5][0-9]*"))
			{
				a.setMinBal(s7);
				break;
			}
			else
			{
				System.out.println("Enter valid Amount");
			}
	   }
	}

	public void displayAllDetails() {
		acc[0][0] = "SrNo";
		acc[0][1] = "Type";
		acc[0][2] = "Details";
		System.out.println("=================================================");
		System.out.print(acc[0][0] + "        " + acc[0][1] + "                      " + acc[0][2]);
		System.out.println("");
		System.out.println("=================================================");
		System.out.println();
		System.out.println("1.  Account No of Person is           :" + a.getAccNo());
		System.out.println("2.  Name of Person is 	              :" + a.getName());
		System.out.println("3.  Mobile No of Person is            :" + a.getMobNo());
		System.out.println("4.  AdhaarCard No of Person is        :" + a.getAdharNo());
		System.out.println("5.  Gender of Person is               :" + a.getGender());
		System.out.println("6.  Age of Person  is                 :" + a.getAge());
		System.out.println("7.  Min Bal of Person  is             :" + a.getMinBal());
		System.out.println("");
		System.out.println("=================================================");

	}

	public void dipositeMoney()

	{
		double d = Double.parseDouble(a.getMinBal());
		System.out.println("Please,Deposit money that you want ?");
		double Amt = s.nextDouble();
		Amt = Amt + d;
		System.out.println("New Balance is :" + Amt);
		String s = Double.toString(Amt);
		a.setMinBal(s);
		System.out.println("Congratulations,your money is sucessfully Deposited");
		System.out.println("Thank You,Have a Good Day !!");
		System.out.println("");
	}

	public void withdrawn() {
		double d = Double.parseDouble(a.getMinBal());
		System.out.println("Please,withdrawl money that you want ?");
		double Amt = s.nextDouble();
		if (d >= Amt) {
			Amt = d - Amt;
			System.out.println("Current Balance after Withdrawal is :" + Amt);
			String s = Double.toString(Amt);
			a.setMinBal(s);
			System.out.println("Congratulation,Your Withdrawal is completed sucessfully..");
			System.out.println("");
		} else {
			System.out.println("Sorry,Your account has insufficient balance");
			System.out.println("");
		}

	}

	public void accountBalance() {

		double d = Double.parseDouble(a.getMinBal());
		System.out.println("Current Balance is :" + d);
		System.out.println("Thank You,Have a Good Day !!");
		System.out.println("");

	}

}
