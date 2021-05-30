package Day20042021;

import java.util.*;

public class Test3 
{
	public static void main(String[] args) {
		
		List <String> l=new ArrayList<>();
		
		l.add("abc");
		l.add("pqr");
		l.add("avg");
		l.add("psr");
		l.add("abc");
		l.add("pqr");
		
		System.out.println(l); //print list l
		
		
		// By using Set interface and Treeset class
		// Duplicate data is removed And Sort the 
		// list data at the same time with the help of  treeset class of set interface
		
		Set<String> s2=new TreeSet<String>(l);
		System.out.println(s2); // print treeset s2
		
	}
	
}
