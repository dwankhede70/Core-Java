package Day20042021;

import java.util.HashSet;
import java.util.*;

public class Test2 
{
	public static void main(String[] args)
	{
		Set<String> s = new HashSet<>();
		//s.add(10);    // compiler error
		//s.add('a');   // compiler error
		//s.add(10.02); // compiler error
		
		s.add("abc");
		s.add("xyz");
		s.add("pqr");
		s.add("mnl");
		s.add("abc");
		s.add("xyz");
		
		//System.out.println(s.get(0));  compiler error
		
		//System.out.println(s); // [pqr, abc, xyz, mnl] here,insertion order doesn't maintain
//=====================================================================	
//		retrive data by using iterator
		
//		Iterator<String> itr=s.iterator();
//		while(itr.hasNext())
//		{
//			String s2 =itr.next();
//			System.out.println(s2);
//		}
//===================================================================
		
//		retrive data by using for-each loop
		
		for(String s2 : s)
		{
			System.out.println(s2);
		}
		
		
	}
}
