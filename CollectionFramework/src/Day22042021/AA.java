package Day22042021;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//Q3. Write the Map program, Add this key and value into the map 
//and retrieve using iterator and for each loop .(with and without generic)
//{1=abc, 2=pqr, 3=xyz}

public class AA {
	public static void main(String[] args) {
//		Map<Integer, String> m = new HashMap<>();
//		m.put(1, "abc");
//		m.put(2, "pqr");
//		m.put(3, "xyz");
//
//		Set<Integer> keys = m.keySet();
//
//		System.out.println(keys);
//		System.out.println("=============================");
//
//		for (Integer key : keys) {
//			System.out.println(key);
//			String val = m.get(key);
//			System.out.println(val);
//			System.out.println("=============================");
//		}
		
//========================================================================
		
		Map m1 = new HashMap();
		m1.put(1, "Shubham");
		m1.put(2, "Gaju");
		m1.put(3, "Dhanya");
		
		Set keys1 = m1.keySet();
		
		System.out.println(keys1);
		System.out.println("=============================");
		
		for(Object key1:keys1)
		{
		System.out.println(key1);
		 String val1 = (String) m1.get(key1);
		 System.out.println(val1);
		 System.out.println("=============================");
		
		
		
	}
}
}
