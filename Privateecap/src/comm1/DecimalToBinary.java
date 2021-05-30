 
package comm1;

import java.util.*;
public class DecimalToBinary {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a number");
	int no=s.nextInt();
	
	int temp=no;
	
	String str="";     
	while(temp!=0)
	{
		int rem=temp%2;
		
		str=rem+str;
		temp=temp/2;
	}
	System.out.println(str);
}
}