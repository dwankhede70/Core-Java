package comm1;
	//import java.util.Scanner;

import java.util.Scanner;

public class C {
		public static void main(String[] args) {
			//Scanner s = new Scanner (System.in);
			//System.out.println("enter no");
			//int a;
//			 a=s.nextInt();
//			//int a=10;
//			while(a>=1)
//			{
//			System.out.println(a);
//			a--;
//			}
			
//			for(int i=2;i<=20;i=i+2)
//			{
//			System.out.println(i);
//			}
//			================================================================================================================
					
			
			
			//Q.print no series 10,30,50,...190
			
//			for(int i=10;i<=200;i=i+20)
//			{
//			System.out.println(i);
//			}
//			
			//Q.print no series 5,10,15...50
			
//			for(int i=5;i<=50;i=i+5)
//			{
//			System.out.println(i);
//			}
			
//			================================================================================================================
					
			
			//Q.print no series 50,48,46,...0
			
//			for(int i=50;i>=0;i=i-2)
//			{
//			System.out.println(i);
//			}
			
//			================================================================================================================
					
//			for(int i=100;i!=0;i--)
//			{
//				System.out.println(i);
//			}
			
//			================================================================================================================
					
//			Scanner s = new Scanner (System.in);
//			System.out.println("enter no a & b");
//			int a,b;
//			a=s.nextInt();
//			b=s.nextInt();
//			if(a==b)
//			{
//				int c=a+b;
//			System.out.println("Addition is :" +c);
//			}
//			else
//			{
//				int c=a-b;
//			System.out.println("Subtration is :" +c);
//			}
			
//			================================================================================================================
					
//			Scanner s = new Scanner (System.in);
//			System.out.println("enter no");
//			int a,sum=0,d;
//			a=s.nextInt();
//			 while(a!=0)
//			 {
//				 d=a%10;
//				sum=sum+d;
//				a=a/10;
//			 }
//				System.out.println(sum);
//			 
//			================================================================================================================
					
			// count the no in given no
			
//			Scanner s = new Scanner (System.in);
//			System.out.println("enter no");
//			int a=s.nextInt();
//			int count =0;
//			while(a>0)
//			{
//				count= count+1;
//				a=a/10; 
//			}
//			System.out.println(count);
		
//			================================================================================================================
//			Reverse the given no
			
			
//			Scanner s = new Scanner (System.in);
//			System.out.println("enter no");
//			int a=s.nextInt();
//			int rev=0;
//			while(a!=0)
//			{
//				int digit = a%10;
//				rev = rev*10+digit;
//				a/=10;
//			}
//			System.out.println(rev);
//			
//			================================================================================================================
			
			//  WAP whether the enter no is Neon  no or Not
			
//			Scanner s = new Scanner (System.in);
//			System.out.println("enter no");
//			int a=s.nextInt();
//			int square=a*a;
//			int sum=0;
//			 //while(square!=0) 
//			for(sum=0;square!=0;square/=10)
//			 {
//				int d=square%10;
//				sum=sum+d;
//				//square=square/10;
//		     }
//			 if(sum==a)
//			 {
//				 System.out.println("The enter no is Neon no");
//			 }
//			 else
//			 {
//				 System.out.println("The enter no is not Neon no");
//			 }
//			====================================================================================================================		
//			WAP of given no is perfect or not
			
//			Scanner s = new Scanner (System.in);
//			System.out.println("enter no");
//			int n=s.nextInt();
//			int sum=0;
//			for(int i=1;i<n;i++)
//			 {
//				if(n%i==0)
//				sum=sum+i;
//				
//		     }
//			 if(sum==n)
//			 {
//				 System.out.println("The enter no is Perfect no");
//			 }
//			 else
//			 {
//				 System.out.println("The enter no is not Perfect no");
//			 }
//		======================================================================================================			
//           find the factors of enter no
			
//			Scanner s = new Scanner (System.in);
//			System.out.println("enter no");
//			int n=s.nextInt();
//			if(n>0)
//			{
//				System.out.println("the factors of enter no  is ");
//			for(int i=1;i<=n;i++)
//			 {
//				if(n%i==0)
//			
//				 System.out.println(i+ "");
//			 }
//			}
//			 else
//			 {
//				 System.out.println("Invalid no");
//			 }
//			======================================================================================================		
//			for(int i=0;i<=50;i=i+2)
//			{
//
//			System.out.println(i);
//			}
//			======================================================================================================			
//			for(int i=1;i<50;i=i+2)
//			{
//
//			System.out.println(i);
//			}
//			======================================================================================================			

//			for(int i=1;i<100;i++)
//			{
//				if(i%3==0 &&  i%11==0)
//					
//			System.out.println(i);
//			}
			
			
//			for(int i=1;i<=10;i++)
//			{
//				int square=i*i;
//					
//			System.out.println(square);
//			}
//			======================================================================================================
			
			
//			int x=8;
//			
//			 if(x%1==0 && x%x==0)
//			 {
//			 System.out.println("prime no");
//			 }
//			 
//			 else
//			 {
//				 System.out.println("not prime");
//			 }
//				 int sum=0;
//				 int a=0;
//				 int b=1;
//				 System.out.println(a);
//				 System.out.println(b);
//			for(int i=3;i<=7;i++)
//			{
//				 sum = a+b;
//				System.out.println(sum);
//				a=b;
//				b=sum;
//			}
//			======================================================================================================			
//			
//			Scanner s = new Scanner (System.in);
//			System.out.println("enter no");
//			int n;
//			n=s.nextInt();
//			int a=0; int b=1; 
//			int sum = 0;
//			System.out.println(a);
//			System.out.println(b);
//			for(int i=0;sum<n;i++)
//			{		
//				sum=a+b;
//				System.out.println(sum);
//				a=b;
//				b=sum;
//			}
//		
			
//			======================================================================================================			

//			Scanner s = new Scanner (System.in);
//			System.out.println("enter no");
//			int n;
//			n=s.nextInt();
//			int a=0; int b=1; 
//			int sum = 0;
//			System.out.println(a);
//			System.out.println(b);
//			for(int i=0;i<n;i++)
//			{		
//				sum=a+b;
//				System.out.println(sum);
//				a=b;
//				b=sum;
//			}
//			======================================================================================================			
			
//			Scanner s = new Scanner (System.in);
//			System.out.println("enter no");
//			int n;
//			n=s.nextInt();
//			int count=0;
//			for(int i=1;i<=n;i++)
//			
//				if(n%i==0)
//			
//			count++;
//		
//		if(count==2)
//		
//			System.out.println("prime no");
//			
//		
//		else 
//		
//			System.out.println("not prime no");
//		
//		
//			======================================================================================================	
			
			
//			Scanner s = new Scanner (System.in);
//			System.out.println("enter no");
//			int n;
//			int count1=1;
//			n=s.nextInt();
//			for(int i=1;i<=n;i++)
//			{
//				 count1=count1*n;
//			}
//				System.out.println(+count1);
//			}
			
//			======================================================================================================			
			
//			{
//				int n, temp,count=0;
//				Scanner a = new Scanner(System.in);
//				n= a.nextInt();
//				int sum=0;
//				temp= n;
//				while(temp>0)
//				{
//				count=count+1;
//				temp=temp/10;
//				}
//				System.out.println("length of digit:"+count);
//				temp=n;
//				while(temp>0)
//				{
//				int digit = temp%10, pro = 1;
//				for(int i=1; i<=count;i++)
//				pro = pro * digit;
//				sum= sum + pro;
//				temp=temp/10;
//				}
//				if(n==sum)
//				{
//				System.out.println("IS the Armstrong number:" +n);
//				}
//				else
//				{
//				System.out.println("IS not Armstrong number:" +n);
//				}
//				}
//		======================================================================================================				
			
//			
//			Scanner s = new Scanner (System.in);
//			
//			System.out.println("enter base");
//			 int a=s.nextInt();
//			 
//			System.out.println("enter exponent");
//			 int b=s.nextInt();
//			 
//			int result=1;
//			for(int i=b;b!=0;b--)
//			{
//				result = result*a;
//			}
//			System.out.println("calculated power of base is :" +result);
			//======================================================================================================
			
//			Scanner s = new Scanner (S ystem.in);
//			
//			System.out.println("enter first no");
//			 int a=s.nextInt();
//			 
//			System.out.println("enter Second no");
//			 int b=s.nextInt();
//			 
//			System.out.println("enter third no");
//			 int c=s.nextInt();
//			 
//			 if(a<b && a<c)
//				 System.out.println("a is smallest");
//			 
//			 else if (b<a && b<c)
//				 System.out.println("b is smallest");
//			 
//			 else 
//				 System.out.println("c is smallest");
			
//			======================================================================================================
			
//			Scanner s = new Scanner (System.in);
//			System.out.println("enter no");
//			int a=s.nextInt();
//			{
//				int rem=a%5;
//				System.out.println(rem);
//				int quo=a/5;
//				System.out.println(quo);
//			}
//			======================================================================================================
//		
			{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the no");
			int n = s.nextInt();
			int count=0;
			int temp=0;
			int sum=0;
			temp=n;
			while(temp>0)
			{
			count=count+1;
			temp=temp/10;
			}
			System.out.println("count of entered no is :" +count);
			temp=n;
			while(temp>0)
			{
				int dig=temp%10,pro=1;
				{
				for(int i=1;i<=count;i++)
				
				 pro=pro*dig;
				 sum=sum+pro;
				}
				temp=temp/10;
				
			}
				if(n==sum)
				{
				System.out.println("Armstrong No");
				}
				else
				{
				System.out.println("Not an Armstrong No");
				}
			}
	//		}
			
}
}

