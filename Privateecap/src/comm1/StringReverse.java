package comm1;
import java.util.*;
public class StringReverse {
public static void main(String[] args) {
	
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a String");
	String s1=s.nextLine();
	
	int x=s1.length();
	int y=s1.length()-1;
	
	for(int i=y;i>=0;i--)
	{
		char c=s1.charAt(i);
		System.out.print(c);
	}
	
}
}
