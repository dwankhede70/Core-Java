package com.Array;
//import java.util.Scanner;
//	
//	public class Array
//	{
//		public static void main(String[] args)
//		{
//			
//	  Scanner s = new Scanner(System.in);
//	  System.out.println("enter string");
//	  String array1[]= new String[5];
//	  int l=array1.length;
//	  
//	  for(int i=0;i<l;i++)
//	  	{
//		  array1[i]=s.next();
//	  	}
//		  for(int j=0;j<l;j++)
//		  {
//			  System.out.print(array1[j]+ " "); 
//	  	  }
//	  
//		}
//	}
//
//	
//Scanner s=new Scanner(System.in);
//System.out.println("enter no");
//int n=s.nextInt();
//String s1=String.valueOf(n);
//System.out.println(s1);
//
//}
//}
import java.util.*;
import java.security.*;
public class Array {
public static void main(String[] args) {

DoNotTerminate.forbidExit();

try {
Scanner s = new Scanner(System.in);
System.out.println("enter no");
int n = s.nextInt();
s.close();

//Write your code here
String s1=Integer.toString(n);

if (n==Integer.parseInt(s1)) {
System.out.println("Good job");
} else {
System.out.println("Wrong answer.");
}
} catch (DoNotTerminate.ExitTrappedException e) {
System.out.println("Unsuccessful Termination!!");
}
}
}

//The following class will prevent you from terminating the code using exit(0)!
class DoNotTerminate {

public static class ExitTrappedException extends SecurityException {

private static final long serialVersionUID = 1;
}

public static void forbidExit() {
final SecurityManager securityManager = new SecurityManager() {
@Override
public void checkPermission(Permission permission) {
if (permission.getName().contains("exitVM")) {
 throw new ExitTrappedException();
}
}
};
System.setSecurityManager(securityManager);
}
}


