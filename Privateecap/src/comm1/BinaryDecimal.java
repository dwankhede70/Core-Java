package comm1;
import java.util.*;

//public class BinaryDecimal {
//	public static void main(String[] args) {
//		System.out.println(Integer.parseInt("0101", 2));
//		System.out.println(Integer.parseInt("0110", 2));
//		System.out.println(Integer.parseInt("0111", 2));
//		System.out.println(Integer.parseInt("1000", 2));
//		System.out.println(Integer.parseInt("1001", 2));
//	}
//
//}


//public class BinaryDecimal {
//public static void main(String[] args) {
//	 Scanner s=new Scanner(System.in);
//	 System.out.println("Enter a Binary number");
//	 int binary=s.nextInt();
//	 int decimal =0;
//	 int weight=1;
//	 
//	 while(binary !=0)
//	 {
//		 int rem=binary%10;
//		 decimal=decimal +rem*weight;
//		 binary =binary/10;
//		 weight=weight*2;
//		 
//	 }
//	 
//	 System.out.println("Decimal is"+decimal);
//}
//}



	class BinaryDecimal
	{
	public static void main(String args[])
		{
		int binary =1101;
		int n=0;
		int i=0;
		int r;
		while(binary!=0)
		{
		r=binary%10;
		n =(int)  (n+r*Math.pow(2,i));
		binary=binary/10;
		i++;
		}
		System.out.println(n);
		}
	}
	
	

		 
