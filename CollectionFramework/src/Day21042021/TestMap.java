package Day21042021;

import java.util.*;

public class TestMap
{
	public static void main(String[] args) 
	{
		Map<Integer, String> m= new HashMap<>();
		
		m.put(20, "Gaju");   //put(key,value)
		m.put(10, "Shubham");
		m.put(15, "Dhyana");
		m.put(20, "xyz");
		m.put(21, "Gaju");
		
		Set<Integer> keys = m.keySet();
		System.out.println(m);
		
		System.out.println(keys); // 
		
		System.out.println(m.get(10));// Shubham
		
		System.out.println(m.get(20));
		 
		for(int key:keys)
		{
			System.out.println(key);
			String val=m.get(key);
			System.out.println(val);
		}
	}
}
