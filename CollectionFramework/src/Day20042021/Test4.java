package Day20042021;

import java.util.*;

public class Test4 
{
	public static void main(String[] args) {
		
		List <String> l=new ArrayList<>();
		
		l.add("abc");
		l.add("pqr");
		l.add("avg");
		l.add("pqdsr");
		l.add("abc");
		l.add("pqr");
//=======================================================================
		// Print list l1
		System.out.println("Before Sorting ");
		System.out.println(l);
		
//=======================================================================		
		
//		 By using Set interface and Treeset class
//		 Duplicate data is removed And Sort the list data at
//		 the same time with the help of  treeset class of set interface
		
		Set<String> s2=new TreeSet<String>(l);
		System.out.println("Sort using Treeset");
		System.out.println(s2);// print treeset s2
//=======================================================================
//		if we want to sort list with duplicates elements then we used 
//		sort() which is present in Collections utility class.
		
		System.out.println("After Sorting ");
		Collections.sort(l);
		System.out.println(l);
		
	}

}
