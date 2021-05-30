package Day20042021;

import java.util.*;

public class Test1 
{
	public static void main(String[] args) 
	{
		List<String> l = new ArrayList<>();
					l.add("aaa");
					l.add("bbb");
					l.add("aaa");
					l.add("ccc");
					l.add("ddd");
					
					System.out.println(l); // dublicates are allowed
					
					Set<String> s= new HashSet<>(l); // dublicates are remove but 
													//insertion order is not maintain
					System.out.println(s);
					
					Set<String> s1=new LinkedHashSet<>(l); // dublicates are remove and 
														   //insertion order is also maintain
					System.out.println(s1);
					
					Collections.sort(l);
					
					System.out.println(l);
					
					
	}
}
