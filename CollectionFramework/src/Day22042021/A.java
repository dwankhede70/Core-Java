package Day22042021;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//Q1. What is Map in java? Drow the hierarchy of Map.
//

//Q2. Write the Map program, Add this key and value into the map and     
//retrieve using iterator and for each loop.(with and without generic)
//{aa=abc, bb=pqr, cc=xyz}

public class A 
{
public static void main(String[] args) 
{
System.out.println("===================with Generics========================"); 
	
	Map<String, String> m = new HashMap<>();
	m.put("aa", "Shubham");
	m.put("bb", "Gaju");
	m.put("cc", "Dhanya");
	
	Set<String> keys=m.keySet();
	
	System.out.println(keys);
	 System.out.println("==================");
	
	for(String key:keys)
	{
		System.out.println(key);
		String val=m.get(key);
		System.out.println(val);
		System.out.println("==================");
	}

System.out.println("==================without Generics======================");
	
	Map m1 = new HashMap();
	m1.put("aa", "Shubham");
	m1.put("bb", "Gaju");
	m1.put("cc", "Dhanya");
	
	Set keys1 = m1.keySet();
	
	 System.out.println(keys1);
	 System.out.println("==================");
	
	for(Object key1:keys1)
	{
	 System.out.println(key1);
	 String val1 =  (String) m1.get(key1);
	 System.out.println(val1);
	 System.out.println("==================");

	
}
}
}
































