package comm1;

import java.util.Scanner;

public class B {
	public static void main(String[] args) {
		int a;
		Scanner s = new Scanner (System.in);
		System.out.println("enter no");
		
		 a=s.nextInt();
		
		do
		{
			System.out.println(a);
			a++;
		}
		while (a<=25);
	}

}
